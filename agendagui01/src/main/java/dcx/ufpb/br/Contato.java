package dcx.ufpb.br;

public class Contato {
    private String nome;
    private int dia;
    private int mes;

    public Contato(String nome, int dia, int mes){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaAniversario() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMesAniversario() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String toString() {
        return "Contato de nome: " + this.nome;
    }
}
