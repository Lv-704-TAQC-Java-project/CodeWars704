package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

public class BufferData {
    @DataProvider(name = "data-provider-readIntArr")
    public static Object[][] testReadIntArr() {
        return new Object[][]{
                {"1 2 3 4", new int[]{1, 2, 3, 4}},
                {"1 8 3 4", new int[]{1, 8, 3, 4}}
        };
    }
}
