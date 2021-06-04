import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class ImprimirVarEnt {

	public static void main(String[] args) {
		Map<String,String> map = System.getenv();
		
		// Observar que se necesitan dos finales de línea
		System.out.println("Content-type: text/html\n");
		
		//Declaración de un documento XHTML
		System.out.println("<!DOCTYPE html>");
		System.out.println(
				"<html lang=\"es\">\n"+
				"<head>\n<meta charset=\"UTF-8\">\n<title> Variables de entorno ejecución CGI </title>\n</head>\n" +
				"<body>");
		map.forEach((k,v)->System.out.println("<p>"+k+"="+v+"</p>"));
/* 		Iterator<Entry<String,String>> ite = map.entrySet().iterator();
		while (ite.hasNext()){
			Entry<String,String> e = ite.next();
			System.out.println("<p>"+e.getKey()+"="+e.getValue()+"</p>");
		} */
		System.out.println("</body>\n" +
				"</html>");
				

	}

}
