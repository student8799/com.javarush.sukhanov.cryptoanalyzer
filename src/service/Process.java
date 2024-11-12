package service;

import java.util.List;
import java.util.Scanner;

public class Process {
    Alphabet alphabet = new Alphabet();
    Cipher cipher = new Cipher();
    Validator validator = new Validator();
    FileManager fileManager = new FileManager();
    Scanner console = new Scanner(System.in);
    private String inputFileName;
    private String outputFileName;
    private int key;

    public void coder() {
        if (validator.isFileExists(inputFileName) && validator.isValidKey(key)) {
            List<String> stringList = fileManager.readFile(inputFileName);
            for (String stringText : stringList) {
                String cipherText = cipher.encrypt(stringText, key);
                fileManager.writeFile(cipherText, outputFileName);
            }
            System.out.println("файл зашифрован" + "\n");
        }
    }

    public void decoder() {
        if (validator.isFileExists(inputFileName) && validator.isValidKey(key)) {
            List<String> stringList = fileManager.readFile(inputFileName);
            for (String stringText : stringList) {
                String decipherText = cipher.decrypt(stringText, key);
                fileManager.writeFile(decipherText, outputFileName);
            }
        }
    }

    public void bruteForce() {
        System.out.println("Введите путь к начальному файлу");
        this.inputFileName = console.nextLine();

        System.out.println("Введите путь к готовому файлу");
        this.outputFileName = console.nextLine();

        for (int i = 1; i < alphabet.getAlphabet().size(); i++) {
            this.key = i;
            decoder();
        }
        System.out.println("варианты расшифровки записаны в файл " + outputFileName + "\n");
    }

    public void enterValues() {
        System.out.println("Введите путь к начальному файлу");
        this.inputFileName = console.nextLine();

        System.out.println("Введите путь к готовому файлу");
        this.outputFileName = console.nextLine();

        System.out.println("Введите ключ от 0 до " + alphabet.getAlphabet().size());
        this.key = console.nextInt();
    }
}
