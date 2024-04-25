package ru.gb.animal_shelter_homework.UI.commands;

import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class GetShelterInfo extends Command{

    public GetShelterInfo(ConsoleUI consoleUI) {
        super("Check shelter registry", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().getShelterInfo();
    }
}
