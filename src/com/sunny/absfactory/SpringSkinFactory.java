package com.sunny.absfactory;

import com.sunny.absfactory.button.Button;
import com.sunny.absfactory.button.SpringButton;
import com.sunny.absfactory.combobox.ComboBox;
import com.sunny.absfactory.combobox.SpringComboBox;
import com.sunny.absfactory.textfield.SpringTextField;
import com.sunny.absfactory.textfield.SummerTextField;
import com.sunny.absfactory.textfield.TextField;

/**
 * Spring 皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
