package com.serafeim.rest.controler;

import com.serafeim.rest.model.Direction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author sekou
 * @since 4/15/2017
 */
@RestController
public class RaspberryPiController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public Direction sayHello(){
        return new Direction("hello serafeim");
    }

    @RequestMapping(value = "/directions/{direction}", method = RequestMethod.POST)
    public Direction goDirections(@PathVariable String direction){
        return new Direction(direction);

    }



}
