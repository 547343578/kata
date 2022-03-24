public class TennisGame {

    private Player playerA;
    private Player playerB;
    private Utils utils = new Utils();

    public TennisGame(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void score(Player pA, Player pB){
        pA.setPoint(utils.calculatePoint(pA));
        if(utils.isPlayerADeuceAndPlayerBNoDeuce(pA,pB)){
            utils.win(pA);
            return;
        }else if(utils.isPlayerADeuceAndPlayerBDeuce(pA,pB)){
            pB.setDeuce(false);
        }else if(utils.isPlayerBeingDeuce(pA)){
            pA.setDeuce(true);
        }
        System.out.println("NICE SHOT " + pA.getName() + ", CONTINUING THE GAME!!!");
    }


}
