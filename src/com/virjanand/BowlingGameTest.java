package com.virjanand;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void allMiss_score0() {
        BowlingGame bowlingGame = new BowlingGame("--------------------");
        assertEquals(0, bowlingGame.getScore());
    }
}
