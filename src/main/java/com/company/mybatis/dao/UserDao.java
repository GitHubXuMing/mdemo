package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.PageVO;
import com.company.mybatis.dao.entity.User;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface UserDao {
    public User findById(Integer id);
    public List<User> findByPage(@Param("start") Integer start,@Param("size") Integer size);
    public List<User> findByPageVO(PageVO pv);
    public List<User> findByName1(@Param("username") String username);
    public List<User> findByName2(@Param("username") String username);
    public int save(User user);
    public int delete(User user);
    public int update(User user);

    public List<User> findByMaxSal(@Param("maxSal") BigDecimal maxSal);

    public int raiseSal(List<Integer> ids);
}
