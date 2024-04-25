package ru.gb.animal_shelter_homework.animal_shelter_API.animals.pack_animals;

import java.time.LocalDate;

public class Horse extends PackAnimal {
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID: ")
                .append(getId())
                .append("\nType: Horse")
                .append("\nName: ")
                .append(getName())
                .append("\nDate of birth: ")
                .append(getBirthDate())
                .append("\nAge: ")
                .append(getAge())
                .append("\nCommands: ");

        if (!getCommands().isEmpty()) {
            for (String command :
                    getCommands()) {
                stringBuilder.append(command)
                        .append(" ");
            }
        } else {
            stringBuilder.append("none");
        }

        return stringBuilder.append("\n").toString();
    }
}
