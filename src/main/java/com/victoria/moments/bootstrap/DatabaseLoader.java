package com.victoria.moments.bootstrap;

import com.victoria.moments.entities.MomentEntity;
import com.victoria.moments.repository.CommentRepository;
import com.victoria.moments.repository.MomentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private MomentRepository momentRepository;
    private CommentRepository commentRepository;

    public DatabaseLoader(MomentRepository momentRepository, CommentRepository commentRepository) {
        this.momentRepository = momentRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void run(String... args) {
//
//        String handler = "/static_extra";
//        Map<String, MomentEntity> moments = new HashMap<>();
//        moments.put("16", new MomentEntity("our Christmas 2020 in Poland(1)", handler+"/16.jpg", 10L));
//        moments.put("18", new MomentEntity("our Christmas 2020 in Poland(2)", handler+"/18.jpg", 19L));
//        moments.put("28", new MomentEntity("our Christmas 2020 in Poland(3)", handler+"/28.jpg", 67L));
//        moments.put("31", new MomentEntity("our Christmas 2020 in Poland(4)", handler+"/31.jpg", 20L));
//        moments.put("34", new MomentEntity("our Christmas 2020 in Poland(5)", handler+"/34.jpg", 49L));
//        moments.put("37", new MomentEntity("our Christmas 2020 in Poland(6)", handler+"/37.jpg", 87L));
//        moments.put("familyPic", new MomentEntity("our family foto", handler+"/familyPic.jpg", 78L));
//        moments.put("G_B_0280", new MomentEntity("our weddings morning..vadim", handler+"/G_B_0280.jpg", 67L));
//        moments.put("G_B_0488", new MomentEntity("our weddings morning..vika", handler+"/G_B_0488.jpg", 98L));
//        moments.put("Image 02.08.20", new MomentEntity("varnemunde", handler+"/Image 02.08.20.jpeg", 59L));
//        moments.put("praga", new MomentEntity("Praga", handler+"/praga.jpg", 74L));
//        moments.put("wedding", new MomentEntity("wedding..Israel", handler+"/wedding.jpg", 24L));
//
//        moments.forEach((k, v) -> momentRepository.save(v));
//
//        long momentsCount = momentRepository.count();
//        System.out.println("Number of moments in the database: " + momentsCount);


    }
}
