package test;

import java.sql.*;

public class DBTest {
    //mysql驱动包名
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    //数据库连接地址
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC";
    //用户名
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "rootroot";
    public static void main(String[] args){
        Connection connection = null;
        try {
            //加载mysql的驱动类
            Class.forName(DRIVER_NAME);
            //获取数据库连接
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            //mysql查询语句
            String category = "1";
            String sql = "SELECT * FROM animal WHERE 1 = 1";
            String age = "or '1'='1'";

            sql += category == null ? "" : " AND CATEGORY = ?";
            sql += age == null ? "" : " AND age = ?";
             System.out.println(sql);
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setObject(1, category);
            ps.setObject(2, age);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}