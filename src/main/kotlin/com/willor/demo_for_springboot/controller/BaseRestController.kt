package com.willor.demo_for_springboot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/base")
class BaseRestController {


    @GetMapping("")
    fun welcome(): String{
        return "Welcome to the Base Endpoint"
    }
}