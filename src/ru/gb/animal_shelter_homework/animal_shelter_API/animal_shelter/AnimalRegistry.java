package ru.gb.animal_shelter_homework.animal_shelter_API.animal_shelter;

import ru.gb.animal_shelter_homework.animal_shelter_API.animal_shelter.comparators.RegistryComparatorByBirthDate;
import ru.gb.animal_shelter_homework.animal_shelter_API.animal_shelter.comparators.RegistryComparatorById;
import ru.gb.animal_shelter_homework.animal_shelter_API.animals.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry implements Serializable {

    private List<Animal> registry;

    public AnimalRegistry() {
        this.registry = new ArrayList<>();
    }

    public AnimalRegistry(List<Animal> registry) {
        this.registry = registry;
    }

    public List<Animal> getRegistry() {
        return registry;
    }

    private void setRegistry(List<Animal> registry) {
        this.registry = registry;
    }

    public boolean addAnimal(Animal animal) {
        if (animal != null) if (!registry.contains(animal)) {
            registry.add(animal);
            animal.setId(registry.size());

            return true;
        }
        return false;
    }

    public boolean removeAnimal(long id) {
        if (id < 0 || id > registry.size()) {
            return false;
        }
        registry.remove(getById(id));
        return true;
    }

    public Animal getById(long id) {
        for (Animal animal:
             registry) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    public boolean teachNewCommand(long id, String command) {
        try {
            Animal animal = getById(id);
            return animal.learnNewCommand(command);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public void sortByBirthDate() {
        registry.sort(new RegistryComparatorByBirthDate());
    }

    public void sortById() {
        registry.sort(new RegistryComparatorById());
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("There is/are ")
                .append(registry.size())
                .append(" animal(s) in shelter:\n");

        for (Animal animal:
             getRegistry()) {
            stringBuilder.append("\n")
                    .append(animal);
        }

        return stringBuilder.toString();
    }
}
