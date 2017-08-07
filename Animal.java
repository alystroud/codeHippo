class Animal{
  public String name;
  public String type;
  public int age;

  Animal(String name, String type, int age){
    this.name = name;
    this.type = type;
    this.age = age;
  }

  Animal(){}

  void setName(String name){
    this.name = name;
  }

  void setType(String type){
    this.type = type;
  }

  void setAge(int age){
    this.age = age;
  }
}
