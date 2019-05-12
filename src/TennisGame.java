public class  TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore= LOVE;
        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult== FIFTEEN) score ="Advantage player1";
            else if (minusResult ==-FIFTEEN) score ="Advantage player2";
            else if (minusResult>= THIRTY) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i = FIFTEEN; i< FORTY; i++)
            {
                if (i== FIFTEEN) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case LOVE:
                        score+="Love";
                        break;
                    case FIFTEEN:
                        score+="Fifteen";
                        break;
                    case THIRTY:
                        score+="Thirty";
                        break;
                    case FORTY:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
