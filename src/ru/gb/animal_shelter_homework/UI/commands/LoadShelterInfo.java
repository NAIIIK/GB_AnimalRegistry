package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class LoadShelterInfo extends Command{

    public LoadShelterInfo(ConsoleUI consoleUI) {
        super("Load shelter info", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().loadShelterInfo();
    }
}
