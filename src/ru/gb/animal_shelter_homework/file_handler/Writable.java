package ru.gb.animal_shelter_homework.file_handler;

import java.io.Serializable;

public interface Writable {

    boolean save(Serializable serializable, String path);
    Object read(String path);
}
