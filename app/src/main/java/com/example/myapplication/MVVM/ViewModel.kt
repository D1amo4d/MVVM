package com.example.myapplication.MVVM

class ViewModel {
    private lateinit var view: View
    private var model = Model()

    fun incriment() {
        model.inc()
        view.incAge(model.age)
    }

    fun decriment() {
        model.dec()
        view.incAge(model.age)
    }

    fun attachView(view: View) {
        this.view = view
    }

    fun chageVisble() {
        if (model.visble) {
            model.v(false)
        } else {
            model.v(true)
        }
        view.isVisibl(model.visble)
    }
}