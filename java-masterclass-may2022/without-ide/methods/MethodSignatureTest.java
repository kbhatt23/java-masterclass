public class MethodSignatureTest{
	
	
		public int save(int num, boolean success){
			return -1;
		}
		//method signature means only method name and variables
		//since these have exact same name and variables it is like duplication
		//een return type is different still compilation error happens
		//public String save(int num, boolean success){
			
			//now parameters are changed and hence it works
			public String save(Integer num, boolean success){
			return "-1";
			
		}
	
	}