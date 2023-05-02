public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Имя";
        firstName = "Ivan";
        String middleName = "Отчество";
        middleName = "Ivanovich";
        String lastName = "Фамилия";
        lastName = "Ivanov";
        String fullName = "Фамилия Имя Отчество";
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameTrue);
    }
}