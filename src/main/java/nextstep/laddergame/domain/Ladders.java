package nextstep.laddergame.domain;

import java.util.List;
import java.util.Objects;

public class Ladders {
    private final List<Ladder> ladders;

    public Ladders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public int size() {
        return ladders.size();
    }

    public Ladder ladderAt(int line) {
        return this.ladders.get(line);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ladders ladders1 = (Ladders) o;
        return Objects.equals(ladders, ladders1.ladders);  // false.
    }

    @Override
    public int hashCode() {
        return Objects.hash(ladders);
    }
}
