package ru.gb.animal_shelter_homework.animal_shelter_API.animals.pets;

import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;

import java.time.LocalDate;

public class Pet extends Animal {
    public Pet(String name, LocalDate birthDate) {
        super(name, birthDate);
    }
}
