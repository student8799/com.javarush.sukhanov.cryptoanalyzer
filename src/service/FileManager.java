package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileManager {
    public List<String> readFile(String filePath) {
        List<String> str;
        Path path = Path.of(filePath);
        try {
            str = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }

    public void writeFile(String str, String output) {
        Path path = Path.of(output);
        try {
            Files.writeString(path, str + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
