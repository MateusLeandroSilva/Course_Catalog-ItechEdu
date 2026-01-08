package model;

public class   PacoteCurso {

    private String nome;
    private String descricao;
    private int cargaHoraria;
    private int meses;
    private String valor;

    public PacoteCurso(String nome, String descricao, int cargaHoraria, int meses, String valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.meses = meses;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDetalhes() {
        return "📚 " + nome + "\n\n"
                + descricao + "\n\n"
                + "⏱ Carga Horária: " + cargaHoraria + " horas\n"
                + "📆 Duração: " + meses + " meses\n"
                + "💰 Valor: " + valor;
    }
}
