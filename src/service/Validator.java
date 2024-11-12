package service;

import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {
    public boolean isValidKey(int key) {
        Alphabet alphabet = new Alphabet();
        boolean validKey = false;
        if (key > 0 && key < alphabet.getAlphabet().size()) {
            validKey = true;
        } else {
            System.out.println("проверьте ключ");
        }
        return validKey;
    }

    public boolean isFileExists(String filePath) {
        boolean isExists = false;

        Path path = Path.of(filePath);
        if (Files.exists(path)) {
            isExists = true;
            if (Files.isDirectory(path)) {
                System.out.println("проверьте путь к файлу, указана директория");
                isExists = false;
            }
        }
        return isExists;
    }
}
