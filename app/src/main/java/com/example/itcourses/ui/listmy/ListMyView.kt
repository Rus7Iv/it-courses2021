package com.example.itcourses.ui.listmy

import com.example.itcourses.data.model.Person
import com.example.itcourses.ui.base.BaseView

interface ListMyView: BaseView {

    fun showPerson(personList: List<Person>)
}

