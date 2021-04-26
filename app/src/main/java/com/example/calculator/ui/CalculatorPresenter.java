package com.example.calculator.ui;

import com.example.calculator.domain.Calculator;
import com.example.calculator.domain.Operation;

public class CalculatorPresenter {

    private CalculatorView view;

    private Calculator calculator;

    private double arg = 0;
    private double argOne = 0;
    private double argTwo = 0;
    private  double result = 0;


    private String lastClick ="";
    String[] ourOperation = {"-", "+", "*", "/"};


    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

     public void onBtn_1Clicked() {
        //как-то реагируем на событие что пользователь нажал кнопку 1
         checkPreClicked();
         arg = 1;
         lastClick = "1";
         view.showResult(String.valueOf(argOne));
    }

    public void onBtn_2Clicked() {
        //как-то реагируем на событие что пользователь нажал кнопку 2
        arg = 2;
        lastClick = "2";
        view.showResult(String.valueOf(argTwo));
    }

    public void onBtn_PlusClicked() {
        //как-то реагируем на событие что пользователь нажал кнопку +

        if (checkPreClicked("+"){

        }

        result = calculator.binaryOperation(argOne, argTwo, Operation.ADD);

        view.showResult(String.valueOf(result));
        argOne = result;
    }

    private void checkPreClicked() {
        for (String s : ourOperation) {
            
        }

    }
    
}
