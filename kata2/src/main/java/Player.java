public class Player {
    private String name;
    private Boolean isDeuce;
    private PointPlayer point;

    public Player(String name) {
        this.name = name;
        this.isDeuce = false;
        this.point = PointPlayer.ZERO;
    }

    public String getName() {
        return name;
    }

    public Boolean getDeuce() {
        return isDeuce;
    }

    public void setDeuce(Boolean deuce) {
        isDeuce = deuce;
    }

    public PointPlayer getPoint() {
        return point;
    }

    public void setPoint(PointPlayer point) {
        this.point = point;
    }
}
