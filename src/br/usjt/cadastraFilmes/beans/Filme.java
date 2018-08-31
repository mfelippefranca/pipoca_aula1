package br.usjt.cadastraFilmes.beans;


public class Filme {

   private int id;
   private String titulo;
   private int anoLancamento;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAnoLancamento() {
	return anoLancamento;
}
public void setAnoLancamento(int anoLancamento) {
	this.anoLancamento = anoLancamento;
}
 
}
