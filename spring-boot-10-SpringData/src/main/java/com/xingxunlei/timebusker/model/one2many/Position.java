package com.xingxunlei.timebusker.model.one2many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by xingmin on 2018/1/2.
 */
@Entity
@Table(name = "t_position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long posId;

    @Column(nullable = false, length = 32)
    private String posName;

    @ManyToMany(cascade=CascadeType.ALL,mappedBy="position")
    private List<Employee> employee;
}
