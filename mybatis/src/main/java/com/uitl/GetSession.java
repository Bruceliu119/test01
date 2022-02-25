package com.uitl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetSession {
     private static   SqlSessionFactory factory;
    static{
        String config="mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
             factory= new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  SqlSession getSqlSession(){
        SqlSession session=null;
        if (factory != null) {
            session = factory.openSession();
        }
        return session;
    }
}
