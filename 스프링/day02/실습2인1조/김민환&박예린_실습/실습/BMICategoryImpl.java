package day2Prac.실습;

public class BMICategoryImpl implements BMICategory {
    @Override
    public String category(double bmi) {
        if (bmi < 18.5) return "저체중";
        else if (bmi < 23) return "정상체중";
        else if (bmi < 25) return "과체중";
        else return "비만";
    }
}
