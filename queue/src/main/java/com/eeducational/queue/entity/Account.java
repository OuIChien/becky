package com.eeducational.queue.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by admin on 2017/5/12.
 *
 * 用户账户
 */
@Entity
@Data
public class Account extends AbstractPersistable<Long> {

    /**
     * 手机号码(作为登录帐号)
     */
    @Column(unique = true, length = 11) String mobile;

    @Column(length = 100) String password;

}
