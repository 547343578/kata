import com.lucas.bowling.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTests {

    private Game bowlingGame;

    @Before
    public void create_bowling_game(){
        this.bowlingGame = new Game();
    }

    @Test
    public void score_0_point(){
        for(int roll = 0; roll < 20; roll++){
            bowlingGame.roll(0);
        }
        Integer result = bowlingGame.score();

        assertEquals(0,result);
    }

    @Test
    public void generic_score_points(){
        bowlingGame.roll(5);
        bowlingGame.roll(2);
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        Integer result = bowlingGame.score();

        assertEquals(14,result);
    }

    @Test
    public void score_points_no_spare_no_strike(){
        for(int roll = 0; roll < 20; roll++){
            bowlingGame.roll(2);
        }
        Integer result = bowlingGame.score();

        assertEquals(40, result);
    }

    @Test
    public void score_points_with_spare(){
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        for(int roll = 0; roll < 18; roll++){
            bowlingGame.roll(2);
        }
        Integer result = bowlingGame.score();

        assertEquals(48, result);
    }

    @Test
    public void score_points_with_strike(){
        bowlingGame.roll(10);
        for(int roll = 0; roll < 19; roll++){
            bowlingGame.roll(2);
        }
        Integer result = bowlingGame.score();

        assertEquals(50, result);
    }

    @Test
    public void score_points_with_all_strikes(){
        for (int roll = 0; roll < 21; roll++){
            bowlingGame.roll(10);
        }
        Integer result = bowlingGame.score();

        assertEquals(300, result);
    }

}
