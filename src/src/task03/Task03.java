package src.task03;
/*
Создайте программу, которая выводит введенные имя и фамилию на экран в разных строках.
Имя и фамилия должны приходить в аргументах
Ввод: Ivan Ivanov
Вывод:
Ivan
Ivanov
 */
public class Task03 {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
