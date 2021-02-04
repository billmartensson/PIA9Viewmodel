package se.magictechnology.pia9viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var counter = 0

    private val countingText = MutableLiveData<String>()

    fun getCountingText() : LiveData<String>
    {
        return countingText
    }

    fun addToNumber()
    {
        counter = counter + 1

        if(counter > 5)
        {
            counter = 0
        }

        countingText.value = "** " + counter.toString() + " **"
    }

}