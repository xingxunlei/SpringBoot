package com.xingxunlei.timebusker.repository.one2many;

import com.xingxunlei.timebusker.model.one2many.Employee;
import com.xingxunlei.timebusker.repository.BasicRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by xingmin on 2018/1/2.
 */
public interface EmployeeRepository extends BasicRepository<Employee, Long> {

    @Modifying(clearAutomatically = true)
    @Query("update Employee set empName =?1 where empId =?2")
    void updateName(@Param(value = "name")String name, @Param(value = "id")long id);
}
