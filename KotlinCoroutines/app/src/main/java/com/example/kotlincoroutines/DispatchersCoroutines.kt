package com.example.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    //Dipsatchers Hangi threadlerle calıstıracagını söyleyebiliyoruz.

    //Dispatchers
     //Dispatchers.Default -> CPU Intensive
    //Dispatchers.IO -> Input / output,Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited dispatcher

    runBlocking {

        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")

        }
    }


}