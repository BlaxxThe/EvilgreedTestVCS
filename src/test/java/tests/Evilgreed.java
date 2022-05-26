package tests;

import org.testng.annotations.Test;
import pages.Common;

public class Evilgreed extends BaseTest {

    @Test
    public void openEvilgreed() {
        Common.openUrl("https://evilgreed.net/");
    }
}
