package bg.ballliner.test.unit.logic.pojo;

import bg.ballliner.logic.pojo.BoardDimension;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoardDimensionTests {
    private static final int BOARD_HEIGHT = 3;
    private static final int BOARD_WIDTH  = 7;
    
    private BoardDimension _sut;
    
    public BoardDimensionTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        _sut = new BoardDimension(BOARD_HEIGHT, BOARD_WIDTH);
    }
    
    @After
    public void tearDown() {
        _sut = null;
    }

    @Test
    public void whenBoardDimensionCompared_sameObject_shouldBeEqual() {
        boolean equality = _sut.equals(_sut);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenBoardDimensionCompared_boardDimensionWithSameValues_shouldBeEqual() {
        BoardDimension comparedDim = new BoardDimension(BOARD_HEIGHT, BOARD_WIDTH);
        boolean equality = _sut.equals(comparedDim);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenBoardDimensionCompared_boardDimensionWithDifferentHeight_shouldNotBeEqual() {
        int comparedHeight = 4;
        int comparedWidth  = BOARD_WIDTH;
        BoardDimension comparedDim = new BoardDimension(comparedHeight, comparedWidth);
        boolean equality = _sut.equals(comparedDim);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenBoardDimensionCompared_boardDimensionWithDifferentWidth_shouldNotBeEqual() {
        int comparedHeight = BOARD_HEIGHT;
        int comparedWidth  = 6;
        BoardDimension comparedDim = new BoardDimension(comparedHeight, comparedWidth);
        boolean equality = _sut.equals(comparedDim);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenBoardDimensionCompared_object_shouldNotBeEqual() {
        Object differentObject = new Object();
        boolean equality = _sut.equals(differentObject);
        assertFalse("Objects should not be equal", equality);
    }
}
