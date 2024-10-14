import java.util.ArrayList;
import java.util.List;

public class ex1 {

    public static int roundGrade(int grade) {
        if (grade < 38) {
            return grade;
        }
        int multiple5 = ((grade / 5) + 1) * 5;
        if (multiple5-grade < 3) {
            return multiple5;
        }
        return grade;
    }
//a)
    public static List<Integer> failedGrades(int[] grades) {
        List<Integer> failingGrades = new ArrayList<>();

        for (int grade:grades) {
            int roundedGrade=roundGrade(grade);
            if (roundedGrade<40) {
                failingGrades.add(roundedGrade);
            }
        }
        return failingGrades;
    }

    public static void main(String[] args) {
        int[] grades = {84, 29, 57, 38, 33};
        List<Integer> failingGrades = failedGrades(grades);

        System.out.println("Failed grades: " + failingGrades);

        double average=calculateAverage(grades);
        System.out.println("Average grade: " + average);
    }
//b)
    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum/grades.length;
    }


}

