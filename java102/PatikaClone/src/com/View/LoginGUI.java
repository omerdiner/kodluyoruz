package com.View;

import com.Helper.Config;
import com.Helper.Helper;
import com.Model.Operator;
import com.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends  JFrame{
    private JPanel wrapper;
    private JPanel bottom;
    private JPanel top;
    private JTextField fld_username;
    private JPasswordField fld_password;
    private JButton btn_login;

    public LoginGUI(){
        add(wrapper);
        setSize(600,800);
        setLocation(Helper.screenCenterPosition("x",getSize()),Helper.screenCenterPosition("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Helper.isFieldEmpty(fld_username)||Helper.isFieldEmpty(fld_password)){
                    Helper.showMessage("Kullanıcı adı veya parola girilmemiş");
                }else{
                    User user= User.getFetchByUsernameAndPassword(fld_username.getText(),fld_password.getText());
                           if(user==null){
                               Helper.showMessage("Kullanıcı bulunamadı.");
                           }else{
                               switch (user.getType()){
                                   case "operator":OperatorGUI operatorGUI=new OperatorGUI((Operator) user);
                                   break;
                                   case "educator":EducatorGUI educatorGUI=new EducatorGUI();
                                   break;
                                   case "student":StudentGUI studentGUI=new StudentGUI();
                                   break;
                               }
                               dispose();
                           }
                    }
                }

        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI=new LoginGUI();
    }
}
