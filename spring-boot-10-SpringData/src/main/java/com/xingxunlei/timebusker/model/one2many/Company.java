package com.xingxunlei.timebusker.model.one2many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * 公司表
 * Created by xingmin on 2018/1/2.
 */
@Entity
@Table(name = "t_company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long comId;

    @Column(nullable = false, length = 32)
    private String comName;

    @OneToMany(mappedBy="company")
    private List<Department> department;
}
