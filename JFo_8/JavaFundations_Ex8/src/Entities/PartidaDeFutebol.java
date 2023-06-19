package Entities;

import java.util.ArrayList;
import java.util.Random;

public class PartidaDeFutebol {
    private ArrayList<Jogo> Jogos;
    private Equipe[] Equipes;
    private int TemperaturaSemana;

    public PartidaDeFutebol(int numeroTime) {
        Jogos = new ArrayList<>();
        Equipes = new Equipe[numeroTime];
        TemperaturaSemana = 0;
    }

    public int GetNumeroEquipes(){
        return Equipes.length    ;
    }

    public void AdicionarEquipe(int index, String nome) {
        Equipes[index] = new Equipe(nome);
    }

    public void Jogar(int temperatura) {
        if (temperatura <= 14) {
            TemperaturaSemana++;
        } else {
            TemperaturaSemana = 0;
            Random random = new Random();
            int teamCount = Equipes.length;
            int indexTimeA, indexTimeB;

            do {
                indexTimeA = random.nextInt(teamCount);
                indexTimeB = random.nextInt(teamCount);
            } while (indexTimeA == indexTimeB);

            String timeA = Equipes[indexTimeA].GetNome();
            String timeB = Equipes[indexTimeB].GetNome();

            int golsMaximos = temperatura / 10;

            int golsA = random.nextInt(golsMaximos + 1);
            int golsB = random.nextInt(golsMaximos + 1);

            Jogo jogo = new Jogo(timeA, timeB, temperatura);

            jogo.SetGolsTimeA(golsA);
            jogo.SetGolsTimeB(golsB);

            Jogos.add(jogo);

            AtualizaEstatisticas(indexTimeA, golsA, golsB);
            AtualizaEstatisticas(indexTimeB, golsB, golsA);
        }
    }

    private void AtualizaEstatisticas(int indexTime, int golsFeitos, int golsSofridos) {
        Equipe equipe = Equipes[indexTime];
        boolean vitoria = golsFeitos > golsSofridos;
        boolean empate = golsFeitos == golsSofridos;
        boolean derrota = golsFeitos < golsSofridos;

        equipe.AtualizaEstatisticas(golsFeitos, golsSofridos, vitoria, derrota, empate);
    }

    public void printEstatisticasEquipe() {
        for (Equipe equipe : Equipes) {
            System.out.println("Time: " + equipe.GetNome() +
                    "\nVitorias: " + equipe.GetVitorias() +
                    "\nEmpate: " + equipe.GetEmpate() +
                    "\nDerrotas: " + equipe.GetDerrotas() +
                    "\nGols Marcados: " + equipe.GetGolsMarcados() +
                    "\nGols Sofridos: " + equipe.GetGolsSofridos() +
                    "\n");
        }
    }

    public void printEstatisticasJogo(){
        
        int SomaTemperatura = 0;
        int maiorTemperatura = 0;

        for (Jogo jogo : Jogos) {
            System.out.println("Game# " + jogo.GetIdPartida() + 
            "\nTimes: " + jogo.GetNomeTeamA() + " vs " + jogo.GetNomeTeamB() +
            "\nTemperatura: " + jogo.GetTemperatura() +
            "\nPlacar: " + jogo.GetGolsTimeA() + " - " + jogo.GetGolsTimeB() +
            "\n");

            SomaTemperatura += jogo.GetTemperatura();
            maiorTemperatura = Math.max(maiorTemperatura, jogo.GetTemperatura());
        }

        double mediaTemperatura = (double) SomaTemperatura / Jogos.size();
        System.out.println("Maior temperatura: " + maiorTemperatura);
        System.out.println("Temperatura media: : " + mediaTemperatura);
    }

    public boolean FimDaTemporada(){
        return TemperaturaSemana >= 3;
    }
}