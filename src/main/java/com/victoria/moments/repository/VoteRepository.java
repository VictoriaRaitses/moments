package com.victoria.moments.repository;

import com.victoria.moments.entities.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<VoteEntity,String> {
}
