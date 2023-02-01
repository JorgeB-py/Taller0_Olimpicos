package uniandes.dpoo.taller0.modificacion;


import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hola mundo");
		String archivo = "./data/atletas.csv";
		CalculadoraEstadisticas calc;
		try {
			calc = LoaderOlimpicos.cargarArchivo(archivo);
			System.out.println("\n"+calc.paisConMasMedallistas());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
