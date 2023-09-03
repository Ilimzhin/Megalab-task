package thirdWeek.thirdDay;

public class ThirdDayMethods {

    void dayOfTheWeek(int seventhNum) {
        String[] seventhWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(seventhWeek[seventhNum-1]);
    }

    void moreLessValue(int sixthNum1) {
        boolean sixthRes = sixthNum1>5?true:false;
        System.out.println(sixthRes);
    }

    void valueInDegree(int fourthNum, int fourthNum2) {

        System.out.printf("%d^%d+%d^%d = %d\n",fourthNum,fourthNum2,fourthNum,fourthNum2,
                (int)(Math.pow(fourthNum,fourthNum2)+Math.pow(fourthNum,fourthNum2)));
    }

    void cubeValue(int thirdNum) {
        System.out.println((int) Math.pow(thirdNum,3));
    }
    void quadrateValue(int secondNum) {
        System.out.println((int) Math.pow(secondNum,2));
    }

    void minValue(int firstNum, int firstNum2) {
        String minValue = String.valueOf(firstNum>firstNum2? firstNum2 : firstNum);
        System.out.println(minValue);
    }



}
