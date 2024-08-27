package walking.game.player;
import walking.game.util.Direction;

public class Player
{
    private int score = 0;

    public int getScore()
    {
        return score;
    }

    protected Direction direction = Direction.UP;

    public Direction getDirection()
    {
        return direction;
    }

    public Player(){}

    public void addToScore(int x)
    {
        this.score += x;
    }

    public void turn()
    {
        if(direction == Direction.UP)
        {
            direction = Direction.RIGHT;
        }
        else if(direction == Direction.RIGHT)
        {
            direction = Direction.DOWN;
        }
        else if(direction == Direction.DOWN)
        {
            direction = Direction.LEFT;
        }
        else
        {
            direction = Direction.UP;
        }
    }
}