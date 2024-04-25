package ru.gb.animal_shelter_homework.animal_shelter_API.service;

import ru.gb.animal_shelter_homework.animal_shelter_API.animal_shelter.AnimalRegistry;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.builder.AnimalBuilder;
import ru.gb.animal_shelter_homework.file_handler.FileHandler;
import ru.gb.animal_shelter_homework.file_handler.Writable;

import java.time.LocalDate;

public class Service {
    private AnimalRegistry registry;
    private AnimalBuilder builder;
    private Writable writable;

    public Service() {
        this.registry = new AnimalRegistry();
        this.builder = new AnimalBuilder();
        this.writable = new FileHandler();
    }

    public boolean addAnimal(String type, String name, LocalDate birthDate) {
        builder.setType(type);
        Animal animal = builder.build(name, birthDate);
        return registry.addAnimal(animal);
    }

    public boolean removeAnimal(long id) {
        return registry.removeAnimal(id);
    }

    public Animal getById(long id) {
        return registry.getById(id);
    }

    public boolean teachNewCommand(long id, String command) {
        return registry.teachNewCommand(id, command);
    }

    public void sortByBirthDate() {
        registry.sortByBirthDate();
    }

    public void sortById() {
        registry.sortById();
    }

    public String getShelterInfo() {
        return registry.toString();
    }

    public boolean saveShelterInfo(String fileName) {
        return writable.save(registry, fileName);
    }

    public boolean loadShelterInfo(String fileName) {
        registry = (AnimalRegistry) writable.read(fileName);
        return registry != null;
    }
}
