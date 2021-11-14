package com.yym.dao;

import com.yym.domain.User;

import java.util.List;


public interface userMapper {
    List<User> fandAll(User user);

    User fandByuser(User user);

    List<User> fandByIds(List<Long> list);
}
