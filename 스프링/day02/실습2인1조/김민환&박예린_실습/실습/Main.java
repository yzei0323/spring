package day2Prac.실습;

public class Main {
    public static void main(String[] args) {
        BMICalculator calc = new BMICalculatorImpl();
        BMICategory judge = new BMICategoryImpl();

        BMIProgram program = new BMIProgram(calc, judge);

        double h = 170;  // cm
        double w = 60;   // kg

        String result = program.execute(h, w);
        System.out.println(result);
    }
}