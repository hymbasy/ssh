package com.alex.controller;

import com.alex.entity.Person;
import com.alex.service.PersonService;
import com.alex.service.TestService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private TestService testService;

    @Autowired
    private PersonService personService;



    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        //实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        return "test";
    }

    @RequestMapping(value = "springtest", method = RequestMethod.GET)
    public String springTest(){
        return testService.test();
    }

    @RequestMapping(value = "savePerson", method = RequestMethod.GET)
    @ResponseBody
    public String savePerson(){
        personService.savePerson();
        return "success!";
    }
    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    @ResponseBody
    public String finaAll(){
        List<Person> personList = personService.findAll();
        return JSON.toJSONString(personList);
    }
}
