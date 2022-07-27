package com.mockito_dice.player;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void lose_dice_number_too_low() {
        //Dice dice = new Dice(6); // If I use a real dice instance, the test result can´t be forsee
        Dice mockDice = Mockito.mock(Dice.class);
        Mockito.when(mockDice.roll()).thenReturn(2);

        Player player = new Player(mockDice, 3);
        assertFalse(player.play());
    }

    @Test
    public void wins_dice_number_greater_than_minNumber() {
        Dice mockDice = Mockito.mock(Dice.class);
        Mockito.when(mockDice.roll()).thenReturn(4);

        Player player = new Player(mockDice, 3);
        assertTrue(player.play());
    }
}