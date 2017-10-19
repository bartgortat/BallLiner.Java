package bg.ballliner.test.unit.logic.pojo;

import bg.ballliner.logic.pojo.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FieldTests {
    private static final int COLOR               = 8;
    private static final int POSITION_HORIZONTAL = 4;
    private static final int POSITION_VERTICAL   = 6;
    
    private Field _sut;
    
    public FieldTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        _sut = new Field(POSITION_HORIZONTAL, POSITION_VERTICAL, COLOR);
    }
    
    @After
    public void tearDown() {
        _sut = null;
    }

    @Test
    public void whenFieldCompared_sameObject_shouldBeEqual() {
        boolean equality = _sut.equals(_sut);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenFieldCompared_fieldWithSameValues_shouldBeEqual() {
        Field compared = new Field(POSITION_HORIZONTAL, POSITION_VERTICAL, COLOR);
        boolean equality = _sut.equals(compared);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenFieldCompared_fieldWithDifferentColor_shouldNotBeEqual() {
        int comparedColor = 1;
        Field compared = new Field(POSITION_HORIZONTAL, POSITION_VERTICAL, comparedColor);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenFieldCompared_fieldWithDifferentHorizontal_shouldNotBeEqual() {
        int comparedHorizontal = 1;
        Field compared = new Field(comparedHorizontal, POSITION_VERTICAL, COLOR);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenFieldCompared_fieldWithDifferentVertical_shouldNotBeEqual() {
        int comparedVertical = 1;
        Field compared = new Field(POSITION_HORIZONTAL, comparedVertical, COLOR);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenFieldCompared_fieldWithDifferentObject_shouldNotBeEqual() {
        Object compared = new Object();
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
}
