package boxtetris.comparators;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

import boxtetris.entities.Coordinates;
import boxtetris.entities.FreeSpace;

public class DimensionComparatorTwoTest {

    private static DimensionComparatorTwo comparer;

    @BeforeClass
    public static void setUp() {
        comparer = new DimensionComparatorTwo();
    }

    @Test
    public void firstIsTaller() {
        FreeSpace first = new FreeSpace(5, 3, 3, new Coordinates(2, 2, 2));
        FreeSpace second = new FreeSpace(5, 3, 2, new Coordinates(2, 2, 2));
        assertEquals(1, comparer.compare(first, second));
    }

    @Test
    public void secondIsTaller() {
        FreeSpace first = new FreeSpace(5, 3, 3, new Coordinates(2, 2, 2));
        FreeSpace second = new FreeSpace(5, 3, 4, new Coordinates(2, 2, 2));
        assertEquals(-1, comparer.compare(first, second));
    }

    @Test
    public void sameHeightFirstIsShorter() {
        FreeSpace first = new FreeSpace(3, 3, 3, new Coordinates(2, 2, 2));
        FreeSpace second = new FreeSpace(5, 3, 3, new Coordinates(2, 2, 2));
        assertEquals(1, comparer.compare(first, second));
    }

    @Test
    public void sameHeightFirstIsLonger() {
        FreeSpace first = new FreeSpace(3, 3, 3, new Coordinates(2, 2, 2));
        FreeSpace second = new FreeSpace(5, 3, 3, new Coordinates(2, 2, 2));
        assertEquals(1, comparer.compare(first, second));
    }

    @Test
    public void sameHeightSameLengthFirstIsNarrower() {
        FreeSpace first = new FreeSpace(6, 3, 3, new Coordinates(2, 2, 2));
        FreeSpace second = new FreeSpace(6, 4, 3, new Coordinates(2, 2, 2));
        assertEquals(-1, comparer.compare(first, second));
    }

    @Test
    public void sameHeightSameWidthFirstIsWider() {
        FreeSpace first = new FreeSpace(6, 12, 3, new Coordinates(2, 2, 2));
        FreeSpace second = new FreeSpace(6, 10, 3, new Coordinates(2, 2, 2));
        assertEquals(1, comparer.compare(first, second));
    }
}
