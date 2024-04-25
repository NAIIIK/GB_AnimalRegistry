package ru.gb.animal_shelter_homework.animal_shelter_API.animals.pack_animals;

import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;

import java.time.LocalDate;

public class PackAnimal extends Animal {
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
    }
}
