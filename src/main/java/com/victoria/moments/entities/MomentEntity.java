package com.victoria.moments.entities;

import com.sun.istack.NotNull;
import com.victoria.moments.service.BeanUtil;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.ocpsoft.prettytime.PrettyTime;

import javax.persistence.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MomentEntity extends Auditable {
    @Override
    public String toString() {
        return "MomentEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", likeAmount=" + likeAmount +
                //  ", user=" + user +
                ", comments=" + comments +
                '}';
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    @NotNull
    private String title;
    @NotNull
    private String url;
    @NotNull
    private Long likeAmount;

    //user
    @ManyToOne
    @NotNull
    @ToString.Exclude
    private UserEntity user;

    //comments
    @OneToMany(mappedBy = "moment")
    private List<CommentEntity> comments = new ArrayList<>();


    public MomentEntity(String title, String url, Long likeAmount) {
        this.title = title;
        this.url = url;
        this.likeAmount = likeAmount;
    }

    public void addComment(CommentEntity comment) {
        comments.add(comment);
    }

//    public String getDomainName() throws URISyntaxException {
//        URI uri = new URI(this.url);
//        String domain = uri.getHost();
//        return domain.startsWith("www.") ? domain.substring(4) : domain;
//    }

    public String getPrettyTime() {
        PrettyTime pt = BeanUtil.getBean(PrettyTime.class);
        return pt.format(convertToDateViaInstant(getCreationDate()));
    }

    private Date convertToDateViaInstant(LocalDateTime dateToConvert) {
        return java.util.Date.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
    }
}
