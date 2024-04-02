package dev.raj.ffgooglemaploc.models;

import com.sun.tools.javac.Main;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Literal;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Getter
@Setter
@Entity
public class locationinfo{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @OneToOne(cascade = CascadeType.ALL)
        private Coord coord;

        @OneToMany(cascade = CascadeType.ALL)
        private List<weather> weather;

        private String base;

        private int visibility;

        @OneToOne(cascade = CascadeType.PERSIST)
        private Wind wind;

        private long dt;

        private int timezone;

        private String name;

        private int cod;

        // Constructors, getters and setters


}
