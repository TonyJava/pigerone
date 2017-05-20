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
@RunWith(SpringJUnit4ClassRunner.class)
public class JdbcInsert {

    private final  static  Logger logger =Logger.getLogger(JdbcInsert.class);

    private final static String jdbcUrl ="jdbc:mysql://192.168.1.161:3306?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
    private final static  String jdbcUsername ="naliworld";
    private final static  String jdbcPassword="password!";

    private final static  String sql=" ALTER TABLE `ting_content`.`%s`\n" +
            "            ADD COLUMN `is_video` TINYINT(1) NULL DEFAULT '0' AFTER `offline_reason`,\n" +
            "            ADD COLUMN `is_draft` TINYINT(1) NULL DEFAULT '0' AFTER `is_video`;";

    public static void main(String[] args) {

        BasicConfigurator.configure();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection =DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);


            List<String> lines =new ArrayList<String>();
            for(String tb:new String[]{"tb_track","tb_album","tb_track_set","tb_track_record"})
            {
                for(int i=0;i<=100;i++)
                {
                    String tmpSql=null;
                    if(i ==100)
                    {
                        tmpSql=String.format(sql,tb);
                    }else
                    {
                        tmpSql=String.format(sql,tb+i);
                    }

                    lines.add(tmpSql);
                    try
                    {
                        Statement statement =connection.createStatement();
                        statement.execute(tmpSql);
                        statement.close();

                    }catch (Exception e)
                    {
                        logger.error(tmpSql);
                    }

                }
            }
            FileUtils.writeLines(new File("/Users/nali/Downloads/draft.sql"),lines);


        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
