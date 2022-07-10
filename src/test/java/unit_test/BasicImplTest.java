package unit_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicImplTest {
    protected UserImplementation userImpl;

    @BeforeClass
    public void beforeClass() {
        userImpl = new UserImplementation();
    }

    @AfterClass
    public void afterClass() {
        userImpl = null;
    }
}
