package ex02_02;

public class Link {

    public Link(String name, Link next) {
        this.name = name;
        this.next = next;
        id = freeId;
        freeId++;
    }

    public String getName() {
        return name;
    }

    public Link getNext() {
        return next;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        }
        /*  Oczywiście "pewniejszą" metodą uzyskania niezmienności wartości pola name
         *  byłoby zdefiniowanie jego wartości jako final:
         * 
         *  private final String name;
         * 
         *  oraz zlikwidowanie settera setName, czyli ustawianie pola name
         *  tylko poprzez konstruktor, ale wtedy utracilibyśmy całkowicie możliwość manipulowania
         *  tylko polem name; powyższe wydaje się spełniać
         *  warunki zadania (nie jest możliwa zmiana pola name po jego ustawieniu, 
         *  ale umozliwia wypełniania pól bez używania konstruktora), jak sądzę zachowując
         *  nieco większą elastyczność ewentualnego kodu.
         */
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public void setId() {
        id = freeId;
        freeId++;
    }
    
    
    /**
     * Nazwa elementu.
     */
    private String name; // "powinno" być private final String name - komentarz przy setName;
    
    /**
     * Nastepny element.
     */
    private Link next;
    
    /**
     * Unikatowy identyfikator każdego elementu
     */
    private int id;
    
    /**
     * Statyczna zmienna określająca następną wolną wartość dla identyfikatora
     * id
     */
    private static int freeId = 0;
    
    private String[] names;
}