package com.xuanzhe.dao;

import com.xuanzhe.pojo.User;
import com.xuanzhe.utils.MybatisUtils;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {
  @Test
  public void test(){
    SqlSession sqlSesstion = MybatisUtils.getSqlSesstion();
    UserMapper mapper = sqlSesstion.getMapper(UserMapper.class);
    List<User> userList = mapper.getUserList();
    for(User user:userList){
      System.out.println(user);
    }
    sqlSesstion.close();
  }

  @Test
  public void test2(){
    SqlSession sqlSesstion = MybatisUtils.getSqlSesstion();
    UserMapper mapper = sqlSesstion.getMapper(UserMapper.class);
    User user = mapper.getUserById(1);
    System.out.println(user.toString());
    sqlSesstion.close();
  }

  @Test
  public void test3(){
    SqlSession sqlSesstion = MybatisUtils.getSqlSesstion();
    UserMapper mapper = sqlSesstion.getMapper(UserMapper.class);
    mapper.addUser(new User(4, "juju", "12345"));
    sqlSesstion.commit();
    sqlSesstion.close();
  }
  @Test
  public void Test4(){
    SqlSession sqlSesstion = MybatisUtils.getSqlSesstion();
    UserMapper mapper = sqlSesstion.getMapper(UserMapper.class);
    mapper.updateUser(new User(1,"XIAXUANZHE","654321"));
    sqlSesstion.commit();
    sqlSesstion.close();
  }

  @Test
  public void Test5(){
    SqlSession sqlSesstion = MybatisUtils.getSqlSesstion();
    UserMapper mapper = sqlSesstion.getMapper(UserMapper.class);
    mapper.deleteUser(5);
    sqlSesstion.commit();
    sqlSesstion.close();
  }
}
