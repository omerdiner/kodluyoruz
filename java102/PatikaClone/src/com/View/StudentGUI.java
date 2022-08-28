package com.View;

import com.Helper.Config;
import com.Helper.Helper;

import javax.swing.*;

public class StudentGUI extends JFrame {

    private JPanel wrapper;

    public StudentGUI() {
        add(wrapper);
        setSize(600, 800);
        setLocation(Helper.screenCenterPosition("x", getSize()), Helper.screenCenterPosition("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}
