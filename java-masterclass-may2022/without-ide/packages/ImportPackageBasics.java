//rules
//a. classes in same package need no import or fully qualified name
//b. it is preferred to use specific type as in future .* import class can cau isse
//see java.util.* and java.sql.* scneario

//c. java.lang package need not to be imported
//d. importing too many packages have no impact on bytecode not in performance nor in bytecode size 

//import java.util.ArrayList;
import java.util.*;
//solution is to import specific classes from either util or this and save conflictScenario
//or use fully qualified name
import java.sql.*;
public class ImportPackageBasics{
	
	public static void main(String... args){
		//noimportNeeded();
	//specificImport();
	//conflictScenario();
	autoimportlangpackage();
	}
	
	static void noimportNeeded(){
		AnotherClass obj = new AnotherClass();
		obj.print();
	}
	
	static void specificImport(){
		ArrayList obj = new ArrayList();
		obj.add("sita ram");
		obj.add("uma mahesh");
		
		System.out.println("size is "+obj.size());
	}
	
	//as of now only util date is there but we have imported using java.util.*
	//in future if we want to use some class of sql package and do java.sql.* import it conflicts existing Date class import and usage
	static void conflictScenario(){
		java.util.Date date = new java.util.Date();
		System.out.println("current date "+date);
	}
	
	static void autoimportlangpackage(){
		Integer a = 23;
		String b = "sita ram";
		System.out.println(a + " says "+ b);
		
	}
	
	
}