package com.willor.demo_for_springboot.controller

import com.willor.ktstockdata.KtStocks
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/base")
class BaseRestController {

    private val kt = KtStocks()

    @GetMapping("")
    fun welcome(): String{
        return "Welcome to the Base Endpoint"
    }

    @GetMapping("/quote")
    fun quoteTest(): String{

        return kt.marketData.getEtfQuote("SPY").toString()

    }
}