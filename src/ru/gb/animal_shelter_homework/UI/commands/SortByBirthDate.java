package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class SortByBirthDate extends Command{

    public SortByBirthDate(ConsoleUI consoleUI) {
        super("Sort registry by date of birth", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByBirthDate();
    }
}
