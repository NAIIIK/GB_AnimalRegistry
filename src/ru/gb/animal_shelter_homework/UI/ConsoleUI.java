package ru.gb.animal_shelter_homework.UI;

import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;
import ru.gb.animal_shelter_homework.presenter.Presenter;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{

    private Presenter presenter;
    private Scanner scanner;
    private boolean action;
    private Menu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        action = true;
        menu = new Menu(this);
    }

    @Override
    public void start() {
        System.out.println("Welcome to our shelter!");
        while (action) {
            printMenu();
            choice();
        }
    }

    private void choice() {
        String choiceStr = scanner.nextLine();
        try {
            int choice = Integer.parseInt(choiceStr);
            if (choice < 1 || choice > menu.getSize()) {
                output(-1);
            } else {
                menu.execute(choice);
            }
        } catch (NumberFormatException e) {
            output(-1);
        }
    }

    public void printMenu() {
        printAnswer(menu.getMenu());
    }

    private void output(int result) {
        switch (result) {
            case 1:
                printAnswer("Done!");
                break;
            case -1:
                printAnswer("Something went wrong...");
                break;
        }
    }

    public void addAnimal() {
        System.out.println("Input animal type (dog, cat, etc.): ");
        String type = scanner.nextLine();
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Date of birth\nDay: ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Month: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        try {
            LocalDate birthDate = LocalDate.of(year, month, day);
            if (presenter.addAnimal(type, name, birthDate)) {
                output(1);
            } else {
                output(-1);
            }
        } catch (DateTimeException e) {
            output(-1);
        }
    }

    public void removeAnimal () {
        System.out.println("Input the ID: ");
        long id = Long.parseLong(scanner.nextLine());
        if (presenter.removeAnimal(id)) {
            output(1);
        } else {
            output(-1);
        }
    }

    public void getById() {
        System.out.println("Input the ID: ");
        long id = Long.parseLong(scanner.nextLine());
        Animal animal = presenter.getById(id);
        if (animal != null) {
            printAnswer(animal.toString());
        } else {
            output(-1);
        }
    }

    public void teachNewCommand() {
        System.out.println("Input the ID: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.println("Input the command: ");
        if (presenter.teachNewCommand(id, scanner.nextLine())) {
            output(1);
        } else {
            output(-1);
        }
    }

    public void sortByBirthDate() {
        presenter.sortByBirthDate();
        output(1);
    }

    public void sortById() {
        presenter.sortById();
        output(1);
    }

    public void saveShelterInfo() {
        System.out.println("Input the file name: ");
        String fileName = scanner.nextLine();
        if (presenter.saveShelterInfo(fileName)) {
            output(1);
        } else {
            output(-1);
        }
    }

    public void loadShelterInfo() {
        System.out.println("Input the file name: ");
        String fileName = scanner.nextLine();
        if (presenter.loadShelterInfo(fileName)) {
            output(1);
        } else {
            output(-1);
        }
    }

    public void getShelterInfo() {
        presenter.getShelterInfo();
    }

    public void finish() {
        printAnswer("Thanks for coming by!");
        action = false;
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
