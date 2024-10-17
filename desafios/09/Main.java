import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> listaInteiros = new ArrayList<>();
    listaInteiros.add(1);
    listaInteiros.add(5);
    listaInteiros.add(8);
    listaInteiros.add(2);
    listaInteiros.add(59);
    listaInteiros.add(3);
    System.out.println("Lista desordenada:");
    System.out.println(listaInteiros);
    Collections.sort(listaInteiros);
    System.out.println("Lista ordenada:");
    System.out.println(listaInteiros);

    Titulo got1 = new Titulo("Guerra dos tronos");
    Titulo got2 = new Titulo("Furia dos Reis");
    Titulo got3 = new Titulo("Tormenta das Espadas");
    Titulo got4 = new Titulo("Festim dos Corvos");
    Titulo got5 = new Titulo("Dança dos Dragões");

    List<Titulo> listaGot = new ArrayList<>();
    listaGot.add(got1);
    listaGot.add(got2);
    listaGot.add(got3);
    listaGot.add(got4);
    listaGot.add(got5);
    System.out.println("Lista desordenada:");
    System.out.println(listaGot);
    Collections.sort(listaGot);
    System.out.println("Lista ordenada:");
    System.out.println(listaGot);

    List<String> listaArray = new ArrayList<>();
    listaArray.add("A");
    listaArray.add("B");
    listaArray.add("C");
    System.out.println("Lista com ArrayList");
    System.out.println(listaArray);

    List<String> listaLinked = new LinkedList<>();
    listaLinked.add("A");
    listaLinked.add("B");
    listaLinked.add("C");
    System.out.println("Lista com LinkedList");
    System.out.println(listaLinked);

    List<String> listaPolimorfismo;
    listaPolimorfismo = new ArrayList<>();
    listaPolimorfismo.add("A");
    listaPolimorfismo.add("B");
    listaPolimorfismo.add("C");
    System.out.println("Lista com ArrayList e polimorfismo");
    System.out.println(listaPolimorfismo);

    listaPolimorfismo = new LinkedList<>();
    listaPolimorfismo.add("A");
    listaPolimorfismo.add("B");
    listaPolimorfismo.add("C");
    System.out.println("Lista com LinkedList e polimorfismo");
    System.out.println(listaPolimorfismo);
  }
}
