package walking.game;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;

import walking.game.*;
import walking.game.util.*;

public class WalkingBoardWithPlayersTest
{
    @Test
    public void walk1()
    {
        WalkingBoardWithPlayers firsttest = new WalkingBoardWithPlayers(4, 2);
        int [] firsttestinputarray = new int[]{2, 3, 2, 4, 1, 3};
        int [] firsttestreturnarray  = firsttest.walk(firsttestinputarray);
        int [][] firstfinalarray = new int[4][];
        firstfinalarray[0] = new int[]{3,0,1,2};
        firstfinalarray[1] = new int[]{3,3,3,0};
        firstfinalarray[2] = new int[]{3,3,3,1};
        firstfinalarray[3] = new int[]{1,0,0,2};

        int [] firstfinalreturnarray = new int[]{3, 24};
        
        /* starting array:
            3 3 3 3
            3 3 3 3
            3 3 3 3
            3 3 3 3
            madly: 0
            player: 0

           final array:
            3 0 1 2
            3 3 3 0
            3 3 3 1
            1 0 0 2
            madly = 3
            player = 24
        */

        assertArrayEquals(firsttestreturnarray, firstfinalreturnarray);
        assertArrayEquals(firsttest.getTiles(), firstfinalarray);   
    }

    @Test
    public void walk2()
    {
        int [][] secondinputarray = new int [3][];
        secondinputarray[0] = new int[]{1,2};
        secondinputarray[1] = new int[]{3,4, 5};
        secondinputarray[2] = new int[]{6,2};

        WalkingBoardWithPlayers secondtest = new WalkingBoardWithPlayers(secondinputarray, 3);
        int [] secondtestinputarray = new int[]{3,1,2,3,1,2,3,5,6};
        int [] secondtestreturnarray  = secondtest.walk(secondtestinputarray);
        int [][] secondfinalarray = new int[3][];
        secondfinalarray[0] = new int[]{3,0};
        secondfinalarray[1] = new int[]{3, 0, 5};
        secondfinalarray[2] = new int[]{0,0};

        int [] secondfinalreturnarray = new int[]{6, 7, 3};
        
        /* starting array:
            1 2
            3 4 5
            6 2
            madly: 0
            player1: 0
            player2: 0

           final array:
            3 0
            3 0 5
            0 0
            madly = 6
            player1 = 7
            player2 = 3
        */

        assertArrayEquals(secondtestreturnarray, secondfinalreturnarray);
        assertArrayEquals(secondtest.getTiles(), secondfinalarray);
    }
}