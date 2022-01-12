package com.example.androiddesignpatterns.Facade

/*
* Facade Pattern is about hiding code which one you shouldn't see - code under the hood.
* For example you can't see what retrofit is doing behind GET annotation for function `getSomething()`
*
* -----Example-----
* import retrofit2.http.GET
*
* @Get("/endpoint")
* suspend fun getSomething(): List<Something>
* -----Example-----
* */
