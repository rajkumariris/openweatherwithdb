package dev.raj.ffgooglemaploc.services;

import dev.raj.ffgooglemaploc.dtos.locationdatadto;
import dev.raj.ffgooglemaploc.dtos.locationdto;
import dev.raj.ffgooglemaploc.models.locationinfo;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class openweatherService implements MapService{

  private RestTemplateBuilder restTemplateBuilder;

  public  openweatherService(RestTemplateBuilder restTemplateBuilder){
      this.restTemplateBuilder = restTemplateBuilder;
  }
  public void converttolocation(){
      return ;
  };
//String pincode, String date
    @Override
    public locationdatadto getMapInformation(locationdto locationdto) {
        int pincode = locationdto.getPincode();
        String date = locationdto.getFor_date();
      String apiKey=   "87abe92bcc6a7732bb3c74677a882e9a";

      String url = String.format("https://api.openweathermap.org/data/2.5/weather?zip=%s,us&date=%s&appid=%s", pincode, date ,apiKey);
        RestTemplate restTemplate = restTemplateBuilder.build();
            ResponseEntity<locationdatadto> response = restTemplate.getForEntity(url, locationdatadto.class);
           // System.out.println(response.getBody());
             locationdatadto location = response.getBody();
             return location;
    }
}
