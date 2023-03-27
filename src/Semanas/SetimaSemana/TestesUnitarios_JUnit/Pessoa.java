package Semanas.SetimaSemana.TestesUnitarios_JUnit;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

 class Pessoa{
    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }
    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
