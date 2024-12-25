package tasks.lines;

/*Дана строка, состоящая из слов, разделенных пробелами.
Необходимо реализовать метод, который возвращает строку,
слова в которой записаны в обратном порядке.
Например, для строки ""test abc"" необходимо получить строку ""abc test"". */

import java.util.Scanner;

public class task2 {
    public static String reverseWords(String inputText) {
        Scanner console = new Scanner(System.in);
        console.nextLine();
        return inputText;
    }

    private task2() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + task2.reverseWords(""));
        System.out.println("Ввод одного слова - " + task2.reverseWords("word"));
        System.out.println("Ввод двух слов - " + task2.reverseWords("два слова"));
    }
}
