package GroupProject2;
/*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
 */

    interface WebDriver {
        void open();
        void close();
        String getTitle();

    }
    interface RemoteWebDriver extends WebDriver{
        void navigate();
    }
    interface TakeScreenShot extends RemoteWebDriver{
        void getScreenShot();
    }
    class ChromeDriver implements RemoteWebDriver{
        @Override
        public void open() {
            System.out.println("Open Chrome Browser");
        }
        @Override
        public void close() {
            System.out.println("Close the Chrome Browser");
        }
        @Override
        public String getTitle() {
            return null;
        }
        @Override
        public void navigate() {
        }
    }
    class FirefoxDriver implements RemoteWebDriver{
        @Override
        public void open() {
            System.out.println("Open Firefox Browser");
        }
        @Override
        public void close() {
            System.out.println("Close the Firefox Browser");
        }
        @Override
        public String getTitle() {
            return null;
        }
        @Override
        public void navigate() {
        }
    }
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }
    @Override
    public void close() {
        System.out.println("Close the Safari Browser");
    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
    }
}
    class WebDriverTester{
        public static void main(String[] args) {
            WebDriver [] arr={new ChromeDriver(),new FirefoxDriver(), new SafariDriver()};
            for (WebDriver a:arr){
                a.open();
                a.getTitle();
                a.close();
            }
        }
    }

