package com;

import javax.swing.*;
import java.awt.*;

public class deneme extends JFrame{
    private JPanel wrapper;
    private JPanel top;
    private JPanel bottom;
    private JTextField fieldUserName;
    private JPasswordField passwordField;
    private JButton Enter;

    public deneme(){
        for(UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                finally {
                    break;
                }
            }
        }
        add(wrapper);
        setSize(450,300);
        setTitle("Hey");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int x= (Toolkit.getDefaultToolkit().getScreenSize().width-getSize().width)/2;
        int y= (Toolkit.getDefaultToolkit().getScreenSize().height-getSize().height)/2;
        setLocation(x,y);
        setResizable(false);
        setVisible(true);
        Enter.addActionListener(e -> {
            if(fieldUserName.getText().length()==0||passwordField.getText().length()==0){
                JOptionPane.showMessageDialog(null,"Enter all the fields.","Error",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
  /*  public static void main(String[] args) {
        JFrame frame = new JFrame("deneme");
        frame.setContentPane(new deneme().wrapper);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/
}
