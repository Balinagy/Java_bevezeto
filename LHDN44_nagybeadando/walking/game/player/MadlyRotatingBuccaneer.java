package walking.game.player;

public class MadlyRotatingBuccaneer extends Player
{

    public MadlyRotatingBuccaneer()
    {
        super();
        turnCount = 0;
    }
    private int turnCount;

    public void turn()
    {
        for(int i = 0; i < turnCount; i++)
        {
            super.turn();
        }
        turnCount++;
    }
}