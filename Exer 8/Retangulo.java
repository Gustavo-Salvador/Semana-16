// Exerc�cio 8
public class Retangulo implements FiguraGeometrica {
	private String nomeFigura;
	private int area;
	private int perimetro;
	private int lado;

	public void setLado(int lado) {
		this.lado = lado;
	}
	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}

	public int getLado() {
		return this.lado;
	}

	@Override
	public String getNomeFigura() {
		return this.nomeFigura;
	}
	@Override
	public int getArea() {
		this.area = this.lado * this.lado;
		return this.area;
	}
	@Override
	public int getPerimetro() {
		this.perimetro = this.lado * 4;
		return this.perimetro;
	}
}