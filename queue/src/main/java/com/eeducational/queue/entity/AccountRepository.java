package com.eeducational.queue.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by gary on 2017/7/30.
 */
@Component
public interface AccountRepository extends JpaRepository<Account, Long> {
}
