package org.carrot.carrotapi.entity;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author zhonglishen
 */
@Builder
public class User implements Serializable {
    String name;
    Long id;

    public User() {
    }

    public User(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
