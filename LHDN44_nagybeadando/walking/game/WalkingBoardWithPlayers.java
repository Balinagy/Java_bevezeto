package walking.game;
import walking.game.*;
import walking.game.player.*;
import java.util.*;
import java.io.*;

public class WalkingBoardWithPlayers extends WalkingBoard
{
    private MadlyRotatingBuccaneer MadlyRotatingBuccaneer;
    
    private Player [] players;

    private int round;

    public static final int SCORE_EACH_STEP = 13;

    public WalkingBoardWithPlayers(int [][] board, int playerCount)
    {
        super(board);
        this.initPlayers(playerCount);
    }
    
    public WalkingBoardWithPlayers(int size, int playerCount)
    {
        super(size);
        this.initPlayers(playerCount);
    }

    private void initPlayers(int playerCount)
    {
         if(playerCount < 2)
        {
            throw new IllegalArgumentException("Player count is less than 2.");
        }
        else
        {
            MadlyRotatingBuccaneer = new MadlyRotatingBuccaneer();
            players = new Player [playerCount-1];
            for(int i = 0; i < playerCount-1; i++)
            {
                players[i] = new Player();
            }
        }
    }

    public int[] walk(int... stepCounts)
    {
        int whichplayer;
        for(int i = 0; i < stepCounts.length; i++)
        {
            whichplayer = i % (players.length + 1);

            if(whichplayer == 0)
            {
                MadlyRotatingBuccaneer.turn();
                for(int k = 0; k < stepCounts[i] && k <= SCORE_EACH_STEP; k++)
                {
                    MadlyRotatingBuccaneer.addToScore(moveAndSet(MadlyRotatingBuccaneer.getDirection(), k));
                }
            }
            else
            {
                players[whichplayer-1].turn();
                for(int k = 0; k < stepCounts[i] && k <= SCORE_EACH_STEP; k++)
                {
                    players[whichplayer-1].addToScore(moveAndSet(players[whichplayer-1].getDirection(), k));
                }
            }
        }

        int [] returnable = new int[players.length+1];
        returnable[0] = MadlyRotatingBuccaneer.getScore();
        for(int i = 0; i < players.length; i++)
        {
            returnable[i+1] = players[i].getScore();
        }

        return returnable;
    }
}