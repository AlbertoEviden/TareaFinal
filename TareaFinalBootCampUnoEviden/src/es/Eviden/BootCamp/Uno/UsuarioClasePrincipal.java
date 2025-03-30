package es.Eviden.BootCamp.Uno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.Eviden.BootCamp.Uno.UsuarioConfig;
import es.Eviden.BootCamp.Uno.UsuariosInterfaces;


public class UsuarioClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Llamamos al bean correspondiente de nuestra clase de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(UsuarioConfig.class);
		
		//Creamos el bean utilizando el nombre clave de la clase de java con la presencia de la interfaz
		
		UsuariosInterfaces usuario1 = contexto.getBean("usuariosClase", UsuariosInterfaces.class);
		
		//Mostramos el resultado por consola
		
		System.out.println("Vamos a mostrar los resultados del proyecto 1, trabajando con Spring y Java: \n");
		System.out.println("Nombre: " +usuario1.insertarNombre("Alberto"));
		System.out.println("Apellidos: "+usuario1.insertarApellidos("Campanero" , "Arévalo" ));
		//Añadimos un ejemplo para comprobar que los apellidos sean los correctos si o si
		System.out.println("Apellidos: "+usuario1.insertarApellidos("Martinez" , "Arévalo \n"));
		System.out.println("Datos del usuario" +usuario1.mostrarInformacion("alberto.campanero.arevalo@gmail.com", "A940494 \n"));
		System.out.println(usuario1.lanzarMensaje() + "\n");
		System.out.println(usuario1.mostrarActividad());
		
	
		
		//Cerramos el bean
		contexto.close();


	}

}