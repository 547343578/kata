import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum PointPlayer {
    ZERO(0),
    FIFTEEN(1),
    THIRTY(2),
    FOURTY(3);

    private final Integer point;

    PointPlayer(Integer point){
        this.point = point;
    }

    private static final Map<Integer, PointPlayer> formatos;

    static {
        formatos = Arrays.stream(values()).collect(Collectors.toMap(PointPlayer::getPoint, Function.identity()));
    }

    public Integer getPoint() {
        return point;
    }

    public static PointPlayer getPointPlayer(Integer point){
        return formatos.get(point);
    }
}
