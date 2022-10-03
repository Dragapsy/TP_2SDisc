public class IntTab {
    private final int emptyElement;
    private static final int MAX_SIZE = 10000;
    int[] tab = new int[MAX_SIZE];
    int size;
// EXO 1 :
    // Reponse dans le main en commentaire !

// EXO 2 :
    public IntTab( int size, int emptyElement) {
        this.emptyElement = emptyElement;
        this.size = 0;
    }

    public IntTab(int[] tab2, int emptyElement, int s) {
        this.tab = tab2;
        this.emptyElement = emptyElement;
        this.size = s;
    }

    public IntTab(int e, int[] tab3, int s) {
        this.emptyElement = e;
        this.tab = tab3;
        this.size = s;
    }
// EXO 3 :
    public int getSize() {
        return tab.length;
    }
// EXO 4 :
    public int get(int i) {
        if (i> (tab.length - 1)){
            return emptyElement;
        }
        return tab[i];
    }
    public boolean set(int data, int i) {
        if (i > (tab.length - 1)) {
            return false;
        }
        tab[i] = data;
        return true;
    }
// EXO 5 :
    public boolean addLast(int e){
        if ()
        return false;
    }
}
