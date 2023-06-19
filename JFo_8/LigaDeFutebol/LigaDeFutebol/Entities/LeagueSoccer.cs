namespace LigaDeFutebol.Entities
{
    internal class LeagueSoccer
    {
        public List<Games> Games { get; set; }
        public Teams[] Teams { get; set; }
        public int ControlTempWeek { get; set; } = 0;

        public LeagueSoccer(int indexPlaySoccer)
        {
            Games = new List<Games>();
            Teams = new Teams[indexPlaySoccer];
            ControlTempWeek = 0;
        }

        public void AddEquipe(int indexTime, string nome)
        {
            Teams[indexTime] = new Teams(nome);
        }

        public void PlaySoccerLeague(int temperature)
        {
            if (temperature < 10)
                ControlTempWeek++;
            else
            {
                ControlTempWeek = 0;
                Random random = new Random();

                int teamCount = Teams.Length;
                int indexTimeA, indexTimeB;

                do
                {
                    indexTimeA = random.Next(teamCount);
                    indexTimeB = random.Next(teamCount);
                }
                while(indexTimeA == indexTimeB);

                string nameTimeA = Teams[indexTimeA].Name;
                string nameTimeB = Teams[indexTimeB].Name;

                int percentGols = temperature / 10;
                int GolsMarkedTimeA = random.Next(percentGols);
                int GolsMarkedTimeB = random.Next(percentGols);

                Games game = new Games(nameTimeA, nameTimeB, temperature);

                game.GolsTeamA = GolsMarkedTimeA;
                game.GolsTeamB = GolsMarkedTimeB;

                Games.Add(game);

                UpdateStatics(indexTimeA, GolsMarkedTimeA, GolsMarkedTimeB);
                UpdateStatics(indexTimeB, GolsMarkedTimeB, GolsMarkedTimeA);
            }    
        }

        public void UpdateStatics(int index, int golsMarked, int golsSuffered)
        {
            Teams team = Teams[index];

            bool Wim = golsMarked > golsSuffered;
            bool Draw = golsMarked == golsSuffered;
            bool Lose = golsMarked < golsSuffered;

            team.UpdateStaticsTeam(Wim, Lose, Draw, golsMarked, golsSuffered);
        }

        public void PrintStaticsGames()
        {
            double AvarageTemperature = 0; 
            int HottestTemperature = 0, SumTemperature = 0;

            foreach (Games game in Games)
            {
                Console.WriteLine($"Game {game.Id}" +
                    $"\nTemperature {game.Temperature}" +
                    $"\nAway team: {game.TeamA}" +
                    $"\nHome team: {game.TeamB}" +
                    $"\n");
                SumTemperature += game.Temperature;
                HottestTemperature = Math.Max(HottestTemperature, game.Temperature);
            }

            AvarageTemperature = (double)SumTemperature / Games.Count;
            Console.Write($"Hottest temperature: {HottestTemperature}" +
                $"\nAvarage temperature: {AvarageTemperature}" +
                $"\n");
        }

        public void PrintStaticsTeams()
        {
            foreach(Teams team in Teams)
            {
                Console.WriteLine($"Team {team.Name}" +
                    $"\nWins: {team.Wins}, Ties: {team.Draws}, Losses: {team.Losses}" +
                    $"\nPoints Score: {team.GoalsMarked}, Points Allowed: {team.GoalsSuffered}" +
                    $"\n");
            }
        }

        public bool ControlLeagueSoccer()
        {
            return ControlTempWeek >= 3;
        }
    }
}
