package dev.raj.ffgooglemaploc.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Wind {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private double speed;
    private int deg;

}
