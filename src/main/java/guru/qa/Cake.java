package guru.qa;

public class Cake {
  int priceCake;
  String name;
  String berries;
  int priceBerries;
  String cream;
  int priceCream;
  String biscuit;
  int priceBiscuit;

  public Cake(int priceCake, String name, String berries, int priceBerries, String cream, int priceCream, String biscuit, int priceBiscuit) {
    this.priceCake = priceCake;
    this.name = name;
    this.berries = berries;
    this.priceBerries = priceBerries;
    this.cream = cream;
    this.priceCream = priceCream;
    this.biscuit = biscuit;
    this.priceBiscuit = priceBiscuit;
  }

  void calculatePrice(){
    if (berries == "Клубника" && cream == "Творожный" && biscuit == "Шоколадный"){
      priceCake = priceBerries + priceCream + priceBiscuit;
      System.out.println("Торт " + name + " стоит " + priceCake + " рублей.");
    }
    else {
      System.out.println("Извините, сейчас мы делаем только шоколадный торт с творожным кремом и клубникой :(");
    }
  }

  void showComposition(){
    System.out.println("Внутри торта " + name + " " + cream + " крем и "+ biscuit + " бисквит. " + "Подается с ягодами " + berries);
  }


}
