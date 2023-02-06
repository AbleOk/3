import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // класс для ввода данных
        System.out.print("Денег на счету: ");
        double moneyNow = in.nextDouble(); // вводим кол-во денег на счету
        System.out.print("Пополнили счёт на сумму: ");
        double moneyUP = in.nextDouble(); // и на какую сумму пополнили счёт

        double bonus;
        if(moneyUP > 1000) { // если пополнили больше, чем на 1000,
            bonus = Math.floor(moneyUP) / 100; // то вычисляем количество бонусов (рубль за каждые полные 100 рублей)
            System.out.println("Ваш бонус " + Math.floor(bonus) + " рублей!"); // выводим на экран количество бонусов
            moneyNow = moneyNow + moneyUP + Math.floor(bonus); // начисляем сумму + бонусы (за каждые полные 100 рублей)
            System.out.println("На Вашем счету " + moneyNow + " рублей"); // выводим кол-во денег на счету
        }
        else {
            moneyNow = moneyNow + moneyUP; // иначе начисляем сумму
            System.out.println("На Вашем счету " + moneyNow + " рублей"); // и выводим кол-во денег на счету
        }

    }
}
