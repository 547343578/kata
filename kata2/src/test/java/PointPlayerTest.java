import org.testng.annotations.Test;

public class PointPlayerTest {

    @Test
    public void Test(){
        Player player = new Player("Lucas");
        System.out.println(player.getPoint());
        PointPlayer.getPointPlayer(0);
    }

    @Test
    public void gameTest(){
        Player pA = new Player("Fiora");
        Player pB = new Player("Riven");
        TennisGame game = new TennisGame(pA, pB);
        game.score(pA, pB);
        game.score(pA, pB);
        game.score(pA, pB);
        game.score(pA, pB);
        System.out.println("?");
    }

    @Test
    public void gameTest2(){
        Player pA = new Player("Fiora");
        Player pB = new Player("Riven");
        TennisGame game = new TennisGame(pA, pB);
        game.score(pA, pB);
        game.score(pA, pB);
        game.score(pA, pB);
        game.score(pB, pA);
        game.score(pB, pA);
        game.score(pB, pA);
        game.score(pA, pB);
        game.score(pB, pA);
        game.score(pB, pA);
        System.out.println("?");
    }
}
