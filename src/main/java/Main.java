

// dev branch for Y.Practicum
public class Main {
    public static void main(final String[] args) {
        final Calculator calculator = new Calculator();
        calculator.numberOfPerson();
        String rub = "";
        calculator.countProduct();
        double sumResult = calculator.sum / calculator.number;
        if ((Math.floor(sumResult) % 100) >= 11 && (Math.floor(sumResult) % 100) <= 14) {
            rub = "рублей";
        } else {
           if ((Math.floor(sumResult) % 10) == 1) {
            rub = "рубль";
           } else if ((Math.floor(sumResult) % 10) > 1 && (Math.floor(sumResult) % 10) < 5) {
            rub = "рубля";
           } else if ((Math.floor(sumResult) % 10) > 5) {
               rub = "рублей";
           }
        }
        String line = String.format("Добавленные товары:\n%s\nцена, которую должен заплатить каждый %.2f %s", calculator.result, sumResult, rub);
        System.out.println(line);
    }
}

