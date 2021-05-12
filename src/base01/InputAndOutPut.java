package base01;

import java.util.Scanner;

public class InputAndOutPut {
    Scanner scanner = new Scanner(System.in);
    public void improvePercent () {
        int lastGrades, currentGrades;
        System.out.println("请输入上次考试成绩：");
        lastGrades = scanner.nextInt();
        System.out.println("请输入本次考试成绩：");
        currentGrades = scanner.nextInt();
        double improvePercent = (((double) currentGrades / lastGrades) - 1) * 100;
        System.out.printf("本次成绩提高：%.2f%%", improvePercent);
    }
}
