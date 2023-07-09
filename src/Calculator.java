import java.util.List;

public class Calculator {
    public int multiply(List<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Список должен содержать как минимум два элемента");
        }

        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);
        int result = firstNumber * secondNumber;
        return result;
    }
}
