package com.ivan.curso.springboot.webapp.springboot_web.controllers;


import com.ivan.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/mix/{message}/{code}")
    public ParamDto mix(@PathVariable String message, @PathVariable Integer code) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        param.setCode(code);

        return param;
    }


}
