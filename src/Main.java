public class Main {
    static int[] arrayOfInts = {0,1,2,3,4};
    static void change (int[] t){
        t[0] = 5;
    }
    public static void main(String[] args) {

        change(arrayOfInts);
        System.out.println(arrayOfInts[0]);
    }
    /* comme la fonction prend en parametre un tableau d'entier,
     et qu'on l'a appelé avec un tableau d'entier elle s'est permise
     de prendre la 1er case du tableau et changer sa valeur par [5],
      ce qui nous donne un tableau final de { 5 ; 1 ; 2 ; 3 ; 4 }*/

}
