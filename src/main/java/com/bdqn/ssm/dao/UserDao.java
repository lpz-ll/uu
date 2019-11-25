package com.bdqn.ssm.dao;

import com.bdqn.ssm.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    //添加
    @Insert("INSERT INTO user(name) VALUES(#{name})")
    void add(String name);
    //删除
    @Delete("DELETE FROM user WHERE id = {id} ")
    void del(Long id);
    //修改
    void update(User user);
    //查询
    User get(Long id);
    //查询全部 llllllllllllllll
    List<User> list();
}
