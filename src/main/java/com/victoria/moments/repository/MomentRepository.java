package com.victoria.moments.repository;

import com.victoria.moments.entities.MomentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface MomentRepository extends JpaRepository<MomentEntity, String> {

    MomentEntity findByTitle(String title);

    @Query(value = "SELECT * from moment_entity order by creation_date DESC", nativeQuery = true)
    List<MomentEntity> findAllSortedByDate();

}
