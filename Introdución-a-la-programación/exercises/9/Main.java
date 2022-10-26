class Main {
  public static void main(String[] args) {
    Client client = new Client();

    client.name = "Lee";
    client.age = 23;
    client.phone = "+01-123-4567";
    client.credit = 15000;

    System.out.println("Client name: " + client.name);
    System.out.println("Age: " + client.age);
    System.out.println("Phone: " + client.phone);
    System.out.println("Credit: $" + client.credit);


    System.out.println("--------------------------");


    Worker worker = new Worker();

    worker.name = "Bea";
    worker.age = 22;
    worker.phone = "+01-456-7890";
    worker.salary = 21000;

    System.out.println("Worker name: " + worker.name);
    System.out.println("Age: " + worker.age);
    System.out.println("Phone: " + worker.phone);
    System.out.println("Salary: $" + worker.salary);
  }
}

class Person {
  int age;
  String name;
  String phone;
}

final class Client extends Person {
   int credit;
}

final class Worker extends Person {
  int salary;
}
