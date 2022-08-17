package ob.intro.pkg1;


public class OBIntro1 {

    public static void main(String[] args) {
//       int a = 10;
//       int b = 10;
//       int c = 10;
//       
//       suma(a, b, c);

    coche miCoche = new coche();
    
    miCoche.AñadirPuerta();
    
        System.out.println(miCoche.puertas);
    }
    
//    public static void suma(int a, int b, int c){
//        System.out.println(a + b + c);
//    }
}

class coche{
    public int puertas;

    public void AñadirPuerta(){
        this.puertas ++;
    }
}
