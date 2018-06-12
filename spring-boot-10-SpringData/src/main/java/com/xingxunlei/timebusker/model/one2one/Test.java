package com.xingxunlei.timebusker.model.one2one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 设置符合逐渐 可以同时使用两个@Id进行注释到成员上
 * Created by xingmin on 2018/1/2.
 */
@Entity
@Table(name = "t_test")
public class Test implements Serializable {

    private static final long serialVersionUID = 5260045025079981216L;

    @Id
    private long teid;

    @Id
    private long stid;

    public long getTeid() {
        return teid;
    }

    public void setTeid(long teid) {
        this.teid = teid;
    }

    public long getStid() {
        return stid;
    }

    public void setStid(long stid) {
        this.stid = stid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (teid != test.teid) return false;
        return stid == test.stid;
    }

    @Override
    public int hashCode() {
        int result = (int) (teid ^ (teid >>> 32));
        result = 31 * result + (int) (stid ^ (stid >>> 32));
        return result;
    }
}
