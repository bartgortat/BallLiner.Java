package bg.ballliner.test.unit.logic.pojo;

import bg.ballliner.logic.pojo.FieldPosition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FieldPositionTests {
    private static final int POSITION_HORIZONTAL = 4;
    private static final int POSITION_VERTICAL   = 6;
    
    private FieldPosition _sut;
    
    public FieldPositionTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        _sut = new FieldPosition(POSITION_HORIZONTAL, POSITION_VERTICAL);
    }
    
    @After
    public void tearDown() {
        _sut = null;
    }

    @Test
    public void whenFieldPositionCompared_sameObject_shouldBeEqual() {
        boolean equality = _sut.equals(_sut);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenFieldPositionCompared_fieldPositionWithSameValues_shouldBeEqual() {
        FieldPosition compared = new FieldPosition(POSITION_HORIZONTAL, POSITION_VERTICAL);
        boolean equality = _sut.equals(compared);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenFieldPositionCompared_fieldPositionWithDifferentHorizontal_shouldNotBeEqual() {
        int comparedHorizontal = 1;
        FieldPosition compared = new FieldPosition(comparedHorizontal, POSITION_VERTICAL);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenFieldPositionCompared_fieldPositionWithDifferentVertical_shouldNotBeEqual() {
        int comparedVertical = 1;
        FieldPosition compared = new FieldPosition(POSITION_HORIZONTAL, comparedVertical);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenFieldPositionCompared_differentObject_shouldNotBeEqual() {
        Object differentObject = new Object();
        boolean equality = _sut.equals(differentObject);
        assertFalse("Objects should not be equal", equality);
    }
}
