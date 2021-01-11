package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Это программа калькулятор.");
        System.out.println("Введите через пробел числа от 1 до 10 и операцию между ними (+, -, * или /)");
        while (c != 400){
            String operation = in.nextLine();
            String[] sls = operation.split(" ");
            String a = sls[0];
            String ope = sls[1];
            String b = sls[2];
            try {
                Byte a1 = Byte.valueOf(a);
                Byte b1 = Byte.valueOf(b);
                if (a1 > 10 | a1 < 1 | b1 > 10 | b1 < 1) {
                    System.out.println("Ошибка!");
                    break;
                } else {
                    switch (ope) {
                        case ("*"):
                            c = a1 * b1;
                            System.out.println(c);
                            break;
                        case ("/"):
                            c = a1 / b1;
                            System.out.println(c);
                            break;
                        case ("+"):
                            c = a1 + b1;
                            System.out.println(c);
                            break;
                        case ("-"):
                            c = a1 - b1;
                            System.out.println(c);
                            break;
                        default:
                            System.out.println("Ошибка!");
                            c = 400;
                    }
                }
            } catch (NumberFormatException e) {
                Byte a1 = 0;
                if (a.equals("I"))
                    a1 = 1;
                else if (a.equals("II"))
                    a1 = 2;
                else if (a.equals("III"))
                    a1 = 3;
                else if (a.equals("IV"))
                    a1 = 4;
                else if (a.equals("V"))
                    a1 = 5;
                else if (a.equals("VI"))
                    a1 = 6;
                else if (a.equals("VII"))
                    a1 = 7;
                else if (a.equals("VIII"))
                    a1 = 8;
                else if (a.equals("IX"))
                    a1 = 9;
                else if (a.equals("X"))
                    a1 = 10;
                else {
                    System.out.println("Ошибка!");
                    break;
                }
                Byte b1 = 0;
                if (b.equals("I"))
                    b1 = 1;
                else if (b.equals("II"))
                    b1 = 2;
                else if (b.equals("III"))
                    b1 = 3;
                else if (b.equals("IV"))
                    b1 = 4;
                else if (b.equals("V"))
                    b1 = 5;
                else if (b.equals("VI"))
                    b1 = 6;
                else if (b.equals("VII"))
                    b1 = 7;
                else if (b.equals("VIII"))
                    b1 = 8;
                else if (b.equals("IX"))
                    b1 = 9;
                else if (b.equals("X"))
                    b1 = 10;
                else
                    System.out.println("Ошибка!");
                    c = 400;
                String[] rims = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
                switch (ope) {
                    case ("*"):
                        c = a1 * b1;
                        System.out.println(rims[c]);
                        break;
                    case ("/"):
                        c = a1 / b1;
                        System.out.println(rims[c]);
                        break;
                    case ("-"):
                        c = a1 - b1;
                        if (c < 0)
                            System.out.println("-" + rims[-1 * c]);
                        else
                            System.out.println(rims[c]);
                        break;
                    case ("+"):
                        c = a1 + b1;
                        System.out.println(rims[c]);
                        break;
                    default:
                        System.out.println("Ошибка!");
                        break;
                }
            }
        }
    }
}