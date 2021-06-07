package com.example.itcourses.ui.listmy

import com.example.itcourses.data.resository.PersonRepository
import com.example.itcourses.ui.base.BasePresenter
import com.example.itcourses.ui.listmy.ListMyView

class ListMyPresenter(view: ListMyView): BasePresenter<ListMyView>(view) {

    private val personRepository: PersonRepository = PersonRepository()

    override fun onViewCreate() {
        super.onViewCreate()
        val personList = personRepository.getPersonList()
        view.showPerson(personList)
    }
}

