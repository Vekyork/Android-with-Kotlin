package ru.geekbrains.androidwithkotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.geekbrains.androidwithkotlin.model.AppState
import ru.geekbrains.androidwithkotlin.model.repository.Repository
import ru.geekbrains.androidwithkotlin.model.repository.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(private val repository: Repository = RepositoryImpl()) :
    ViewModel() {

    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData()

    fun getData(): LiveData<AppState> {
        return liveDataToObserve
    }

    fun getFilmFromLocalSourceRus() = getDataFromLocalSource(isRussia = true)

    fun getFilmFromLocalSourceWorld() = getDataFromLocalSource(isRussia = false)

    private fun getDataFromLocalSource(isRussia: Boolean) {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(2000)
            liveDataToObserve.postValue(
                AppState.Success(
                    if (isRussia) repository.getFilmFromLocalStorageRus()
                    else repository.getFilmFromLocalStorageWorld()
                )
            )
        }.start()
    }
}