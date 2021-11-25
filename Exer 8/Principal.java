public class Principal {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();

		retangulo.setLado(5);
		retangulo.setNomeFigura("João");
		
		System.out.println(retangulo.getArea());
		System.out.println(retangulo.getPerimetro());
		System.out.println(retangulo.getNomeFigura());
		System.out.println(retangulo.getLado());
	}
}
