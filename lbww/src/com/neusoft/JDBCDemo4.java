package com.neusoft;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC连接mysql示例
 */

public class JDBCDemo4 {
    public static void main(String[] args) throws Exception{
        // 1、导入驱动jar包, 建立libs文件夹， 右键 add as library
        // 2、 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 3、获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jiangkeda","root","root");
        // 4、定义sql
        String sql = "select * from account";
        // 5、获取数据库连接对象statement
        Statement stmt = conn.createStatement();
        // 6、执行sql
        ResultSet rs = stmt.executeQuery(sql);
        // 7、处理结果
        while (rs.next()) {
            int columnlndex;
            int id = rs.getInt("ID");
            String name = rs.getString("NAME");
            double balance = rs.getDouble("balance");
            System.out.println(id + "----" + name + "----" + balance);
        }
        // 8、释放资源
        stmt.close();
        conn.close();
    }
}