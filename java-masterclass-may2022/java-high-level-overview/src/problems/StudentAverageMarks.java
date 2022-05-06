package problems;

import java.util.Arrays;

public class StudentAverageMarks {

	public static void main(String[] args) {
		int[][] studentMarks = StudentDataBase.studentMarks();
		StudentDataBase.print(studentMarks, "marks");
		
		double[] averageMarks =  createAverage(studentMarks);
	
		Arrays.stream(averageMarks)
		   .forEach(average -> System.out.println("average for student: "+average));
	}

	private static double[] createAverage(int[][] studentMarks) {
		double[] averageMarks = new double[studentMarks.length];
		for(int i = 0 ; i < studentMarks.length ; i++) {
			int total = 0;
			for(int j=0; j <studentMarks[i].length ; j++) {
				total += studentMarks[i][j];
			}
			averageMarks[i] = (double)total/ studentMarks.length;
		}
		return averageMarks;
	}
}
