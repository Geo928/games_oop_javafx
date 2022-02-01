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
        BishopBlack bishop = new BishopBlack(Cell.E7);
        Cell[] result = bishop.way(Cell.B4);
        assertThat(result, is(new Cell[]{Cell.D6, Cell.C5, Cell.B4}));
    }

    @Test
    public void wayTestTwo() {
        BishopBlack bishop = new BishopBlack(Cell.B7);
        Cell[] result = bishop.way(Cell.G2);
        assertThat(result, is(new Cell[]{Cell.C6, Cell.D5, Cell.E4, Cell.F3, Cell.G2}));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testDiagonal() {
        BishopBlack bp = new BishopBlack(Cell.A1);
        bp.way(Cell.A4);
    }
}