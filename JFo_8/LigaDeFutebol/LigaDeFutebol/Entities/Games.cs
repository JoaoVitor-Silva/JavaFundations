namespace LigaDeFutebol.Entities
{
    internal class Games
    {
        public static int NumGame { private get; set; } = 0;

        public int Id { get; private set; }
        public string TeamA { get; set; }
        public string TeamB { get; set; }

        public int GolsTeamA { get; set; }
        public int GolsTeamB { get; set; }

        public int Temperature { get; set; }

        public Games(string teamA, string teamB, int temperature)
        {
            Id = NumGame++;
            TeamA = teamA;
            TeamB = teamB;
            Temperature = temperature;
        }
    }
}
