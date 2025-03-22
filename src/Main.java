import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");


// 1. вывести имена и возраст
//        Scanner scanner = new Scanner(System.in);
//            System.out.print("Введите ваше имя: ");
//            String name = scanner.nextLine(); //считываем строку
//
//            System.out.print("Введите ваш возраст: ");
//            int age = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Привет, " + name + "! Вам " + age + " лет.");



// вывести массив чисел и их сумму
//      Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 5 чисел");
//
//        int[] numbers = new int[5]; // массив для хранения  5 чисел
//        int sum = 0; // переменная для хранения суммы
//        //запрашиваем 5 чисел
//         for (int i = 0; i < 5; i++)
//         {
//             System.out.print("Введите число " + (i + 1) + ": ");
//             numbers[i] = scanner.nextInt(); // Сохраняем введенное число в массив
//             sum += numbers[i]; // Прибавляем его к общей сумме
//         }
//         System.out.println("Сумма чисел: " + sum);


        //коллекции
//создаем список для хранения имен пользователей
//        ArrayList<String> users = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        // запрашиваем у пользователя ввод имен
//        System.out.println("Введите имена пользователей");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("ведите имя " + (i+1) + ": ");
//            String name = scanner.nextLine();
//            users.add(name);
//        }
//        //сортируем по алфавиту
//        Collections.sort(users);
//
//        //выводим отсортированный список
//        System.out.println("отсортированный список пользователей: ");
//        for (String user : users) {
//            System.out.println(user);
//        }

        //работа с классом и методами

//        Person cat = new Person("Мила", 25);
//        cat.displayInfo();
//        cat.setAge(20);


        //работа с stream api:

        //содание списка обьектов person:
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", 25));
        people.add(new Person("Мария", 17));
        people.add(new Person("Сергей", 30));
        people.add(new Person("Анна", 19));
        people.add(new Person("Николай", 16));
        //фильтрация людей старше 18 лет, сортировка по возрасту и вывод их имен
        List<String>  peopleInfo = people.stream()
                .filter(person -> person.getAge()>18)
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .map(person-> person.getName() +", "+ person.getAge()+ " лет")
                .collect(Collectors.toList());

        //вывод отфильтрованных и отсортированных имен
        System.out.println("Люди старше 18 лет: ");
        peopleInfo.forEach(System.out::println);




    }
}