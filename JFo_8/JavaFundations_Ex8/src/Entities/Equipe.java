package Entities;

public class Equipe {
    private String Nome;
    private int Vitorias;
    private int Derrotas;
    private int Empates;
    private int GolsMarcados;
    private int GolsSofridos;

    public Equipe(String nome){
        Nome = nome;
    }
    
    public String GetNome(){
        return Nome;
    }

    public int GetVitorias(){
        return Vitorias;
    }

    public void SetVitorias(int vitoria){
        Vitorias = vitoria;
    }

    public int GetDerrotas(){
        return Derrotas;
    }

    public void SetDerrotas(int derrota){
        Derrotas = derrota;
    }

    public int GetEmpate(){
        return Empates;
    }

    public void SetEmpate(int empate){
        Empates = empate;
    }

    public int GetGolsMarcados(){
        return GolsMarcados;
    }

    public void SetGolsMarcados(int golsMarcados){
        GolsMarcados = golsMarcados;
    }

    public int GetGolsSofridos(){
        return GolsSofridos;
    }

    public void SetGolsSofridos(int golsSofridos){
        GolsSofridos = golsSofridos;
    }

    public void AtualizaEstatisticas(int golsFeitos, int golsSofridos, boolean vitoria, boolean derrota, boolean empate){
        GolsMarcados = golsFeitos;
        GolsSofridos = golsSofridos;

        if(vitoria){
            Vitorias++;
        }
        else if(empate){
            Empates++;
        }
        else if(derrota){
            Derrotas++;
        }
    }
}
