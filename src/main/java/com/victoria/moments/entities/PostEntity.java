package com.victoria.moments.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostEntity {

    @Id
    @GeneratedValue
    private String id;
    @NonNull
    private String title;

    //comments

}
