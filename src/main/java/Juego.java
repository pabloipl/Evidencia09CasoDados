public class Juego {

	public void jugar() {
		Dado dado=new Dado();
		Dado dado2=new Dado();

		System.out.println("Tirando dados..");
		Calculadora calculadora = new Calculadora();
		if (calculadora.suma(dado.cara1, dado2.cara1) == 7) {
			System.out.println("Ganaste!!!");
			System.out.println("El número de caras es: " + dado.cara1 + " y " + dado2.cara1);
		} else {
			System.out.println("Perdiste :( ");
			System.out.println("El número de caras es: " + dado.cara1 + " y " + dado2.cara1);

		}


	}
}