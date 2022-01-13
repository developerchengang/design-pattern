package com.sunny.absfactory;

import com.sunny.absfactory.button.Button;
import com.sunny.absfactory.combobox.ComboBox;
import com.sunny.absfactory.textfield.TextField;

public class Client {

    public static void main(String[] args) {

        SkinFactory factory = new SummerSkinFactory();
        Button button = factory.createButton();
        button.display();

        TextField textField = factory.createTextFiled();
        textField.display();

        ComboBox comboBox = factory.createComboBox();
        comboBox.display();

    }

}
