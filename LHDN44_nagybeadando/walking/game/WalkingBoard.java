package walking.game;
import java.io.*;
import java.util.*;
import walking.game.util.*;

public class WalkingBoard
{
    public static final int BASE_TILE_SCORE = 3;

    private int x = 0;

    private int y = 0;

    private int[][] tiles;

    public int[][] getTiles()
    {
        int [][] copy = new int[this.tiles.length][];
        for(int i = 0; i < this.tiles.length; i++)
        {
            copy[i] = new int[this.tiles[i].length];
            for(int j = 0; j < this.tiles[i].length; j++)
            {
                copy[i][j] = this.tiles[i][j];
            }
        }
        return copy;
    }

    public WalkingBoard(int size)
    {
        tiles = new int[size][size];
        for(int i = 0; i < tiles.length; i++)
        {
            for(int j = 0; j < tiles.length; j++)
            {
                tiles[i][j] = BASE_TILE_SCORE;
            }
        }
    }

    public WalkingBoard(int [][] inputtiles)
    {
            tiles = new int [inputtiles.length][];
            for(int i = 0; i < inputtiles.length; i++)
            {
                tiles[i] = new int[inputtiles[i].length];
                for(int j = 0; j < inputtiles[i].length; j++)
                {
                    if(inputtiles[i][j] < BASE_TILE_SCORE)
                    {
                        tiles[i][j] = BASE_TILE_SCORE;
                    }
                    else
                    {
                        tiles[i][j] = inputtiles[i][j];
                    }
                }
            }
    }

    public int [] getPosition()
    {
        int[] position = new int [2];
        position[0] = this.x;
        position[1] = this.y;
        return position;
    }

    public boolean isValidPosition(int x, int y)
    {
        if(x <= tiles.length && y <= tiles.length && x>= 0 && y >= 0)
        {
            return true;
        }
        return false;
    }

    public int getTile(int x, int y)
    {
        if(!isValidPosition(x,y))
        {
            throw new IllegalArgumentException("The value of X or Y is invalid.");
        }
        else
        {
            return tiles[x-1][y-1];
        }
    }

    public static int getXStep(Direction direction)
    {
        if(direction == Direction.UP)
        {
            return -1;
        }
        else if(direction == Direction.DOWN)
        {
            return 1;
        }
        return 0;
    }

    public static int getYStep(Direction direction)
    {
        if(direction == Direction.LEFT)
        {
            return -1;
        }
        else if(direction == Direction.RIGHT)
        {
            return 1;
        }
        return 0;
    }

    public int moveAndSet(Direction dir, int a)
    {
        if(dir == Direction.UP || dir == Direction.DOWN)
        {
            if(getXStep(dir)+this.x < 0 || getXStep(dir)+this.x >= tiles.length)
            {
                return 0;
            }
            else
            {
                this.x += getXStep(dir);
                int whatwasthere = tiles[this.x][this.y];
                tiles[this.x][this.y] = a;
                return whatwasthere;
            }
        }
        else
        {
            if(getYStep(dir)+this.y < 0 || getYStep(dir)+this.y >= tiles[x].length)
            {
                return 0;
            }
            else
            {
                this.y += getYStep(dir);
                int whatwasthere = tiles[this.x][this.y];
                tiles[this.x][this.y] = a;
                return whatwasthere;
            }
        }
    }
}