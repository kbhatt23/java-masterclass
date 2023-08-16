package stringapienhancements;

public class StringInerpolationDemo {

	public static void main(String[] args) {
		String htmlTough = "<html>" +
							"\n<header>"+"</header>"+
				           "\n<body>"+
							"\n<ul>"+
				            "\n  <li>option1- %s"+"</li>"+
				            "\n  <li>option2- %s" +"</li>"+
				            "\n</body>"+
				          "\n</html>";
		
		System.out.println(String.format(htmlTough, "sita rama","radhe shyam"));
		System.out.println("====================================");
		
		String htmlTextFormat = """
				<html>
				<header></header>
				<body>
				<ul>
				  <li>option1- %s</li>
				  <li>option2- %s</li>
				</body>
				</html>
				""";

		System.out.println(htmlTextFormat.formatted("sita rama","radhe shyam"));
	}
}
