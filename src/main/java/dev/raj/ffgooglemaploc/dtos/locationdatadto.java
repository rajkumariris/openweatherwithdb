package dev.raj.ffgooglemaploc.dtos;

import dev.raj.ffgooglemaploc.models.Coord;
import dev.raj.ffgooglemaploc.models.Wind;
import dev.raj.ffgooglemaploc.models.weather;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class locationdatadto {


    private Coord coord;
    private List<weather> weather;
    private String base;
    private int visibility;
    private Wind wind;
    private long dt;
    private int timezone;
    private String name;
    private int cod;

}
