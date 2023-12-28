package com.example.myapplication.MVVM

class Model {
    var age = 0
    var visble = true

    fun inc() {
        age++
    }

    fun dec() {
        age--
    }

    fun v(vis: Boolean) {
        this.visble = vis
    }
}