package ru.gb.animal_shelter_homework.animal_shelter_API.animals.pets;

import java.time.LocalDate;

public class Cat extends Pet {

    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID: ")
                .append(getId())
                .append("\nType: Cat")
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
