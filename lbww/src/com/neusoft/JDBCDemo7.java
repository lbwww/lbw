package com.neusoft;

import com.neusoft.utils.JDBCUtils;

import java.sql.Connection;
import java.util.Scanner;

public class JDBCDemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎");
        System.out.println("输入账号");
        String username = scanner.next();
        System.out.println("输入密码");
        String password = scanner.next();

        boolean flag = login(username, password);
        if (flag) {
            System.out.println("欢迎");
        } else {
            System.out.println("错误");
        }

    }
        public static  boolean login(String username, String password){
            if (username == null || password == null){
                return false;
            }
            Connection conn = null;
            try {
                 conn = JDBCUtils.getConnection();
                 String sql = "select * froom user where " +
                         "username ='"username"' and password='"+password+"'";
                System.out.println(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }


}
