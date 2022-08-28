package com.Model;

import com.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Course {
    private int id;
    private int user_id;
    private int patika_id;
    private String name;
    private String language;

    private Patika patika;
    private User educator;

    public Course(int id, int user_id, int patika_id, String name, String language) {
        this.id = id;
        this.user_id = user_id;
        this.patika_id = patika_id;
        this.name = name;
        this.language = language;
        this.patika = Patika.getFetch(patika_id);
        this.educator = User.getFetchById(user_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPatika_id() {
        return patika_id;
    }

    public void setPatika_id(int patika_id) {
        this.patika_id = patika_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Patika getPatika() {
        return patika;
    }

    public void setPatika(Patika patika) {
        this.patika = patika;
    }

    public User getEducator() {
        return educator;
    }

    public void setEducator(User educator) {
        this.educator = educator;
    }

    public static ArrayList<Course> getList() {
        ArrayList<Course> courses = new ArrayList<>();


        try {
            String query = "SELECT * FROM course";
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                int user_id = rs.getInt("user_id");
                int patika_id = rs.getInt("patika_id");
                String name = rs.getString("name");
                String language = rs.getString("language");
                courses.add(new Course(id, user_id, patika_id, name, language));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;

    }
    public static boolean delete(int id) {
        String query = "DELETE  FROM course WHERE id=?";
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() != -1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;


    }
    public static ArrayList<Course> getListByUser(int ID) {
        ArrayList<Course> courses = new ArrayList<>();


        try {
            String query = "SELECT * FROM course where user_id="+ID;
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                int user_id = rs.getInt("user_id");
                int patika_id = rs.getInt("patika_id");
                String name = rs.getString("name");
                String language = rs.getString("language");
                courses.add(new Course(id, user_id, patika_id, name, language));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;

    }
    public static boolean add(int user_id,int patika_id,String name,String language){
        String query="INSERT INTO course (user_id,patika_id,name,language) VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement=DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setInt(1,user_id);
            preparedStatement.setInt(2,patika_id);
            preparedStatement.setString(3,name);
            preparedStatement.setString(4,language);

            return preparedStatement.executeUpdate()!=-1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
