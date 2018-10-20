public class Dog{
  //Properties or attributes
  public String color;
  public String eyeColors;
  public Double height;
  public Double length;
  public Double weight;

  //methods o behaviors
  public String sit(String datos){
    return "Estoy ladrando";
    //System.out.println("estoy ladrando");
  }

  public String bark(){
    return "wauff wauff wauff";

  //  System.out.println(datos"wauff wauff wauff");
  }

  public void layDown( String name){
    System.out.println(name + "Estoy recostado");
  }

  public void eat(){
    System.out.println("I am eating");
  }

  public void sleep(){
    System.out.println("zzzzzZZZZZZZZ");
  }
}
