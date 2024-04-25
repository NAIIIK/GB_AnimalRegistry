package ru.gb.animal_shelter_homework.animal_shelter_API.animals.builder;

import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.pack_animals.Camel;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.pack_animals.Donkey;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.pack_animals.Horse;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.pets.Cat;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.pets.Dog;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.pets.Hamster;

import java.time.LocalDate;

public class AnimalBuilder {

    private String type;

    public AnimalBuilder(String type) {
        this.type = type;
    }

    public AnimalBuilder() {
        this.type = "unknown";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal build(String name, LocalDate birthDate) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog(name, birthDate);
            case "cat":
                return new Cat(name, birthDate);
            case "hamster":
                return new Hamster(name, birthDate);
            case "horse":
                return new Horse(name, birthDate);
            case "camel":
                return new Camel(name, birthDate);
            case "donkey":
                return new Donkey(name, birthDate);
            default:
                return new Animal(name, birthDate);
        }
    }
}
