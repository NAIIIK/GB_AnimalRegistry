package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class TeachNewCommand extends Command{

    public TeachNewCommand(ConsoleUI consoleUI) {
        super("Teach an animal a new command", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().teachNewCommand();
    }
}
