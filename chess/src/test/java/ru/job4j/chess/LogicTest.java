package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.QueenBlack;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void figureNotFoundTest() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A3));
        logic.move(Cell.B3, Cell.D6);
    }

    @Test(expected = OccupiedCellException.class)
    public void occupiedCellTest() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A3));
        logic.add(new QueenBlack(Cell.C5));
        logic.move(Cell.A3, Cell.D6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void figureMoveExceptionTest() throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A3));
        logic.move(Cell.A3, Cell.D7);
    }
}