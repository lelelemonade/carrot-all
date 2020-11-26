package org.carrot.carrotapi.entity;

import lombok.Builder;

@Builder
public class Account {
    Long accountId;
    String name;
    String email;
    String password;
    Character sex;

    public Account() {
    }

    public Account(Long accountId, String name, String email, String password, Character sex) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.sex = sex;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
