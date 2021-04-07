package com.victoria.moments.repository;

import com.victoria.moments.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity,String> {
}
