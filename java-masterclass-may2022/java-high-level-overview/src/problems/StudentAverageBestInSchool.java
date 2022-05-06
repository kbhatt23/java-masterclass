package problems;

import java.util.Arrays;

public class StudentAverageBestInSchool {

	public static void main(String[] args) {
		int[][] studentMarks = StudentDataBase.studentMarks();
		StudentDataBase.print(studentMarks, "marks");
		double[] averageMarks =  createAverage(studentMarks );
	
		Arrays.stream(averageMarks)
		   .forEach(average -> System.out.println("average for student: "+average));
	}

	private static double[] createAverage(int[][] studentMarks ) {
		int studentsSize = studentMarks.length;
		//assuming all have same subjects count
		int subjectSize = studentMarks[0].length;
		double[] average = new double[studentsSize];
		
		int minAverageSubjectIndex = 0;
		double minAverageSubjectMarks = Double.MAX_VALUE;
		
		for(int subjectIndex = 0 ; subjectIndex < subjectSize ; subjectIndex++) {
			int total = 0;
			for(int studentIndex = 0 ; studentIndex < studentsSize ; studentIndex++) {
				total += studentMarks[studentIndex][subjectIndex];
			}
			double subjectAverage = (double)total / subjectSize;
			if(subjectAverage < minAverageSubjectMarks) {
				minAverageSubjectIndex = subjectIndex;
				minAverageSubjectMarks = subjectAverage;
			}
				
		}
		System.out.println("min average index "+minAverageSubjectIndex);
		
		for(int studentIndex = 0 ; studentIndex < studentsSize ; studentIndex++) {
			int total = 0;
			for(int subjectIndex = 0 ; subjectIndex < subjectSize ; subjectIndex++) {
				if(subjectIndex != minAverageSubjectIndex)
					total += studentMarks[studentIndex][subjectIndex];
			}
			double subjectAverage = (double)total / (subjectSize - 1);
			average[studentIndex] = subjectAverage;
				
		}
		
		return average;
		
	}
}
