package com.stefan.viewmp_tutorial_2072013.entity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class NameViewModel : ViewModel() {
    val _names = MutableLiveData<List<String>>(emptyList())
    val names: List<String>
        get() = _names.value ?: emptyList()

    fun addName(name: String) {
        val newNames = _names.value?.toMutableList() ?: mutableListOf()
        newNames.add(name)
        _names.value = newNames

    }
}