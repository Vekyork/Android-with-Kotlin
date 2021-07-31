package ru.geekbrains.androidwithkotlin.model

import ru.geekbrains.androidwithkotlin.model.data.Film

sealed class AppState {
    data class Success(val FilmData: List<Film>) : AppState()
    class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
