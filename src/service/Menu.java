package service;

public enum Menu {
    EXIT("Выход"),
    ENCRYPT("Шифрование с ключом"),
    DECRYPT("Дешифрование с ключом"),
    BRUTEFORCE("Дешифрование brute force");

    private String menu;

    Menu(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
}
