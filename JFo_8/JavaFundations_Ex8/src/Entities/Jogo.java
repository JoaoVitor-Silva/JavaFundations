package Entities;

public class Jogo {
   private static int partida = 0;
    private int Id;

   private String TeamA;
   private String TeamB;

   private int Temperatura;
   private int GolsTimeA;
   private int GolsTimeB;

    public Jogo(String teamA, String teamB, int temperatura){
        Id = partida++;
        TeamA = teamA;
        TeamB = teamB;
        Temperatura = temperatura;
    }

    public int GetIdPartida(){
        return Id;
    }

    public String GetNomeTeamA(){
        return TeamA;
    }

    public String GetNomeTeamB(){
        return TeamB;
    }

    public int GetTemperatura(){
        return Temperatura;
    }

    public int GetGolsTimeA(){
        return GolsTimeA;
    }

    public void SetGolsTimeA(int saldoDeGols){
        GolsTimeA = saldoDeGols;
    }

    public int GetGolsTimeB(){
        return GolsTimeB;
    }

    public void SetGolsTimeB(int saldoDeGols){
        GolsTimeB = saldoDeGols;
    }
}
