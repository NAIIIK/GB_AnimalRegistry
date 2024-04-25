package ru.gb.animal_shelter_homework.animal_shelter_API.animal_shelter.comparators;

import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;

import java.util.Comparator;

public class RegistryComparatorById implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
