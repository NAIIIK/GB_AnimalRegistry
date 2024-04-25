package ru.gb.animal_shelter_homework.animal_shelter_API.animals;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Serializable {

    private long id;
    private String name;
    private LocalDate birthDate;
    private int age;
    private List<String> commands;

    public Animal(String name, LocalDate birthDate) {
        this.id = -1;
        this.name = name;
        this.birthDate = birthDate;
        Period period = Period.between(birthDate, LocalDate.now());
        this.age = period.getYears();
        this.commands = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public boolean learnNewCommand(String command) {
        if (!commands.contains(command)) {
            commands.add(command);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID: ")
                .append(getId())
                .append("\nType: unknown")
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
