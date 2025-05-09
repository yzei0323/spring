package day2Prac.실습;

public class BMICalculatorImpl implements BMICalculator {
    @Override
    public double bmi(double heightMeter, double weightKg) {
        return weightKg / (heightMeter * heightMeter);
    }
}