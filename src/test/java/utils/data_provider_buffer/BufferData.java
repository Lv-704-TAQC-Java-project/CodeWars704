package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

public class BufferData {

    @DataProvider(name = "data-provider-readString")
    public static Object[][] testReadString() {
        return new Object[][]{
                {"ATQC course", "ATQC course"}
        };
    }
}
