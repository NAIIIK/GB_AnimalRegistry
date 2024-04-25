package ru.gb.animal_shelter_homework;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;
import ru.gb.animal_shelter_homework.UI.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
