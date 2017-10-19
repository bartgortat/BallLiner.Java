package bg.ballliner.test.unit;

import bg.ballliner.test.unit.logic.pojo.BoardDimensionTests;
import bg.ballliner.test.unit.logic.pojo.FieldPositionTests;
import bg.ballliner.test.unit.logic.pojo.FieldTests;
import bg.ballliner.test.unit.logic.pojo.SettingTests;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    BoardDimensionTests.class,
    FieldPositionTests.class,
    FieldTests.class,
    SettingTests.class
})
public class UnitTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
