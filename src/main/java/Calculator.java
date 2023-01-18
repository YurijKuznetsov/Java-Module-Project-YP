import java.util.Scanner;

public class Calculator {
    String nameProduct;
    String result;
    double priceProduct;
    double sum;
    int number;

    void countProduct() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        while (true) {
            System.out.println("Введите название товара:");
            this.nameProduct = scanner.next();
            if (this.nameProduct == null) continue;
            if (this.nameProduct.equalsIgnoreCase("Завершить")) break;
            System.out.println("Введите стоимость товара:");
            while (true) {
                if (scanner.hasNextDouble()) {
                    this.priceProduct = scanner.nextDouble();
                    if (this.priceProduct < 0) {
                        System.out.println("Некорректное значение для подсчета");
                    } else if (this.priceProduct >= 0) {
                        builder.append(this.nameProduct).append("\n");
                        this.sum = this.sum + this.priceProduct;
                        System.out.println("Товар " + this.nameProduct + " добавлен.\nХотите добавить следующий товар?");
                        break;
                    }
                } else {
                    System.out.println("Введённое значение не является числом");
                    scanner.next();
                }

            }
        }
        this.result = builder.toString();
    }

    void numberOfPerson() {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("На скольких человек разделить счёт?");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (this.number == 1) {
                    System.out.println("Нет смысла делить счёт.");
                } else if (this.number < 1) {
                    System.out.println("Некорректное значение для подсчёта.");
                } else {
                    break;
                }
            } else {
                System.out.println("Введенное значениемне не является числом.");
                scanner.next();
            }
        }
    }
}

