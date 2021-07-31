package ru.geekbrains.androidwithkotlin.model.repository

import ru.geekbrains.androidwithkotlin.model.data.Film

interface Repository {
    fun getFilmFromServer(): Film
    fun getFilmFromLocalStorageRus(): List<Film>
    fun getFilmFromLocalStorageWorld(): List<Film>
}