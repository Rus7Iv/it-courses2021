package com.example.itcourses.ui.listmy

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.itcourses.R
import com.example.itcourses.data.model.Person
import com.example.itcourses.ui.base.BaseActivity
import com.example.itcourses.utils.lazyUnsafe

class ListMyActivity : BaseActivity<ListMyView, ListMyPresenter>(), ListMyView {

    override val presenter: ListMyPresenter = ListMyPresenter(this)
    override val contentId: Int = R.layout.activity_list

    private val recyclerView: RecyclerView by lazyUnsafe { findViewById(R.id.recyclerView) }
    private val personAdapter: ListMyAdapter = ListMyAdapter()

    override fun initViews() {
        super.initViews()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = personAdapter
    }

    override fun showPerson(personList: List<Person>) {
        personAdapter.persList = personList
        personAdapter.notifyDataSetChanged()
    }
}
