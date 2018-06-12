package com.xingxunlei.timebusker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.xingxunlei.timebusker.entity.User;

/**
 * Created by xingmin on 2018/1/2.
 */
public interface UserRepository extends JpaRepository<User, Long>{

    /**
     * 通过用户名查询用户
     *
     * @param name
     * @return
     */
    User findByName(String name);

    /**
     * 通过用户ID查询用户
     *
     * @param id
     * @return
     */
    User findById(String id);
}
