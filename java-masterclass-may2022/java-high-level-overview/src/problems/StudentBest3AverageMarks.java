package problems;

import java.util.Arrays;

public class StudentBest3AverageMarks {

	public static void main(String[] args) {
		int[][] studentMarks = StudentDataBase.studentMarks();
		StudentDataBase.print(studentMarks, "marks");
		int bestN = 3;
		double[] averageMarks =  createAverage(studentMarks ,bestN );
	
		Arrays.stream(averageMarks)
		   .forEach(average -> System.out.println("average for student: "+average));
	}

	private static double[] createAverage(int[][] studentMarks , int bestN) {
		double[] averageMarks = new double[studentMarks.length];
		for(int i = 0 ; i < studentMarks.length ; i++) {
			int[] findnLargestNumbers = FindNLargestNumbersInArray.findnLargestNumbers(studentMarks[i], 3);
			int total = Arrays.stream(findnLargestNumbers).sum();
			averageMarks[i] = (double)total/ bestN;
		}
		return averageMarks;
	}
}
