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

public class WalkingBoardTest
{
    @ParameterizedTest(name = "First test: simple init")
    @CsvSource(textBlock = """
        1
        4
        6
        7
    """)

    @DisableIfHasBadStructure
    public void testSimpleInit(int size)
    {
        WalkingBoard a = new WalkingBoard(size);
        int [][] testtiles = a.getTiles();
        assertEquals(testtiles[size-1][size-1], 3);
    }

    @ParameterizedTest(name = "Second test: init with array of arrays")
    @CsvSource(textBlock = """
        1, 1, 3
        4, 1, 3
        3, 2, 7
        3, 4, 9
    """)
    @DisableIfHasBadStructure
    public void testCustomInit(int x,int y,int expected)
    {
        int[][] testarray = new int[4][];
        
        testarray[0] = new int[] {1, 2, 3};
        testarray[1] = new int[] {4, 1};
        testarray[2] = new int[] {6, 7, 8, 9};
        testarray[3] = new int[] {1};

        WalkingBoard a = new WalkingBoard(testarray);
        
        assertEquals(a.getTile(x, y), expected);
        assertEquals(a.getTile(x, y), expected);
        assertEquals(a.getTile(x, y), expected);
        assertEquals(a.getTile(x, y), expected);
    }

    @Test
    public void TestGetTiles()
    {
        int[][] testarray = new int[4][];
            
        testarray[0] = new int[] {1, 2, 3};
        testarray[1] = new int[] {4, 1};
        testarray[2] = new int[] {6, 7, 8, 9};
        testarray[3] = new int[] {1};

        WalkingBoard a = new WalkingBoard(testarray);

        int [][] testGetTiles = a.getTiles();

        testGetTiles[0][1] = 2;

        assertEquals(a.getTile(1,2), 3); 
    }

    @Test
    public void testMoves()
    {
        int [][] tester = new int[4][4];
        tester[0] = new int[]{3,3,3,3};
        tester[1] = new int[]{3,3,3,3};
        tester[2] = new int[]{3,3,3,3};
        tester[3] = new int[]{3,3,3,3};

        WalkingBoard a = new WalkingBoard(tester);

        //x and y are initialized in [0][0]
        //moving up from [0][0], so the function should return 0 and should not change the table
        assertEquals(0,a.moveAndSet(Direction.UP, 2));

        //same, but moving left now
        assertEquals(0,a.moveAndSet(Direction.LEFT, 2));

        assertArrayEquals(a.getPosition(), new int[]{0,0});

        //moving right, the function should return 3, [0][0] should be 3 and [0][1] should be 1
        assertEquals(3,a.moveAndSet(Direction.RIGHT, 1));
        assertArrayEquals(a.getPosition(), new int[]{0,1});
        assertEquals(a.getTile(1,1), 3);
        assertEquals(a.getTile(1,2), 1);

        //moving down, the function should return 3, [0][1] should be 1 and [1][1] should be 5
        assertEquals(3,a.moveAndSet(Direction.DOWN, 5));
        assertArrayEquals(a.getPosition(), new int[]{1,1});
        assertEquals(a.getTile(1,2), 1);
        assertEquals(a.getTile(2,2), 5);

        //moving up, the function should return 1, and should overwrite 1 to 4 in [0][1]
        assertEquals(1, a.moveAndSet(Direction.UP, 4));
        assertArrayEquals(a.getPosition(), new int[]{0,1});
        assertEquals(a.getTile(2,2), 5);
        assertEquals(a.getTile(1,2), 4);
    }
}