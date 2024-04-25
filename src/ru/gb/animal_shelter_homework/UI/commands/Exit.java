package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class Exit extends Command{

    public Exit(ConsoleUI consoleUI) {
        super("Exit", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
