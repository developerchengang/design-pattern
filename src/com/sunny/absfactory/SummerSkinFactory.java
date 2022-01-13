package com.sunny.absfactory;

import com.sunny.absfactory.button.Button;
import com.sunny.absfactory.button.SummerButton;
import com.sunny.absfactory.combobox.ComboBox;
import com.sunny.absfactory.combobox.SummerComboBox;
import com.sunny.absfactory.textfield.SummerTextField;
import com.sunny.absfactory.textfield.TextField;

/**
 * Summer 皮肤工厂：具体工厂
 */
public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
