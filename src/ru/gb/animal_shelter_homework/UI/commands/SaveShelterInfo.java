package ru.gb.animal_shelter_homework.UI.commands;


import ru.gb.animal_shelter_homework.UI.ConsoleUI;

public class SaveShelterInfo extends Command {

    public SaveShelterInfo(ConsoleUI consoleUI) {
        super("Save shelter info", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().saveShelterInfo();
    }
}
