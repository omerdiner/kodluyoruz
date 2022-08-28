package com.Model;

import com.Helper.DBConnector;
import com.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String type;

    public User(int id, String name, String username, String password, String type) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public User() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<User> getList() {
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * FROM user";
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String username = resultSet.getString("username");
                String type = resultSet.getString("type");
                String password = resultSet.getString("password");
                userList.add(new User(id, name, username, password, type));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public static ArrayList<User> getEducatorList() {
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * FROM user WHERE type='educator'";
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String username = resultSet.getString("username");
                String type = resultSet.getString("type");
                String password = resultSet.getString("password");
                userList.add(new User(id, name, username, password, type));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }


    public static boolean add(String name, String username, String password, String type) {
        User findUser = getFetchByUsername(username);
        if (findUser != null) {
            Helper.showMessage("Bu kullanıcı adına sahip bir hesap var.");
            return false;
        }

        String query = "INSERT INTO user (name,username,password,type) VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, type);
            int response = preparedStatement.executeUpdate();
            if (response == -1) {
                Helper.showMessage("Hata!");
            }
            return response != -1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean delete(int id) {
        String query = "DELETE  FROM user WHERE id=?";
        try {
            ArrayList<Course> courses = Course.getListByUser(id);
            for (Course course : courses) {
                Course.delete(course.getId());
            }
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() != -1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;


    }

    public static boolean Update(int id, String name, String username, String password, String type) {
        ArrayList<String> types = new ArrayList<>();
        types.add("operator");
        types.add("student");
        types.add("educator");
        if (!types.contains(type)) {
            Helper.showMessage("Kullanıcı tipi yanlış girili.");
            return false;
        }
        User findUser = getFetchByUsername(username);
        if (findUser != null && findUser.getId() != id) {
            Helper.showMessage("Bu kullanıcı adına sahip bir hesap var.");
            return false;
        }
        String query = "UPDATE User SET name=?, username=? ,password=?, type=? WHERE ID=?";
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, type);
            preparedStatement.setInt(5, id);
            return preparedStatement.executeUpdate() != -1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static User getFetchByUsername(String username) {
        User object = null;

        String query = "SELECT * FROM user WHERE username = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String user_name = resultSet.getString("username");
                String type = resultSet.getString("type");
                String password = resultSet.getString("password");
                object = new User(id, name, user_name, password, type);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return object;
    }

    public static User getFetchByUsernameAndPassword(String username, String password) {
        User object = null;

        String query = "SELECT * FROM user WHERE username = ? and password=?";
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String user_name = resultSet.getString("username");
                String type = resultSet.getString("type");
                switch (type) {
                    case "operator":
                        object = new Operator();
                        break;
                    default:
                        object = new User();
                }
                object.setId(id);
                object.setPassword(password);
                object.setUsername(username);
                object.setType(type);
                object.setName(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return object;
    }

    public static User getFetchById(int id) {
        User object = null;

        String query = "SELECT * FROM user WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                String name = resultSet.getString("name");
                String user_name = resultSet.getString("username");
                String type = resultSet.getString("type");
                String password = resultSet.getString("password");
                object = new User(id, name, user_name, password, type);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return object;
    }

    public static ArrayList<User> searchUserList(String searchQuery) {
        ArrayList<User> userList = new ArrayList<>();
        ;
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(searchQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String username = resultSet.getString("username");
                String type = resultSet.getString("type");
                String password = resultSet.getString("password");
                userList.add(new User(id, name, username, password, type));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public static String makeSearchQuery(String name, String username, String type) {
        String query = "SELECT * FROM User WHERE name LIKE  '%{{name}}%' AND username LIKE '%{{username}}%' ";

        query = query.replace("{{name}}", name);
        query = query.replace("{{username}}", username);
        if (!type.isEmpty()) {
            query += " AND type='{{type}}'";
            query = query.replace("{{type}}", type);
        }


        return query;

    }
}
