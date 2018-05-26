package com.demofly.Mapper;

import com.demofly.mapper.TUserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:context/applicationContext-mybatis.xml"})
public class test {

    @Autowired
    private TUserMapper tUserMapper;

    @Resource
    DataSource dataSource;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void testDatasource(){
        System.out.println(dataSource);
    }

    @Test
    public void testsqlSessionFactory(){
        System.out.println(sqlSessionFactory);
    }

    @Test
    public void testuser(){
        System.out.println(tUserMapper.selectByPrimaryKey(1));
    }
}
