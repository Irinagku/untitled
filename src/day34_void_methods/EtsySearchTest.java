package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Startng Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUr();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("---Etsy Search Smoke Test completed - pass---");

    }

    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }

    public static void navigateToEtsyUr() {
        System.out.println("Navigating to http://eatsy.com/");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("PASS: Search result are successfully displayed");
    }
}