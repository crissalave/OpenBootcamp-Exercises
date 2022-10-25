class Main {

  public static void main(String[] args) {
    Person new_person = new Person();

    new_person.setAge(24);
    new_person.setName("Maria");
    new_person.setPhone("+01-4588-129");

    System.out.println("Person name:         " + new_person.getName());
    System.out.println("Person age:          " + new_person.getAge());
    System.out.println("Person phone number: " + new_person.getPhone());
  }

}

class Person {
  private Integer age;
  private String name;
  private String phone;

  public void setAge(Integer age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
  public String getPhone() {
    return phone;
  }
}
