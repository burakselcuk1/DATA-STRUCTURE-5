package com.example.myapplicationfdassfd

fun main(){

    val arr = arrayListOf<Int>(2,3,4,1,3,3,4,21)

    arr.forEach {
        if (it == 21){
            val a  = arr.indexOf(21)
            println(a)
        }
    }
}