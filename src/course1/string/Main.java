package course1.string;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        runHomeWorkTask1();
        runHomeWorkTask2();
        runHomeWorkTask3();
    }
    public static void runHomeWorkTask1() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);
    }
    public static void runHomeWorkTask2() {
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameCaps = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameCaps);
    }
    public static void runHomeWorkTask3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}
