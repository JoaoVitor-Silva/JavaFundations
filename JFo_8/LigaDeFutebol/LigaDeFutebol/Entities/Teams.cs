using System.Security.Cryptography;

namespace LigaDeFutebol.Entities
{
    internal class Teams
    {
        public string Name { get; private set; }
        public int Wins { get; set; }
        public int Losses { get; set; }
        public int Draws { get; set; }
        public int GoalsMarked { get; set; }
        public int GoalsSuffered { get; set; }
    
        public Teams(string name)
        {
            Name = name;
        }

        public void UpdateStaticsTeam(bool win, bool lose, bool draw, int goalsMarked, int goalsSuffered)
        {
            GoalsMarked += goalsMarked;
            GoalsSuffered += goalsSuffered;

            if (win)
                Wins++;
            else if (draw)
                Draws++;
            else if (lose)
                Losses++;
        }
    }
}
