package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class GetById extends Command{

    public GetById(ConsoleUI consoleUI) {
        super("Check animal info by ID", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().getById();
    }
}
