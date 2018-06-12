package com.xingxunlei.timebusker.model.one2many;

import javax.persistence.*;

/**
 * 员工详细信息表（一个员工一条详细）
 * Created by xingmin on 2018/1/2.
 */
@Entity
@Table(name = "t_detailInfo")
public class DetailInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long detId;

    @Column(nullable = false, length = 32)
    private String detName;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "empId")
    private Employee employee;
}
