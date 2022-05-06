public class MethodOverloading{
	
	
		public void update(int num){
			System.out.println("int num is "+num);
		}
		
		public void update(short num){
			System.out.println("short num is "+num);
		}
		
		public static void main(String... args){
		
			MethodOverloading obj  = new MethodOverloading();
			
			//23 lies in the range of short//but since literal is deaulted to int and hence it will call int
			//remember overloading si static polymorphism and hence we never know value of num variable and hence it is int always
			obj.update(23);
			
			//now literla val int is holding in byte and hence static polymorphism forces next closest upper bound
			byte num = 23;
			obj.update(num);
		}
	
	}