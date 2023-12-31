package apass.estudos.alura.trainingandroid.project03ceep.model;

import java.io.Serializable;

public class Note implements Serializable {

    private final String title;
    private final String description;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}