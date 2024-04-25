package ru.gb.animal_shelter_homework.UI;

import ru.gb.animal_shelter_homework.UI.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Command> commandList;

    public Menu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new AddAnimal(consoleUI));
        commandList.add(new RemoveAnimal(consoleUI));
        commandList.add(new TeachNewCommand(consoleUI));
        commandList.add(new GetShelterInfo(consoleUI));
        commandList.add(new GetById(consoleUI));
        commandList.add(new SortByBirthDate(consoleUI));
        commandList.add(new SortById(consoleUI));
        commandList.add(new SaveShelterInfo(consoleUI));
        commandList.add(new LoadShelterInfo(consoleUI));
        commandList.add(new Exit(consoleUI));
    }

    public String getMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1)
                    .append(". ")
                    .append(commandList.get(i).getDescription())
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) {
        Command command = commandList.get(choice - 1);
        command.execute();
    }

    public int getSize() {
        return commandList.size();
    }
}
