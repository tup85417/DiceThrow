package edu.temple.dicethrow

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class DieViewModel : ViewModel(){
    private val currentRoll = MutableLiveData(1)

    fun getRoll(): LiveData<Int> = currentRoll

    fun setRoll(roll: Int) {
        currentRoll.value = roll
    }
}
