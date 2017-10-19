package bg.ballliner.test.unit.logic.pojo;

import bg.ballliner.logic.pojo.Field;
import bg.ballliner.logic.pojo.Setting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SettingTests {
    private static final int BOARD_HEIGHT   = 9;
    private static final int BOARD_WIDTH    = 8;
    private static final int COLOR_COUNT    = 5;
    private static final int NEW_BALL_COUNT = 3;
    
    private Setting _sut;
    
    public SettingTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        _sut = new Setting(BOARD_HEIGHT, 
                            BOARD_WIDTH, 
                            COLOR_COUNT, 
                            NEW_BALL_COUNT);
    }
    
    @After
    public void tearDown() {
        _sut = null;
    }

    @Test
    public void whenSettingCompared_sameObject_shouldBeEqual() {
        boolean equality = _sut.equals(_sut);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenSettingCompared_settingWithSameValues_shouldBeEqual() {
        Setting compared = new Setting(BOARD_HEIGHT, 
                                       BOARD_WIDTH, 
                                       COLOR_COUNT, 
                                       NEW_BALL_COUNT);
        boolean equality = _sut.equals(compared);
        assertTrue("Objects should be equal", equality);
    }
    
    @Test
    public void whenSettingCompared_settingWithDifferentBoardHeight_shouldNotBeEqual() {
        int comparedHeight = 4;
        Setting compared = new Setting(comparedHeight, 
                                       BOARD_WIDTH, 
                                       COLOR_COUNT, 
                                       NEW_BALL_COUNT);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }

    @Test
    public void whenSettingCompared_settingWithDifferentBoardWidth_shouldNotBeEqual() {
        int comparedWidth = 4;
        Setting compared = new Setting(BOARD_HEIGHT, 
                                       comparedWidth, 
                                       COLOR_COUNT, 
                                       NEW_BALL_COUNT);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenSettingCompared_settingWithDifferentColorCount_shouldNotBeEqual() {
        int comparedColorCount = 1;
        Setting compared = new Setting(BOARD_HEIGHT, 
                                       BOARD_WIDTH, 
                                       comparedColorCount, 
                                       NEW_BALL_COUNT);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
    
    @Test
    public void whenSettingCompared_settingWithDifferentNewBallCount_shouldNotBeEqual() {
        int comparedNewBallCount = 2;
        Setting compared = new Setting(BOARD_HEIGHT, 
                                       BOARD_WIDTH, 
                                       COLOR_COUNT, 
                                       comparedNewBallCount);
        boolean equality = _sut.equals(compared);
        assertFalse("Objects should not be equal", equality);
    }
}
