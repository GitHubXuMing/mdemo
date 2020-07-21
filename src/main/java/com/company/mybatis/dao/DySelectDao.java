package com.company.mybatis.dao;

import com.company.mybatis.dao.entity.QueryVO;
import com.company.mybatis.dao.entity.User;

import java.util.List;

public interface DySelectDao {
    public List<User> dynamicSelect(QueryVO qv);
}
