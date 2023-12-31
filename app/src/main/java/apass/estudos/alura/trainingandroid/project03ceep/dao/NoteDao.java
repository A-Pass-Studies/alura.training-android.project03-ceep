package apass.estudos.alura.trainingandroid.project03ceep.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import apass.estudos.alura.trainingandroid.project03ceep.model.Note;

public class NoteDao {

    private final static ArrayList<Note> notes = new ArrayList<>();

    public List<Note> all() {
        return new ArrayList<>(notes);
    }

    public void insert(Note... note) {
        NoteDao.notes.addAll(Arrays.asList(note));
    }

    public void update(int position, Note note) {
        notes.set(position, note);
    }

    public void remove(int position) {
        notes.remove(position);
    }

    public void toggle(int startPosition, int endPosition) {
        Collections.swap(notes, startPosition, endPosition);
    }

    public void removeAll() {
        notes.clear();
    }

    public void mock() {
        for (int i = 0; i < 10; i++) {
            int n = i + 1;
            insert(new Note("Nota de número " + n, "Descrição" + n + " descrição" + n + " descrição " + n));
        }
    }
}
