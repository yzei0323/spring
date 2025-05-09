package day2Prac.실습;

public class BMIProgram {
    private BMICalculator calculator;
    private BMICategory category;

    public BMIProgram(BMICalculator calculator, BMICategory category) {
        this.calculator = calculator;
        this.category = category;
    }

    public String execute(double h, double w) {
        double hm = h / 100.0;
        double bmi = calculator.bmi(hm, w);
        String result = category.category(bmi);
        return String.format("당신의 BMI는 " + bmi + "(" + result + ")입니다.");
    }
}
