package com.View;

import com.Helper.Config;
import com.Helper.Helper;
import com.Helper.Item;
import com.Model.Course;
import com.Model.Operator;
import com.Model.Patika;
import com.Model.User;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_userList;
    private JScrollPane scrl_userList;
    private JTable tbl_userList;
    private JPanel pnl_userform;
    private JTextField fld_user_name;
    private JTextField flduser_username;
    private JTextField fld_userpassword;
    private JComboBox cmb_usertype;
    private JButton btn_addUser;
    private JTextField fld_userId;
    private JButton btn_deleteUser;
    private JTextField fld_search_user_name;
    private JTextField fld_search_user_username;
    private JComboBox fld_cmb_search_type;
    private JButton btn_userSearch;
    private JPanel pnl_patikas;
    private JScrollPane csrl_patika_list;
    private JTable tbl_patika_list;
    private JPanel pnl_add_patika;
    private JTextField fld_patika_name;
    private JButton btn_add_patika;
    private JPanel pnl_courses;
    private JScrollPane scrl_course_list;
    private JTable tbl_course_list;
    private JPanel pnl_course_add;
    private JTextField fld_course_name;
    private JTextField fld_course_lang;
    private JComboBox cmb_course_patikas;
    private JComboBox cmb_course_educator;
    private JButton btn_course_add;
    private final Operator operator;
    private DefaultTableModel mdl_userList;
    private Object[] rowUserList;
    private DefaultTableModel mdl_patikaList;
    private Object[] rowPatikaList;
    private JPopupMenu patika_menu;
    private DefaultTableModel mdl_courseList;
    private Object[] rowCourseList;

    public OperatorGUI(Operator operator) {
        this.operator = operator;

        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterPosition("x", getSize());
        int y = Helper.screenCenterPosition("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        lbl_welcome.setText(operator.getName() + " Hoşgeldin!");

        mdl_userList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_user_list = {"id", "Ad", "Kullanıcı Adı", "Şifre", "Tip"};
        rowUserList = new Object[col_user_list.length];

        mdl_userList.setColumnIdentifiers(col_user_list);
        tbl_userList.setModel(mdl_userList);
        tbl_userList.getTableHeader().setReorderingAllowed(false);
        tbl_userList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String selected_user_id = tbl_userList.getSelectedRow() != -1 ? tbl_userList.getValueAt(tbl_userList.getSelectedRow(), 0).toString() : null;
                fld_userId.setText(selected_user_id);
            }
        });
        tbl_userList.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    String selected_user_id = tbl_userList.getSelectedRow() != -1 ? tbl_userList.getValueAt(tbl_userList.getSelectedRow(), 0).toString() : null;
                    int id = Integer.parseInt(selected_user_id);
                    String name = tbl_userList.getSelectedRow() != -1 ? tbl_userList.getValueAt(tbl_userList.getSelectedRow(), 1).toString() : null;
                    String username = tbl_userList.getSelectedRow() != -1 ? tbl_userList.getValueAt(tbl_userList.getSelectedRow(), 2).toString() : null;
                    String password = tbl_userList.getSelectedRow() != -1 ? tbl_userList.getValueAt(tbl_userList.getSelectedRow(), 3).toString() : null;
                    String type = tbl_userList.getSelectedRow() != -1 ? tbl_userList.getValueAt(tbl_userList.getSelectedRow(), 4).toString() : null;

                    if (User.Update(id, name, username, password, type)) {
                        Helper.showMessage("Güncellendi");

                    }
                    loadUserModel();
                    loadEducatorsIntoCombobox();
                    loadCourseModel();
                }
            }
        });


        patika_menu = new JPopupMenu();
        JMenuItem update = new JMenuItem("Güncelle");
        JMenuItem delete = new JMenuItem("Sil");
        patika_menu.add(update);
        patika_menu.add(delete);

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedId = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(), 0).toString());
                UpdatePatikaGUI updatePatikaGUI = new UpdatePatikaGUI(Patika.getFetch(selectedId));
                updatePatikaGUI.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        loadPatikaModel();
                        loadCoursesIntoCombobox();
                        loadCourseModel();
                    }
                });
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.confirm()) {
                    int selectedId = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(), 0).toString());
                    if (Patika.delete(selectedId)) {
                        Helper.showMessage("Patika silindi");
                        loadCoursesIntoCombobox();
                        loadPatikaModel();
                        loadCourseModel();
                    } else {
                        Helper.showMessage("Hata");
                    }

                }

            }
        });

        mdl_patikaList = new DefaultTableModel();

        Object[] col_patika_list = {"ID", "Patika Adı"};
        mdl_patikaList.setColumnIdentifiers(col_patika_list);
        rowPatikaList = new Object[col_patika_list.length];
        loadPatikaModel();

        tbl_patika_list.setModel(mdl_patikaList);
        tbl_patika_list.setComponentPopupMenu(patika_menu);
        tbl_patika_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int selectedRow = tbl_patika_list.rowAtPoint(point);
                tbl_patika_list.setRowSelectionInterval(selectedRow, selectedRow);

            }
        });
        tbl_patika_list.getTableHeader().setReorderingAllowed(false);
        tbl_patika_list.getColumnModel().getColumn(0).setMaxWidth(100);
        loadUserModel();

        mdl_courseList = new DefaultTableModel();
        Object[] col_courseList = {"ID", "Ders Adı", "Programlama Dili", "Patika", "Eğitmen"};
        mdl_courseList.setColumnIdentifiers(col_courseList);
        rowCourseList = new Object[col_courseList.length];
        tbl_course_list.setModel(mdl_courseList);
        tbl_course_list.getColumnModel().getColumn(0).setMaxWidth(75);
        tbl_course_list.getTableHeader().setReorderingAllowed(false);
        loadCourseModel();

        loadCoursesIntoCombobox();
        loadEducatorsIntoCombobox();


        btn_addUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fld_user_name) || Helper.isFieldEmpty(fld_userpassword) || Helper.isFieldEmpty(flduser_username)) {
                    Helper.showMessage("Boş alan bırakmayın");
                } else {
                    String name = fld_user_name.getText();
                    String username = flduser_username.getText();
                    String password = fld_userpassword.getText();
                    String type = cmb_usertype.getSelectedItem().toString();

                    if (User.add(name, username, password, type)) {
                        Helper.showMessage("Başarılı");
                        loadUserModel();
                        loadEducatorsIntoCombobox();
                        flduser_username.setText(null);
                        fld_userpassword.setText(null);
                        fld_user_name.setText(null);
                    }
                }
            }
        });
        btn_deleteUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fld_userId)) {
                    Helper.showMessage("Id alanı boş.");
                } else {
                    if (Helper.confirm()) {
                        int id = Integer.parseInt(fld_userId.getText());
                        if (User.delete(id)) {
                            Helper.showMessage("Kullanıcı silindi.");
                            loadUserModel();
                            loadEducatorsIntoCombobox();
                            loadCourseModel();
                            fld_userId.setText(null);
                        } else {
                            Helper.showMessage("Hata");
                        }
                    }

                }
            }
        });
        btn_userSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fld_search_user_name.getText();
                String username = fld_search_user_username.getText();
                String type = fld_cmb_search_type.getSelectedItem().toString();
                String query = User.makeSearchQuery(name, username, type);
                ArrayList<User> searchResultUserList = User.searchUserList(query);
                loadUserModel(searchResultUserList);
            }
        });
        btn_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginGUI loginGUI = new LoginGUI();
            }
        });
        btn_add_patika.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fld_patika_name)) {
                    Helper.showMessage("Patika ismi giriniz.");
                } else {
                    if (Patika.add(fld_patika_name.getText())) {
                        Helper.showMessage("Patika eklendi.");
                        loadCoursesIntoCombobox();
                        loadPatikaModel();
                        fld_patika_name.setText(null);
                    } else {
                        Helper.showMessage("Patika eklenemedi.");
                    }
                }
            }
        });
        btn_course_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Item patikaItem = (Item) cmb_course_patikas.getSelectedItem();
                Item userItem = (Item) cmb_course_educator.getSelectedItem();
                if (Helper.isFieldEmpty(fld_course_name) || Helper.isFieldEmpty(fld_course_lang)) {
                    Helper.showMessage("Boş alan bırakmayın.");
                } else {
                    if (Course.add(userItem.getKey(), patikaItem.getKey(), fld_course_name.getText(), fld_course_lang.getText())) {
                        Helper.showMessage("Eklendi");
                        fld_course_name.setText(null);
                        fld_course_lang.setText(null);
                        loadCourseModel();
                    } else {
                        Helper.showMessage("Hata");
                    }
                }
            }
        });
    }

    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_course_list.getModel();
        clearModel.setRowCount(0);
        for (Course object : Course.getList()) {
            rowCourseList[0] = object.getId();
            rowCourseList[1] = object.getName();
            rowCourseList[3] = object.getPatika().getName();
            rowCourseList[4] = object.getEducator().getName();
            rowCourseList[2] = object.getLanguage();
            mdl_courseList.addRow(rowCourseList);
        }
    }

    private void loadPatikaModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patika_list.getModel();
        clearModel.setRowCount(0);
        for (Patika object : Patika.getList()) {
            rowPatikaList[0] = object.getId();
            rowPatikaList[1] = object.getName();
            mdl_patikaList.addRow(rowPatikaList);
        }
    }

    public void loadUserModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userList.getModel();
        clearModel.setRowCount(0);
        for (User obj : User.getList()) {

            rowUserList[0] = obj.getId();
            rowUserList[1] = obj.getName();
            rowUserList[2] = obj.getUsername();
            rowUserList[3] = obj.getPassword();
            rowUserList[4] = obj.getType();
            mdl_userList.addRow(rowUserList);
        }
    }

    public void loadUserModel(ArrayList<User> list) {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userList.getModel();
        clearModel.setRowCount(0);
        for (User obj : list) {

            rowUserList[0] = obj.getId();
            rowUserList[1] = obj.getName();
            rowUserList[2] = obj.getUsername();
            rowUserList[3] = obj.getPassword();
            rowUserList[4] = obj.getType();
            mdl_userList.addRow(rowUserList);
        }
    }

    public void loadCoursesIntoCombobox() {
        cmb_course_patikas.removeAllItems();
        for (Patika patika : Patika.getList()) {
            cmb_course_patikas.addItem(new Item(patika.getId(), patika.getName()));
        }
    }

    public void loadEducatorsIntoCombobox() {
        cmb_course_educator.removeAllItems();
        for (User user : User.getEducatorList()) {
            cmb_course_educator.addItem(new Item(user.getId(), user.getName()));
        }
    }

    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator(1, "Ömer", "omer", "1234", "operator");
        OperatorGUI operatorGUI = new OperatorGUI(op);

    }
}
