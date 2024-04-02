package dev.raj.ffgooglemaploc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class weather {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String main;
    String description;
    String icon;
}
