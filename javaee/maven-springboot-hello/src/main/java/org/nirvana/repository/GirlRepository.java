package org.nirvana.repository;

import org.nirvana.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nirvana on 2017/6/15.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
}
