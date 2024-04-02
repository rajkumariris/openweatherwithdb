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
    @Column(name = "id", nullable = false)
    private Long id;
    String main;
    String description;
    String icon;
//    @ManyToOne(cascade = CascadeType.PERSIST)
//    private locationinfo locationinfo;
//    @OneToMany(mappedBy = "weather", cascade = CascadeType.PERSIST)
//    private List<locationinfo> info;


}
