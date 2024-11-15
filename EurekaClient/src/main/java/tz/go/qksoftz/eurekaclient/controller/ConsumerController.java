package tz.go.qksoftz.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ConsumerController {
   @Autowired
   RestTemplate restTemplate;

   @GetMapping("/message")
   public String getMessage(){
       return restTemplate.getForObject("http://127.0.0.1:8701/api/message", String.class);
   }

}
