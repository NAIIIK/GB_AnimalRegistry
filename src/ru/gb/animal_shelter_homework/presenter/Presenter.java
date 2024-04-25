package ru.gb.animal_shelter_homework.presenter;

import ru.gb.animal_shelter_homework.UI.View;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;
import ru.gb.animal_shelter_homework.animal_shelter_API.service.Service;

import java.time.LocalDate;

public class Presenter {

    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public boolean addAnimal(String type, String name, LocalDate birthDate) {
        return service.addAnimal(type, name, birthDate);
    }

    public boolean removeAnimal(long id) {
        return service.removeAnimal(id);
    }

    public Animal getById(long id) {
        return service.getById(id);
    }

    public boolean teachNewCommand(long id, String command) {
        return service.teachNewCommand(id, command);
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
    }

    public void sortById() {
        service.sortById();
    }

    public void getShelterInfo() {
        view.printAnswer(service.getShelterInfo());
    }

    public boolean saveShelterInfo(String fileName) {
        return service.saveShelterInfo(fileName);
    }

    public boolean loadShelterInfo(String fileName) {
        return service.loadShelterInfo(fileName);
    }
}
