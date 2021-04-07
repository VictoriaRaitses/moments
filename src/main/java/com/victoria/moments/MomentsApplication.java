package com.victoria.moments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MomentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MomentsApplication.class, args);
    }

//    @Autowired
//    UserRepository userRepository;
//    @PostConstruct
//    public void test(){
//
//
//       UserEntity user = userRepository.save(UserEntity.builder().userName("vika").build());
//        System.out.println(user.toString());
//
//    }

}
