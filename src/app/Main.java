package app;

import fileHandler.FileHandler;
import note.Note;

public class Main {

    public static void main(String[] args) throws Exception {
        FileHandler fileHandler = new FileHandler("exam.txt");
        // Создаем объект класса Notepad
        Note notepad = new Note("Какой-то текст");

        // Вносим заметку
        fileHandler.addNote(notepad);

        // Выводим все заметки
        fileHandler.printNotes();
    }
}
