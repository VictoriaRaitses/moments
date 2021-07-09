package com.victoria.moments.controllers;

import com.victoria.moments.entities.MomentEntity;
import com.victoria.moments.service.impl.MomentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/moment")
public class MomentController {

    private final MomentServiceImpl momentService;

    @Autowired
    public MomentController(MomentServiceImpl momentService) {
        this.momentService = momentService;
    }


    // post
    @RequestMapping("/")
    public List<MomentEntity> list() {
        return momentService.findAll();
    }

    @RequestMapping("/{title}")
    public MomentEntity getByTitle(@PathVariable String title) {
        return momentService.findByTitle(title);
    }


    // CRUD
    @PostMapping("/create")
    public MomentEntity create(@ModelAttribute MomentEntity moment) {
        return momentService.save(moment);
    }

    @GetMapping("/{id}")
    public Optional<MomentEntity> read(@PathVariable String id) {
        return momentService.findById(id);
    }

    @PutMapping("/{id}")
    public MomentEntity update(@PathVariable String id, @ModelAttribute MomentEntity post) {
        return momentService.save(post);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        momentService.deleteById(id);
    }


}
