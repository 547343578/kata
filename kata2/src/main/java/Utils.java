public class Utils {

    public PointPlayer calculatePoint(Player player){
        return player.getPoint().getPoint() < 3 ?
                PointPlayer.getPointPlayer(player.getPoint().getPoint() + 1) : player.getPoint();
    }

    public void win(Player player){
        System.out.println(player.getName() + " WON THE GAME!!!");
    }

    public Boolean isPlayerADeuceAndPlayerBDeuce(Player pA, Player pB){
        return pA.getPoint() == PointPlayer.FOURTY && pA.getDeuce() && pB.getDeuce();
    }

    public Boolean isPlayerADeuceAndPlayerBNoDeuce(Player pA, Player pB){
        return pA.getPoint() == PointPlayer.FOURTY && pA.getDeuce() && !pB.getDeuce();
    }

    public Boolean isPlayerBeingDeuce(Player player){
        return player.getPoint() == PointPlayer.FOURTY && !player.getDeuce();
    }
}
