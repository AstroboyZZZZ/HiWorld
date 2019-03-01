package com.zyh.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    public static final SqlSessionFactory SessionFactory;
//    static代码块在程序中只加载一次
    static {
    //    1.创建SqlSessionFactoryBuilder
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//    2.加载配置文件
    InputStream Stream = null;
    try {
        Stream = Resources.getResourceAsStream("SqlMappingConfig.xml");
    } catch (IOException e) {
        e.printStackTrace();
    }
//     3.创建SqlSessionFactory对象
    SessionFactory = sqlSessionFactoryBuilder.build(Stream);

    }

    public static SqlSession getSqlSession(){
        return SessionFactory.openSession();
    }
}
