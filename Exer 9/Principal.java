public class Principal {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setMarca("Fiat");
		carro.setModelo("Uno da firma com escada");
		carro.setAno(2002);
		carro.setPlaca("CSY-0568");
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getAno());
		System.out.println(carro.getPlaca());
		System.out.println(carro.getModelo());
	}
}
