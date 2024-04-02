package dev.raj.ffgooglemaploc.controllers;



import dev.raj.ffgooglemaploc.dtos.locationdatadto;
import dev.raj.ffgooglemaploc.dtos.locationdto;
import dev.raj.ffgooglemaploc.models.Coord;
import dev.raj.ffgooglemaploc.models.Wind;
import dev.raj.ffgooglemaploc.models.locationinfo;
import dev.raj.ffgooglemaploc.models.weather;
import dev.raj.ffgooglemaploc.repositories.locationRepository;
import dev.raj.ffgooglemaploc.services.MapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PincodeController {

        MapService mapService;
        locationRepository locationRepository;

        public PincodeController(MapService mapService, locationRepository locationRepository1){
            this.mapService= mapService;
            this.locationRepository = locationRepository1;
        }
//        @RequestParam("pincode") String pincode,
//    @RequestParam("date") String date
    //(pincode, date
    @GetMapping("/location")
    public locationdatadto getLocation(@RequestBody locationdto locationdto){

        locationdatadto info = mapService.getMapInformation(locationdto);

          locationinfo locationinfo = new locationinfo();
          Coord coord = new Coord();

          locationinfo.setCoord(coord);
          locationinfo.getCoord().setLat(info.getCoord().getLat());
          locationinfo.getCoord().setLon(info.getCoord().getLon());

           Wind wind = new Wind();
          locationinfo.setWind(wind);
          locationinfo.getWind().setSpeed(info.getWind().getSpeed());
          locationinfo.getWind().setDeg(info.getWind().getDeg());


          List<weather> weathers = new ArrayList<>();
        for (weather w : info.getWeather()) {
            weather weather = new weather();
            weather.setId((long)(Math.random()*1000));
            weather.setMain(w.getMain());
            weather.setDescription(w.getDescription());
            weather.setIcon(w.getIcon());
            weathers.add(weather);
        }
          locationinfo.setWeather(weathers);



        locationinfo.setVisibility(info.getVisibility());
        locationinfo.setTimezone(info.getTimezone());
        locationinfo.setBase(info.getBase());
        System.out.println(locationinfo);
        locationRepository.save(locationinfo);
        return info;
    }

}
