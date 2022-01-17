package com.example.androiddesignpatterns.patternsCategories.creational.dependencyInjection;

/*
 * Most of the classes have some dependency that is needed for the proper functioning of the class.
 * In the general case, we hard-code all the dependencies needed in the class inside the class itself.
 * But this is a very wrong way of providing dependency to a class because in future if the class requires
 * some more dependency or you want to add more dependency, then you have to update the new dependency
 * in all the classes that will be using that dependency.
 * You have to update the code at many places and you should avoid this in your project.
 *
 * Android DI examples: Koin, Dagger, Hilt
 * */
