package entities;

import java.util.Random;

public class Pocao extends Item {
     public Pocao() {
          Random aleatorio=new Random();
          super.descrição="Tem gosto de peixe, mas mal não vai fazer";
          super.nome="Poção de cura";
          super.nivel= aleatorio.nextInt(10)+1;
     }
     public int usar(){
          Random aleatorio=new Random();
          return aleatorio.nextInt(10)*super.nivel;
     }
}
