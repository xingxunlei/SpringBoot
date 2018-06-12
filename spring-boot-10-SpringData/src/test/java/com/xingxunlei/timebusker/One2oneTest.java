package com.xingxunlei.timebusker;

import com.xingxunlei.timebusker.model.one2one.Address;
import com.xingxunlei.timebusker.model.one2one.User;
import com.xingxunlei.timebusker.repository.one2one.AddressRepository;
import com.xingxunlei.timebusker.repository.one2one.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by xingmin on 2018/1/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
@ActiveProfiles("dev")
public class One2oneTest {

    @Resource
    AddressRepository addressrepo;

    @Resource
    UserRepository userrepo;

    /**
     * 单独保存user
     * success()
     */
    @Test
    public void test1() throws Exception {
        User u = new User("aaa");
        userrepo.save(u);
    }

    /**
     * 单独保存address
     * failure: attempted to assign id from null one-to-one property [com.xingxunlei.timebusker.model.one2one.Address.user]
     */
    @Test
    public void test2() {
        Address address = new Address("一二一大街", "昆明市");
        addressrepo.save(address);
    }
}
