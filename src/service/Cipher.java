package service;

import java.util.List;

public class Cipher {
    Alphabet alphabet = new Alphabet();
    List<Character> alphabetList = alphabet.getAlphabet();

    public String encrypt(String input, int key) {
        StringBuilder cryptString = new StringBuilder();
        char[] charArray = input.toCharArray();

        for (char symbol : charArray) {
            int num = Character.toLowerCase(symbol);
            for (int j = 0; j < alphabetList.size(); j++) {
                if (num == alphabetList.get(j)) {
                    int cryptIndex = (j + key) % alphabetList.size();
                    cryptString.append(alphabetList.get(cryptIndex));
                }
            }
        }

        return cryptString.toString();
    }

    public String decrypt(String input, int key) {
        StringBuilder decryptString = new StringBuilder();
        char[] arr = input.toCharArray();

        for (char c : arr) {
            int num = Character.toLowerCase(c);
            for (int j = 0; j < alphabetList.size(); j++) {
                if (num == alphabetList.get(j)) {
                    int decryptIndex = (j - key) % alphabetList.size();
                    if (decryptIndex < 0) {
                        decryptIndex = alphabetList.size() + ((j - key) % alphabetList.size());
                    }
                    decryptString.append(alphabetList.get(decryptIndex));
                }
            }
        }

        return decryptString.toString();
    }
}
