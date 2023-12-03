package testRunner_pkg;

import org.testng.annotations.DataProvider;

public class Feature_DataProviderClass {

    @DataProvider(name = "features")
    public static Object[][] getFeatures() {
        return new Object[][]{
                {"/MRS_Maven/src/main/java/features_pkg/SampleTest.feature"},
        };
    }
}

