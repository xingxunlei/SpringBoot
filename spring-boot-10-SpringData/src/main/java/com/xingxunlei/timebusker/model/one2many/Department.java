package com.xingxunlei.timebusker.model.one2many;

import javax.persistence.*;
import java.util.List;

/**
 * 部门表
 * Created by xingmin on 2018/1/2.
 */
@Entity
@Table(name = "t_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long depId;

    @Column(nullable = false, length = 32)
    private String depName;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "comId")
    private Company company;

    @OneToMany(mappedBy="department")
    private List<Employee> employee;
}
