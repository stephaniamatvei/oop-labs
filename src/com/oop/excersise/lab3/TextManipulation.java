package com.oop.excersise.lab3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextManipulation {
    private final String text;
    private int sentences;
    private int words;
    private int letters;
    private int vowels;
    private int consonants;
    private String longestWord;
    private List<String> topFiveWords;

    public TextManipulation(String text) {
        this.text = text;
        textFunctions();
    }

    private void textFunctions() {
        sentenceCounter(this.text);
        wordsCounter(this.text);
        lettersCounter(this.text);
        getLongestWord(this.text);
        getTopFiveWords(this.text);
    }

    private void sentenceCounter(String text) {
        this.sentences = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                sentences++;
            }
    }

    private void wordsCounter(String text) {
        this.words = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') {
                words++;
            }
    }

    private void lettersCounter(String text) {
        text = text.replaceAll("[^A-Za-z]+", "");
        this.letters = text.length();
        this.vowels = 0;
        this.consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))) {
                this.vowels++;
            } else {
                this.consonants++;
            }
        }
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

    private void getLongestWord(String text) {
        text = text.replaceAll("[^A-Za-z]+", " ");
        String[] wordArray = text.split(" ");

        this.longestWord = "";

        for (String s : wordArray) {
            if (s.length() > this.longestWord.length()) {
                this.longestWord = s;
            }
        }
    }

    private void getTopFiveWords(String text) {
        final var words = text.split("\\W+");
        final var counter = new HashMap<String, Integer>();

        Stream.of(words).forEach((i) -> {
            if (counter.containsKey(i)) {
                counter.put(i, counter.get(i) + 1);
            } else {
                counter.put(i, 1);
            }
        });

        this.topFiveWords = counter.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Text Manipulation: " +
                "\n sentences = " + sentences +
                ";\n words = " + words +
                ";\n letters = " + letters +
                ";\n vowels = " + vowels +
                ";\n consonants = " + consonants +
                ";\n longest word = " + longestWord +
                ";\n top 5 words = " + topFiveWords +
                ";\n";
    }

}
