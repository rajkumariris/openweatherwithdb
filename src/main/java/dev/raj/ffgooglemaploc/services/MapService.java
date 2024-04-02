package dev.raj.ffgooglemaploc.services;

import dev.raj.ffgooglemaploc.dtos.locationdatadto;
import dev.raj.ffgooglemaploc.dtos.locationdto;
import dev.raj.ffgooglemaploc.models.locationinfo;

public interface MapService {

    public locationdatadto getMapInformation(locationdto locationdto);
}
