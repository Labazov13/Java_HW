package fileHandler;

import note.Note;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FileHandler {

    private String filename;

    public FileHandler(String filename) {
        this.filename = filename;
    }

    public void addNote(Note note) throws Exception {
        // Получаем текущее время
        LocalDateTime currentDate = LocalDateTime.now();

        // Создаем строку с заметкой
        String noteStr = String.format("%s (%s)", note.getText(), currentDate);

        // Добавляем заметку в файл
        FileWriter writer = new FileWriter(filename, true);
        writer.write(noteStr + "\n");
        writer.close();
    }

    public void printNotes() throws Exception {
        // Открываем файл для чтения
        FileReader reader = new FileReader(filename);

        // Читаем все строки из файла
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // Выводим строку в консоль
            System.out.println(line);
        }

        // Закрываем файл
        reader.close();
    }
}
