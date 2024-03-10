package br.com.criptonotification.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
@Slf4j
@RequiredArgsConstructor
public class NotificationController {

    @RequestMapping(path = "/{tag}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    String testCheckoutMessage(@PathVariable String tag) {
        return "Sua cipto " + tag + "esta sendo monitorada!";
    }
}
