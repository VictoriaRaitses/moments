package com.victoria.moments.repository;

import com.victoria.moments.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity,String> {


}
