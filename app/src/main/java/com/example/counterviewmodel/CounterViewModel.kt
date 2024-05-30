package com.example.counterviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val repository: CounterRepository=CounterRepository()
private val _count= mutableStateOf(repository.getCounter().count)
var count:MutableState<Int> = _count


    fun increment(){
        repository.increment()
        _count.value=repository.getCounter().count
    }
    fun decrement(){
        repository.decrement()
        _count.value=repository.getCounter().count
    }
}

