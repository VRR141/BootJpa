package com.example.bootjpa.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "persons")
public class Person {

    @EmbeddedId
    private PersonPK personPK;

    private String phoneNumber;

    private String cityOfLiving;
}
