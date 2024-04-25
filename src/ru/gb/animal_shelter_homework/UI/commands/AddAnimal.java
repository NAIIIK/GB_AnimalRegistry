package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class AddAnimal extends Command{

    public AddAnimal(ConsoleUI consoleUI) {
        super("Add new animal", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().addAnimal();
    }
}
