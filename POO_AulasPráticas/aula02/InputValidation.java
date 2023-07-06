package aula02;
import Utils.UserInput;

public class InputValidation {
    public static void main(String[] args) {

        double min = Math.floor(Math.random() * 10) + 1;
        double max = Math.floor(Math.random() * 10) + 10;

        UserInput.ValidateNumberInInterval(null, min, max);

    }
}
