package com.xingxunlei.timebusker.service;

import com.xingxunlei.timebusker.entity.User;

import java.util.List;

/**
 * Created by xingmin on 2018/1/2.
 */
public interface UserService {

    /**
     * 使用ID查询用户
     *
     * @param id
     * @return
     */
    public User findUserById(long id);

    /**
     * 查询所有用户
     *
     * @return
     */
    public List<User> findAllUser();


    /**
     * 更新或新增用户信息
     *
     * @param user
     */
    public void saveAndFlush(User user);

    /**
     * 通过ID删除一个用户
     *
     * @param id
     */
    public void deleteUserById(long id);
}
