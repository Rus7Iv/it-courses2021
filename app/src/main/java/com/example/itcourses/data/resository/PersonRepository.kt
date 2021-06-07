package com.example.itcourses.data.resository

import android.graphics.Color
import com.example.itcourses.data.model.Person

class PersonRepository {
    fun getPersonList(): List<Person> {
        return listOf(
            Person(name = "Иван",       color = Color.BLUE,     age ="20 лет"),
            Person(name = "Пётр",       color = Color.YELLOW,     age ="19 лет" ),
            Person(name = "Кирилл",     color = Color.CYAN,   age ="26 лет"),
            Person(name = "Антон",      color = Color.GRAY,     age ="21 год" ),
            Person(name = "Виктор",     color = Color.GREEN,    age ="22 года" ),
            Person(name = "Александр",  color = Color.RED,      age ="23 года" ),
            Person(name = "Олег",       color = Color.MAGENTA,  age ="24 года"),
            Person(name = "Сергей",     color = Color.LTGRAY,   age ="25 лет" ),
            Person(name = "Михаил",     color = Color.GRAY,     age ="26 лет"),
            Person(name = "Вилен",      color = Color.BLUE,     age ="27 лет" ),
        )
    }
}
