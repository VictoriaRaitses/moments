package com.victoria.moments.service;

import com.victoria.moments.entities.MomentEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface MomentService {

    List<MomentEntity> getMomentsByUserId(String userId);

    MomentEntity findByTitle(String title);

    List<MomentEntity> findAll();

    MomentEntity save(MomentEntity moment);

    Optional<MomentEntity> findById(String id);

    void deleteById(String id);

}
