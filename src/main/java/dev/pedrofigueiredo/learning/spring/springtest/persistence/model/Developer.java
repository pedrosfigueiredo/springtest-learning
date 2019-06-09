package dev.pedrofigueiredo.learning.spring.springtest.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity(name = "Developer")
@Table(name = "tb_developer")
public class Developer extends AbstractEntity {
    @NotEmpty
    @Column(unique = true)
    @Size(max = 100, message = "Please use a shortened name")
    private String name;
}

