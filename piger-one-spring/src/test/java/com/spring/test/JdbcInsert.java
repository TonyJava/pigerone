package com.spring.test;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pigercc.liang on 2017/5/18.
 */
public class JdbcInsert {

    private final  static  Logger logger =Logger.getLogger(JdbcInsert.class);

    private final static String jdbcUrl ="jdbc:mysql://192.168.1.161:3306?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
    private final static  String jdbcUsername ="naliworld";
    private final static  String jdbcPassword="password!";



    public static void main2(String[] args) {

        BasicConfigurator.configure();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection =DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);


            List<String> lines =new ArrayList<String>();
            for(String tb:new String[]{"tb_track","tb_track_record"})
            {

//                String sql ="ALTER TABLE ting_content."+tb+"%s \n" +
//                        "modify COLUMN   `is_trailer` int(11)  default '0' ;\n";
//                lines.add(String.format(sql," "));
//                Statement statement =connection.createStatement();
//                statement.execute(String.format(sql," "));
//                statement.close();
                for(int i=0;i<=99;i++)
                {
                    String tmpSql=String.format("update ting_content."+tb+"%s \n" +
                                    "set is_trailer=0 where is_trailer is null;\n"
                            ,i);
                    lines.add(tmpSql);
                    Statement statement1 =connection.createStatement();
                    statement1.execute(tmpSql);
                    statement1.close();
                    System.out.println(tmpSql);
                }

            }

            connection.close();
            FileUtils.writeLines(new File("/Users/nali/Downloads/add_column_is_free_on_tb_track.sql"),lines);


        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        BasicConfigurator.configure();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection =DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);


            List<String> lines =new ArrayList<String>();
            for(String tb:new String[]{"tb_track_set_rich"})
            {
                for(int i=0;i<=99;i++)
                {
                    String tmpSql=String.format("alter table ting_content."+tb+"%s  add column outline text ;\n"
                            ,i);
                    lines.add(tmpSql);
//                    Statement statement1 =connection.createStatement();
//                    statement1.execute(tmpSql);
//                    statement1.close();
                    System.out.println(tmpSql);
                }

            }

            connection.close();
            FileUtils.writeLines(new File("/Users/nali/临时/add_column_outline_on_tb_track_set_rich11.sql"),lines);


        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //TODO 考虑is_free 问题
    //TODO 考虑修改 is_trailer 默认值问题


    public static void exec(String sql)
    {
        Connection connection =null;
        try
        {
            connection =DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);

        }catch (Exception e)
        {

        }finally {

            if(connection !=null)
            {
                try
                {
                    connection.close();
                }catch (Exception e)
                {

                }
            }
        }
    }

}
