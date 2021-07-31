package ru.geekbrains.androidwithkotlin.model.repository

import ru.geekbrains.androidwithkotlin.model.data.*

class RepositoryImpl : Repository {
    override fun getFilmFromServer(): Film {
        return Film()
    }

    override fun getFilmFromLocalStorageRus(): List<Film> {
        return getRussianFilms()
    }

    override fun getFilmFromLocalStorageWorld(): List<Film> {
        return getWorldFilms()
    }
}