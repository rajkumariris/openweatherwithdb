package dev.raj.ffgooglemaploc;

import dev.raj.ffgooglemaploc.dtos.locationdatadto;
import dev.raj.ffgooglemaploc.models.locationinfo;
import dev.raj.ffgooglemaploc.repositories.locationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class locationtest {


    @Autowired
    locationRepository locationRepository;

     locationinfo locationinfo;
    @Test
    public void locationtesting(){

   // its getting null entity means it is running fine trying to fetch
        //data but we are trying  passing no info
        locationRepository.save(locationinfo);
    }
}
