package com.nirvana.comnirvanacloudmovie.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Nirvana on 2018/2/25.
 */
public class User {
    private Long id;
    private String nickName;
    private Integer age;
    private BigDecimal balance;
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
