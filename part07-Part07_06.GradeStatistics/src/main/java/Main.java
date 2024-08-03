import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.valueOf(scan.nextLine());
            if (point == -1) {
                break;
            }

            if (point >= 0 && point <= 100) {
                points.add(point);
            }
        }

        double averageAll = calculateAverage(points);
        double averagePassing = calculatePassingAverage(points);
        double passPercentage = calculatePassPercentage(points);
        int[] gradeDistribution = calculateGradeDistribution(points);

        System.out.println("Point average (all): " + averageAll);
        if (averagePassing == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + averagePassing);
        }
        System.out.println("Pass percentage: " + passPercentage);
        printGradeDistribution(gradeDistribution);
    }

    public static double calculateAverage(ArrayList<Integer> points) {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return 1.0 * sum / points.size();
    }

    public static double calculatePassingAverage(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return 1.0 * sum / count;
    }

    public static double calculatePassPercentage(ArrayList<Integer> points) {
        int passing = 0;
        for (int point : points) {
            if (point >= 50) {
                passing++;
            }
        }
        return 100.0 * passing / points.size();
    }

    public static int[] calculateGradeDistribution(ArrayList<Integer> points) {
        int[] distribution = new int[6];
        for (int point : points) {
            if (point < 50) {
                distribution[0]++;
            } else if (point < 60) {
                distribution[1]++;
            } else if (point < 70) {
                distribution[2]++;
            } else if (point < 80) {
                distribution[3]++;
            } else if (point < 90) {
                distribution[4]++;
            } else {
                distribution[5]++;
            }
        }
        return distribution;
    }

    public static void printGradeDistribution(int[] distribution) {
        for (int i = distribution.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
