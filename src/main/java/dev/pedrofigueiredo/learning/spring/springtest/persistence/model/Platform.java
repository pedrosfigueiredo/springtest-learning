package dev.pedrofigueiredo.learning.spring.springtest.persistence.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity(name = "Platform")
@Table(name = "tb_platform")
public class Platform extends AbstractEntity {
    private String name;
}

