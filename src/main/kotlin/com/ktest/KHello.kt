package com.ktest

import com.jtest.JHello

class KHello {
    fun callMe(){
        print("pc@school.com")
    }

}

fun main(args: Array<String>) {
    println("Hello Kotlin")
    //呼叫JHello的callMe
    val j = JHello()
    j.callMe()
    val k=KHello()
    k.callMe()
}