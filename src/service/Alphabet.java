package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alphabet {
    private static final Character[] RU_ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private static final Character[] SYMBOLS = {'.', ',', '«', '»', '"', ':', ';', '*', '!', '\'', '?', '-', '=',
            '+', '_', '(', ')', '\\', '/', ' '};
    private static final Character[] DIGITS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public List<Character> getAlphabet() {
        List<Character> listAlphabets = new ArrayList<>();
        listAlphabets.addAll(Arrays.asList(RU_ALPHABET));
        listAlphabets.addAll(Arrays.asList(SYMBOLS));
        listAlphabets.addAll(Arrays.asList(DIGITS));
        return listAlphabets;
    }
}
