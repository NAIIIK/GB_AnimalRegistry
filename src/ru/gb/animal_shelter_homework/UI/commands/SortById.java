package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class SortById extends Command{

    public SortById(ConsoleUI consoleUI) {
        super("Sort registry by ID", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortById();
    }
}
