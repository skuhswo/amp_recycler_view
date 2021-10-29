package com.hs_worms.android.recyclerviewexample

import androidx.lifecycle.ViewModel

class ElementListViewModel : ViewModel() {

    val elements = mutableListOf<Element>()

    init {
        for (i in 0 until 20) {
            val element = Element(i)
            elements += element
        }
    }

}