import java.util.ArrayList;
import java.util.List;


public class ex1 {

//a)
    public static List<Integer> failedGrades(int[] grades) {
        List<Integer> failingGrades = new ArrayList<>();

        for (int grade:grades) {
            if (grade<40) {
                failingGrades.add(grade);
            }
        }
        return failingGrades;
    }

    public static void main(String[] args) {
        int[] grades = {84, 29, 57, 38, 33};
        List<Integer> failingGrades = failedGrades(grades);

        System.out.println("Failed grades: " + failingGrades);

        double average=ex1.calculateAverage(grades);
        System.out.println("Average grade: " + average);

        int[] rndGrades=getRoundedGrades(grades);
        System.out.print("Rounded Grades: ");
        for (int grade : rndGrades) {
            System.out.print(grade+" ");
        }
        System.out.println();
        int bstGrade=getBestGrade(grades);
        System.out.print("Best Grade: " + bstGrade);



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
//c)
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
    public static int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = roundGrade(grades[i]);
        }
        return roundedGrades;
    }

//d)

    public static int getBestGrade(int[] grades) {
        int maxGrade=0;
        for (int grade:grades) {
            int roundedGrade = roundGrade(grade);
            if (roundedGrade > maxGrade) {
                maxGrade = roundedGrade;
            }
        }

        return maxGrade;
    }
}

