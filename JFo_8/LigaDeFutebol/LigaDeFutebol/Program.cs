using LigaDeFutebol.Entities;

namespace LigaDeFutebol
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter quantity teams: ");
            int teamsCount = int.Parse(Console.ReadLine());

            LeagueSoccer League = new LeagueSoccer(teamsCount);

            for (int indexTeam = 0; indexTeam < teamsCount; indexTeam++)
            {
                Console.Write($"Insert name of the {(indexTeam + 1)} team: ");
                string name = Console.ReadLine();
                League.AddEquipe(indexTeam, name);
            }

            while (!League.ControlLeagueSoccer())
            {
                Console.Write("Inform temperature: ");
                int temperature = int.Parse(Console.ReadLine());

                League.PlaySoccerLeague(temperature);
                Console.ReadKey();
                Console.Clear();
            }

            Console.WriteLine("Statics All Games of Season League: ");
            League.PrintStaticsGames();

            Console.WriteLine("Statics All Teams of Season League: ");
            League.PrintStaticsTeams();
        }
    }
}