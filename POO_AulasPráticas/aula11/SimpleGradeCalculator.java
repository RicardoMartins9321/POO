package aula11;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator{
    @Override
    public double calculate(List<Double> grades) {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
