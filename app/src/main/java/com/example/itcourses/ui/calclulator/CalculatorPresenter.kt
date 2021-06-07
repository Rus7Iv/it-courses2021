package com.example.itcourses.ui.calclulator

import com.example.itcourses.ui.base.BasePresenter

class CalculatorPresenter(view: CalculatorView) : BasePresenter<CalculatorView>(view) {

    fun onClearClick(){
        view.clearText()
        view.clearText()
    }

    fun onEquallyClick() {
        view.showAnswerText("")
    }

    fun onSubClick() {

        view.showInputText('-')
    }

    fun onSumClick() {
        view.showInputText('+')

    }

    fun onDivClick() {
        view.showInputText('/')

    }

    fun onMultiClick() {
        view.showInputText('*')

    }
    fun onDotClick(){
        view.showInputText('.')
    }

    fun onNum1Click() = view.showInputText('1')
    fun onNum2Click() = view.showInputText('2')
    fun onNum3Click() = view.showInputText('3')
    fun onNum4Click() = view.showInputText('4')
    fun onNum5Click() = view.showInputText('5')
    fun onNum6Click() = view.showInputText('6')
    fun onNum7Click() = view.showInputText('7')
    fun onNum8Click() = view.showInputText('8')
    fun onNum9Click() = view.showInputText('9')
    fun onNum0Click() = view.showInputText('0')
}
