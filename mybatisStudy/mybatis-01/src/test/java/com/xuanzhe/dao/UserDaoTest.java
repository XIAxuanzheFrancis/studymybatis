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
    UserDao mapper = sqlSesstion.getMapper(UserDao.class);
    List<User> userList = mapper.getUserList();
    for(User user:userList){
      System.out.println(user);
    }
    sqlSesstion.close();
  }
}
