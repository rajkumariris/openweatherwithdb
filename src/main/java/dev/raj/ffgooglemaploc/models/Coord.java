package dev.raj.ffgooglemaploc.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Embeddable
public class Coord {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private double lon;
   private double lat;
}
