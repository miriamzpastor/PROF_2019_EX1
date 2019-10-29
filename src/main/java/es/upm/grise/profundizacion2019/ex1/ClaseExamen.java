package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		//nodo 1
		float result = 0;
		//nodo 2
		while( a > b) {
			//nodo 3
			a--;
		}
		//nodo 4
		if (a <= b) {
			//nodo 5
			result = 0;
		}
		//nodo 6
		//no entrará nunca aquí
		else {
			result = b;
		}
		//nodo 
		return result;
	}

}
