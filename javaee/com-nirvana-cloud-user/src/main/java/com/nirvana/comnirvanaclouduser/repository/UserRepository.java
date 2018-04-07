package com.nirvana.comnirvanaclouduser.repository;

import com.nirvana.comnirvanaclouduser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nirvana on 2018/2/25.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
