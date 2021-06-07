package com.example.itcourses.ui.calclulator

import com.example.itcourses.ui.base.BaseView

interface CalculatorView : BaseView {

    fun clearText()

    fun showInputText(text: Char)

    fun showAnswerText(text: String)
}
