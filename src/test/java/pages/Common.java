package pages;

import utils.Driver;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }
}
