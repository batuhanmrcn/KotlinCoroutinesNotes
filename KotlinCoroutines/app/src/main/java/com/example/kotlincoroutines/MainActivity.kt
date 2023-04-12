package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness
/*
        GlobalScope.launch {
            launch {
                println("android")
            }
        }
    }

        */

        //Scope  nerede coroutine'in çalışacağını belirleyen ve yaşam döngüsünü belirleyen bir yapıdır.
        //Global Scope  Bütün app içerisinde çalıştırabileceğimiz kapsamda açar coroutine'i uzun işlemlerde kullanılır.
        //runBlocking bloklayarak  scope oluşturuyor. Tek bir işlem yapıyorsak coroutine calıstıracaksak yaparız diğer kodlar bloklamak cogu zaman mantıklı değildir.
        //Coroutine Scope Genellikle bunu kullanırız.
/*
        //run Blocking
     runBlocking {
         launch {
             delay(2000)
             println("run blokcing")
         }
     }

 */
        /*
        println("Global scope start")
        GlobalScope.launch {
            delay(5000)
            println("Global scope ")
        }
        println("Global scope end")

         */

        //CoroutineScope
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(2000)
            println("coroutine scope")
        }
        println("coroutine scope end")
     }

    }
