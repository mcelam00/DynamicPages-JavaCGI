
public class HolaMundoCGI {	//Generara la pagina dinamica y sera llamado por apache. Apache se comunica con el prorama mediante las variables de entorno añade variables de entorno asociadas a la peticion http que le han hecho.

	public static void main(String[] args) {
		String query_string = System.getenv("QUERY_STRING"); //variable de entorno que ante una peticion Get recupera el ?nombreCampo=valor. La entrada y salida estandar del programa se redirigen por apache. Leemos por scanner de system in y la salida va con system out println
		
		// Observar que se necesitan dos finales de línea
		System.out.println("Content-type: text/html\n"); //provocamos la salida de la cabecera minima de la http response, el contenido que vamos a enviar, y a la salida estandar
		//tenemos que añadir una linea final que se exige por el protocolo para con el cuerpo del mensaje que es lo que sigue
		
		String web;
		String[] params = {"","Mundo"}; //params es un array de dos posiciones que obtengo dividiendo el resultado de la consulta de la variable entorno (nombre=valor)

	if (query_string.length() != 0){ //por si acaso hacen una peticion post
			params = query_string.split("=");	//usamos split por el = y tenemos los dos valores
	} //construimos el texto de una pagina html y toda esa pagina compuesta con el valor recogido del formulario de la url mediante la variable de entorno, la encastramos y mandamos toda ella a la salida estandar
		web = "<!DOCTYPE html>\n<html>\n"+
				"<head><title> Mi primer CGI </title></head>\n" +
				"<body>\n" +
				"<p>Hola " + params[1] + "</p>\n" +	//adjuntamos la segunda posicion del array que sería el valor correspondiente al campo del formulario que se introdujo en el lado del cliente y que viajó en la URL. 
				"</body>\n" +
				"</html>";
		System.out.println(web);
}
}
