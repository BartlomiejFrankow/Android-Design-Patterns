package com.example.androiddesignpatterns.patternsCategories.creational.dependencyInjection

import android.content.Context
import com.example.androiddesignpatterns.patternsCategories.behavioural.command.AddOrder
import com.example.androiddesignpatterns.patternsCategories.behavioural.command.PayOrder
import com.example.androiddesignpatterns.patternsCategories.structural.adapter.TicketPriceView
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

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

@Module
@InstallIn(SingletonComponent::class)
object DependencyInjectionModule {

    @Singleton
    @Provides
    fun provideTicketPriceView(@ApplicationContext appContext: Context) = TicketPriceView(appContext)

    @Singleton
    @Provides
    fun provideAddOrder() = AddOrder()

    @Singleton
    @Provides
    fun providePayOrder() = PayOrder()
}
