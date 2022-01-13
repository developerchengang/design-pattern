package com.sunny.absfactory;

import com.sunny.absfactory.button.Button;
import com.sunny.absfactory.combobox.ComboBox;
import com.sunny.absfactory.textfield.TextField;

/**
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {

   Button createButton();

   TextField createTextFiled();

   ComboBox createComboBox();

}
