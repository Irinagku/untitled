package day44_custom_classes;

public class App2 {
    public static void main(String[] args) {

  App uberApp = new App();
  uberApp.name = "Uber";
  uberApp.version = 3.5;
  uberApp.open();

  uberApp.version = 4.0;
  uberApp.open();
    }
}
