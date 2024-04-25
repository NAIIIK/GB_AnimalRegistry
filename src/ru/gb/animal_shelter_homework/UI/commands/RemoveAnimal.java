package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class RemoveAnimal extends Command{

    public RemoveAnimal(ConsoleUI consoleUI) {
        super("Remove animal", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().removeAnimal();
    }
}
