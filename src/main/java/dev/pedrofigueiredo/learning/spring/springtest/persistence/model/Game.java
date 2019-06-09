package dev.pedrofigueiredo.learning.spring.springtest.persistence.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Game")
@Table(name = "tb_game")
@EqualsAndHashCode
public class Game extends AbstractEntity {

    @NotEmpty
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private String name;

    @ManyToOne
    @JoinColumn(name = "xid_platform")
    private Platform platform;

    @DecimalMin(value = "0")
    @DecimalMax(value = "100")
    private Long score;

    @OneToOne
    @JoinColumn(name = "xid_developer")
    private Developer developedBy;

    private String genre;

    private Date releaseDate;

}


