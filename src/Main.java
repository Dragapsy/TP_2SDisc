public class Main {
    static int[] arrayOfInts = {0,1,2,3,4};

    static void change (int[] t){
        t[0] = 5;
    }

    public static void main(String args[]){
        change(arrayOfInts);
       // System.out.println(arrayOfInts[0]);
        //EXO 1:
        /*  la methode "change ()" agit sur un tableau renseigné dans sa signature dont ses elements sont
//      des entiers .
//      elle permets de remplacer la valeur qui est positinnée à l'index 0 du tableau par 5.*/

        //Création d'un tableau vide
        IntTab liste=new IntTab();
        //Ajout d'élément à la fin du tableau
        liste.addLast(1);
        liste.addLast(2);
        liste.addLast(3);
        liste.addLast(4);
        liste.addLast(5);

        //affichage du tableau avant toute opération
        System.out.println(liste.getSize());
        System.out.println(liste.toString());

        //récupération et modification d'un élément dans le tableau
        System.out.println(liste.get(4)); // 5
        liste.set(7, 3); /*tab=[1,2,3,7,5]
                           => (resultat attendu en appliquant la methode ".set()" avant toute opération)*/

        //suppremer un élément du tableau
        liste.remove(2);  /*Tab=[1,2,4,5]
                           => (resultat attendu en appliquant la methode ".remove()" avant toute opération)*/

        //Insertion à la position i
        liste.insert(8, 2); /*Tab=[1,2,8,3,4,5]
                           => (resultat attendu en appliquant la methode ".insert()" avant toute opération)*/

        //Redimenssionner le tableau
        liste.resize(11); /*Tab=[1,2,3,4,5,0,0,0,0,0,0]
                           => (resultat attendu en appliquant la methode ".resize()" avant toute opération)*/

        System.out.println(liste.getSize());
        System.out.println(liste.toString());
    }
}