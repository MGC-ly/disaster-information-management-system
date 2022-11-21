package com.example.bmgl;

import java.sql.*;

public class decodelocation {
     static String decode_location(String addresscode) throws SQLException, ClassNotFoundException {
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //3.获取连接 （连接的数据库名是db2，第二个第三个参数是连接数据库的用户名密码）
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/地址信息编码","root","13984506631");

        //4.获取执行者对象 （statement：表现，声明，跟程序意思不匹配）
        Statement stat = conn.createStatement();

        //5.执行sql语句，并且接收结果

        String sql = "SELECT azaa0002 FROM AD01 ";
        ResultSet rs = stat.executeQuery(sql); //execute执行，query：查询，resultset：结果集

        //6.处理结果
        while(rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
        }

        //7.释放资源
        conn.close();
        stat.close();
        conn.close();
        return sql;
    }

}
