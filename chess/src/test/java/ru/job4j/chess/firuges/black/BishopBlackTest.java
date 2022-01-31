package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack bishop = new BishopBlack(Cell.A2);
        assertThat(bishop.position(), is(Cell.A2));
    }

    @Test
    public void copyTest() {
        BishopBlack bishop = new BishopBlack(Cell.A3);
        Figure result = bishop.copy(Cell.A3);
        assertThat(result.position(), is(bishop.position()));
    }


    @Test
    public void wayTest() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] result = bishop.way(Cell.G5);
        assertThat(result, is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testDiagonal() {
        BishopBlack bp = new BishopBlack(Cell.A1);
        bp.way(Cell.A4);
    }
}