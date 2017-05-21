package com.piger.jspider.mybatis;

import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by pigercc.liang on 2017/5/21.
 */
public class JspiderDataSourceFactory  {

    public static DataSource getDataSource()
    {
        Properties properties = new Properties();
        properties.setProperty("driver", "com.mysql.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://btsha.com:3306/jspider?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull");
        properties.setProperty("username", "root");
        properties.setProperty("password", "ali20175480");
        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
        pooledDataSourceFactory.setProperties(properties);
        return pooledDataSourceFactory.getDataSource();

    }
}
