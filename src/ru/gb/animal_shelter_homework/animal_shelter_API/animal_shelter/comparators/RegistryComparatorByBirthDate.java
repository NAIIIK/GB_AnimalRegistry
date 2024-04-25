package ru.gb.animal_shelter_homework.animal_shelter_API.animal_shelter.comparators;

import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;

import java.util.Comparator;

public class RegistryComparatorByBirthDate implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
