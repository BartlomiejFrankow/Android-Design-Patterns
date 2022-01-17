package com.example.androiddesignpatterns.patternsCategories.structural.facade

/*
* Facade Pattern is about hiding code which one you shouldn't see - code under the hood.
* For example you can't see what retrofit is doing behind GET annotation for function `getSomething()`
*
* In the Facade pattern, a complicated system is wrapped into a simpler system that will help us
* in getting the values from the complicated system without having knowledge of how the data
* is being fetched and returned to the view or the presenter.
*
* -----Example-----
* import retrofit2.http.GET
*
* @Get("/endpoint")
* suspend fun getSomething(): List<Something>
* -----Example-----
* */
