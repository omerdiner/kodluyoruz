package com.View;

import com.Helper.Config;
import com.Helper.Helper;
import com.Model.Patika;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdatePatikaGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_patika_name;
    private JButton btn_update;
    private Patika patika;
   public UpdatePatikaGUI(Patika patika){
       this.patika=patika;
       add(wrapper);
       setSize(300,140);
       setLocation(Helper.screenCenterPosition("x",getSize()),Helper.screenCenterPosition("y",getSize()));
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       setTitle(Config.PROJECT_TITLE);
       setVisible(true);
       fld_patika_name.setText(patika.getName());

       btn_update.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if(Helper.isFieldEmpty(fld_patika_name)){
                   Helper.showMessage("Patika ismi boş.");
               }else{
                   if(Patika.update(patika.getId(),fld_patika_name.getText())){
                       Helper.showMessage("Güncellendi.");
                   }else{
                       Helper.showMessage("Hata");
                   }
                   dispose();
               }
           }
       });
   }


}
