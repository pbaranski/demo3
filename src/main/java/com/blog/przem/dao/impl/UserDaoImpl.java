package com.blog.przem.dao.impl;


import com.blog.przem.dao.UserDao;
import com.blog.przem.entity.User;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, String> implements UserDao {

    protected UserDaoImpl() {
        super(User.class);
    }

    @Override
  public void saveUser(User user) {
    saveOrUpdate(user);
}

    @Override
    public List<User> findUsers(String userName) {
        return findByCriteria(Restrictions.like("userName", userName, MatchMode.START));
    }
}