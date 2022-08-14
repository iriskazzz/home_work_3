package guru.qa;

public class InfoAboutCake {

  public static void main(String[] args) {
   Cake cake = new Cake(1500,"Шоколадная клубничка","Клубника" ,300,"Творожный", 500,"Шоколадный", 1200);
   cake.calculatePrice();
   cake.showComposition();
  }

}