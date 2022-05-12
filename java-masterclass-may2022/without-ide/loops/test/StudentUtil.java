public class StudentUtil{
	
	public static void main(String... args){
		char[][] studentsGrades = {{'A','A', 'A' , 'B' } , {'A', 'B' , 'B'}};
		//double[] results = calculateGPA(null , studentsGrades);
		
		//for(int i = 0 ; i < results.length ; System.out.println("gpa of student: s-"+i+" is: "+results[i]), i++);
		int[] studentIds = {1001,1002};
		int[] results = getStudentsByGPA(3.2,3.5 , studentIds , studentsGrades);
		
		for(int i=0 ; i < results.length ; System.out.println("student id: "+results[i]),i++);

	}

 public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] resultGpa = new double[studentsGrades.length];
		int index =0;
		for(char[] grades : studentsGrades){
				
			int total = 0;
				for(char grade : grades){
					total += marksByGrade(grade);
					
				}
				System.out.println("total is "+total);
			resultGpa[index++] = ((double)total)/ grades.length;	
			
		}
		
		
		
		return resultGpa;
    }
	
	public static int marksByGrade(char grade){
	int result ;
	switch(grade){
		
		case 'A' : result = 4;
		        break;
				case 'B' : result = 3;
		        break;
				case 'C' : result = 2;
		        break;
				default : result = -1;
				  break;
				  
		
	}
	return result;
}

  public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        // perform parameter validation. Return null if passed parameters are not valid
        if(lower < 0 || higher < 0 || lower > higher || studentIdList == null || studentIdList.length == 0 || studentsGrades == null || studentsGrades.length ==0)
			return null;
		
        // invoke calculateGPA
		double allStudentGPAs[] = calculateGPA(studentIdList , studentsGrades);
		int resultCount = 0;
		for(double gpa : allStudentGPAs){
			if(gpa >= lower && gpa <= higher)
				resultCount++;
		}
		int result[] = new int[resultCount];
		
	for(int index = 0 ,resultIndex=0; index < allStudentGPAs.length ; index++){
		double gpa = allStudentGPAs[index];
			if(gpa >= lower && gpa <= higher)
				result[resultIndex++] = studentIdList[index];
	}
        
        
		// construct the result array and return it. You would need an extra for loop to compute the size of the resulting array
		return result;
	}
}

