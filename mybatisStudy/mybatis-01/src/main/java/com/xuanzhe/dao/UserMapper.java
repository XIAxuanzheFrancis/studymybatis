package com.xuanzhe.dao;

import com.xuanzhe.pojo.User;
import java.util.List;
import javax.jws.soap.SOAPBinding.Use;

public interface UserMapper {
  List<User> getUserList();
  User getUserById(int id);
  int addUser(User user);
  int updateUser(User user);
  int deleteUser(int id);
}
