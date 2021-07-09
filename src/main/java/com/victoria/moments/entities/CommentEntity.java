package com.victoria.moments.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommentEntity extends Auditable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    @NotNull
    private String body;

    //Post
    @ManyToOne
    @NotNull
    @ToString.Exclude
    @JsonIgnore
    private MomentEntity moment;

    public CommentEntity(String body, MomentEntity moment) {
        this.body = body;
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "id='" + id + '\'' +
                ", body='" + body + '\'' +
                //   ", moment=" + moment +
                '}';
    }
}
