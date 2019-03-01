package com.zyh.test;

import com.zyh.mapper.CustomerMapper;
import com.zyh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        创建mapper，动态代理
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
//      可以通过注解@param来自定义key
         mapper.queryCustomerById(2,"李白");

         sqlSession.close();
    }
}
