
public class HolaMundoCGI {

	public static void main(String[] args) {
		String query_string = System.getenv("QUERY_STRING");
		
		// Observar que se necesitan dos finales de línea
		System.out.println("Content-type: text/html\n");
		
		String web;
		String[] params = {"","Mundo"};

	if (query_string.length() != 0){
			params = query_string.split("=");
	}
		web = "<!DOCTYPE html>\n<html>\n"+
				"<head><title> Mi primer CGI </title></head>\n" +
				"<body>\n" +
				"<p>Hola " + params[1] + "</p>\n" +
				"</body>\n" +
				"</html>";
		System.out.println(web);
}
}
