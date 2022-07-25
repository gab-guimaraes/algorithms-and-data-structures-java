package org.johnwick182.OOReview;

/*
Abstract class Screen
Abstract methods must have only signature.
Consider using abstract classes if any of these statements apply:
- Voce quer compartilhar codigo com outras classes
- Voce espera que classes que estendam essa tenham metodos ou campos em comum
- Voce quer declarar nao staticos e staticos campos. 
 */
public abstract class Screen {
    private String titulo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String obterInformacao();

    public void imprimir() {
        System.out.println(this.titulo);
        System.out.println("\t" + obterInformacao());
    }


}
