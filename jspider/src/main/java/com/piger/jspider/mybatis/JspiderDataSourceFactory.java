package com.piger.jspider.mybatis;

import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * Created by pigercc.liang on 2017/5/21.
 */
public class JspiderDataSourceFactory  {

    public static DataSource getDataSource() throws Exception {
        //TODO 账号密码放到类里，同时不提交到github上
        Properties properties = new Properties();
        properties.load(JspiderDataSourceFactory.class.getClassLoader().getResourceAsStream("jdbc.property"));
        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
        pooledDataSourceFactory.setProperties(properties);
        return pooledDataSourceFactory.getDataSource();

    }
}
