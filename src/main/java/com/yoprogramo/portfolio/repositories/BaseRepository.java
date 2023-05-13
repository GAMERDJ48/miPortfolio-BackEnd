package com.yoprogramo.portfolio.repositories;

import com.yoprogramo.portfolio.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
    @Query(value = "SELECT * FROM #{#entityName} e WHERE e.id = (SELECT MAX(id) FROM #{#entityName})", nativeQuery = true)
    Optional<E> findLast();

    @Query(value = "SELECT COUNT(*) FROM #{#entityName}", nativeQuery = true)
    int getCount();
}
