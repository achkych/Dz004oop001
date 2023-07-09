import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        List<Integer> integerList = List.of(5, 7, 3, 2);
        if (integerList.size() >= 2) {
            int multiplyResult = calculator.multiply(integerList);
            System.out.println("Результат умножения: " + multiplyResult);
        } else {
            System.out.println("Список должен содержать как минимум два элемента");
        }
    }
}