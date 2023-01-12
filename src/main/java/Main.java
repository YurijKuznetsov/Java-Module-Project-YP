import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {
    public static void main(final String[] args) {
        final Calculator calculator = new Calculator();
        calculator.numberOfPerson();
        String rub = "";
        calculator.countProduct();
        double sumResult = calculator.sum / calculator.number;
        if ((int) sumResult == 1) {
            rub = "рубль";
        } else if ((int) sumResult > 1 && (int) sumResult < 5) {
            rub = "рубля";
        } else if ((int) sumResult > 5) {
            rub = "рублей";
        }
        String line = String.format("Добавленные товары:\n%s\nцена, которую должен заплатить каждый %.2f %s", calculator.result, sumResult, rub);
        System.out.println(line);
    }
}

class Calculator {
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
