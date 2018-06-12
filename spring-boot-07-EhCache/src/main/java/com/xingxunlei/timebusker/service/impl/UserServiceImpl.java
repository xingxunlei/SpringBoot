package com.xingxunlei.timebusker.service.impl;

import com.xingxunlei.timebusker.dao.UserRepository;
import com.xingxunlei.timebusker.entity.User;
import com.xingxunlei.timebusker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xingmin on 2018/1/2.
 */
@Service
@CacheConfig(cacheNames = "user-cache")
public class UserServiceImpl implements UserService {

    public static final String CACHE_KEY = "USERS_CACHE_KEY";

    @Autowired
    UserRepository repository;

    /**
     * 使用ID查询用户
     *
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = {})
    public User findUserById(long id) {
        User u = repository.findOne(id);
        return u;
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    @Cacheable
    public List<User> findAllUser() {
        List<User> list = repository.findAll();
        return list;
    }

    /**
     * 更新或者新增用户信息
     *
     * @param user
     */
    @Override
    @CachePut
    public void saveAndFlush(User user) {
        repository.saveAndFlush(user);
    }

    /**
     * 通过ID删除一个用户
     *
     * @param id
     */
    @Override
    @CacheEvict
    public void deleteUserById(long id) {
        repository.delete(id);
    }
}
