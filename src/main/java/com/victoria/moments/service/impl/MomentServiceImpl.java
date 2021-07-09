package com.victoria.moments.service.impl;

import com.victoria.moments.entities.MomentEntity;
import com.victoria.moments.repository.MomentRepository;
import com.victoria.moments.service.MomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.print.Doc;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MomentServiceImpl implements MomentService {

    private final MomentRepository momentRepository;

    @Autowired
    public MomentServiceImpl(MomentRepository momentRepository) {
        this.momentRepository = momentRepository;
    }

    @Override
    public List<MomentEntity> getMomentsByUserId(String userId) {
        return momentRepository.findAllById(Collections.singleton(userId));
    }

    @Override
    public MomentEntity findByTitle(String title) {
        return momentRepository.findByTitle(title);
    }

    @Override
    public List<MomentEntity> findAll() {
        return momentRepository.findAllSortedByDate();
    }

    @Override
    public MomentEntity save(MomentEntity moment) {
        return momentRepository.save(moment);
    }


    @Override
    public Optional<MomentEntity> findById(String id) {
        return momentRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        momentRepository.deleteById(id);
    }
}
