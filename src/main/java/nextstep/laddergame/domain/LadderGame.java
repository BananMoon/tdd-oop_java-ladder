package nextstep.laddergame.domain;

import nextstep.laddergame.service.LaddersFactory;

import java.util.List;

public class LadderGame {
    private final List<String> participants;
    private final Integer maxHeight;
    private final Ladders ladders;

    private LadderGame(List<String> participants, Integer maxHeight, Ladders ladders) {
        this.participants = participants;
        this.maxHeight = maxHeight;
        this.ladders = ladders;
    }

    public LadderGame(List<String> participants, Integer maxHeight, LaddersFactory laddersFactory, LadderLinesGenerator ladderLinesGenerator) {
        this(participants, maxHeight, laddersFactory.createLadders(participants.size(), maxHeight, ladderLinesGenerator));
    }

    public List<String> getParticipants() {
        return participants;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public Ladders getLadders() {
        return ladders;
    }

    public int getLaddersSize() {
        return ladders.size();
    }
}
