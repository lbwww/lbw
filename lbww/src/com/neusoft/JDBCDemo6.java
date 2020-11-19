package com.neusoft;

import com.neusoft.domain.Emp;
import com.neusoft.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo6 {
    public static void main(String[] args) throws Exception {
//        List<Emp> empList = findAll();
        List<Emp> empList = findAll2();
        for (Emp e:empList){
            System.out.println(e);
        }
    }

    public static List<Emp> findAll() throws SQLException, ClassNotFoundException {
        List<Emp> list = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jiangkeda", "root", "root");
        String sql = "select * from emp";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        // 7、处理结果
//        while (rs.next()) {
//            int EMPNO = rs.getInt(1);
//            String ENAME = rs.getString(2);
//            String JOB = rs.getString(3);
//            int MGR = rs.getInt(4);
//            Date HIREDATE = rs.getDate(5);
//            int SAL = rs.getInt(6);
//            int COMM = rs.getInt(7);
//            int DEPTNO = rs.getInt(8);
//
//            System.out.println(EMPNO + "----" + ENAME + "----" + JOB + "----" + MGR + "----" + HIREDATE + "----" + SAL + "----" + COMM + "----" + DEPTNO);
//        }
        while (rs.next()) {
            int EMPNO = rs.getInt(1);
            String ENAME = rs.getString(2);
            String JOB = rs.getString(3);
            int MGR = rs.getInt(4);
            Date HIREDATE = rs.getDate(5);
            int SAL = rs.getInt(6);
            int COMM = rs.getInt(7);
            int DEPTNO = rs.getInt(8);
            Emp emp = new Emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO);
            list.add(emp);
        }
        stmt.close();
        conn.close();
        return  list;

    }
    public static List<Emp> findAll2() throws Exception {
        List<Emp> list = new ArrayList<>();
        Connection conn = JDBCUtils.getConnection();
        String sql = "select * from emp";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        // 7、处理结果
//        while (rs.next()) {
//            int EMPNO = rs.getInt(1);
//            String ENAME = rs.getString(2);
//            String JOB = rs.getString(3);
//            int MGR = rs.getInt(4);
//            Date HIREDATE = rs.getDate(5);
//            int SAL = rs.getInt(6);
//            int COMM = rs.getInt(7);
//            int DEPTNO = rs.getInt(8);
//
//            System.out.println(EMPNO + "----" + ENAME + "----" + JOB + "----" + MGR + "----" + HIREDATE + "----" + SAL + "----" + COMM + "----" + DEPTNO);
//        }
        while (rs.next()) {
            int EMPNO = rs.getInt(1);
            String ENAME = rs.getString(2);
            String JOB = rs.getString(3);
            int MGR = rs.getInt(4);
            Date HIREDATE = rs.getDate(5);
            int SAL = rs.getInt(6);
            int COMM = rs.getInt(7);
            int DEPTNO = rs.getInt(8);
            Emp emp = new Emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO);
            list.add(emp);
        }
        JDBCUtils.close(rs, stmt,conn);
        return  list;
    }
}
