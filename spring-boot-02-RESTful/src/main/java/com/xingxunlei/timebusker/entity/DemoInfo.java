package com.xingxunlei.timebusker.entity;

import java.io.Serializable;

/**
 * Created by xingmin on 2017/12/29.
 */
public class DemoInfo implements Serializable {

    private static final long serialVersionUID = -1727537778826379384L;

    private String id;

    private String name;

    private String description;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DemoInfo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
