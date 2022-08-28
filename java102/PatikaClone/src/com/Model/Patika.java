package com.Model;

import com.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Patika {
    private int id;
    private String name;

    public Patika(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Patika> getList() {
        ArrayList<Patika> list = new ArrayList<>();
        Patika object;

        try {
            String query = "SELECT * FROM patika";
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                object = new Patika(rs.getInt("id"), rs.getString("name"));
                list.add(object);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static boolean add(String name) {
        String query = "INSERT INTO patika (name) VALUES(?)";
        try {
            PreparedStatement pr = DBConnector.getConnection().prepareStatement(query);
            pr.setString(1, name);
            return pr.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean update(int id, String name) {
        String query = "UPDATE patika SET name = ? WHERE id= ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            return preparedStatement.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static Patika getFetch(int id) {
        Patika object = null;

        try {
            String query = "SELECT * FROM patika WHERE id =" + id;
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                object = new Patika(rs.getInt("id"), rs.getString("name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM patika WHERE id=?";
        PreparedStatement preparedStatement = null;
        ArrayList<Course> courses = Course.getList();
        for (Course course : courses) {
            if (course.getPatika().getId() == id) {
                Course.delete(course.getId());
            }
        }
        try {
            preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() != -1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;

    }
}
