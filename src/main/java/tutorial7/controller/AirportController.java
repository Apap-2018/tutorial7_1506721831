package tutorial7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import tutorial7.rest.Setting;

@RestController
public class AirportController {
    @Autowired
    RestTemplate resTemplate;
    
    @Bean
    public RestTemplate res() {
    	return new RestTemplate();
    }
    
    @GetMapping(value ="/airports/{kota}")
    public String getAirportByCity(@PathVariable("kota") String kota) throws Exception{
    	String path = Setting.airportUrl + "&term=" + kota;
    	return resTemplate.getForEntity(path, String.class).getBody();
    }
}
