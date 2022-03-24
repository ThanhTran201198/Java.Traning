package vn.fis.traning.lombok.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import vn.fis.traning.lombok.dto.MessageDto;
import vn.fis.traning.lombok.service.MessageService;

@Slf4j // lombok
@RestController
public class HelloController {
  
  @Autowired
  private MessageService messageService;
  
  @GetMapping("/hello")
  public MessageDto sayHello(@RequestParam String user) {
    
    log.info("test info log: "+ user);
  
    MessageDto message =  messageService.getSubscriptionMessage(user);
    
    log.debug("test debug log : "+message.toString());
    
    return message;
  }
}