public class Main {

  public static void main(String[] args) {
    sum(10, 20, 30); 

    Car miCoche = new Car();
    miCoche.addDoor();
    System.out.println(miCoche.doors);
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

}

class Car {
  public int doors = 0;

  public void addDoor() {
    this.doors += 1;
  }
}
