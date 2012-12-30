package ex02_02;

public class List {

    /**
     * Tworzy pusta liste (liste zawierajaca jedynie wartownika).
     */
    public List() {
        first = new Link(null, null);
    }

    /**
     * Tworzy listę wypełnioną danymi z tablicy. Kolejnośc elementów tablicy i
     * listy pozostaje zachowana.
     *
     * @param names Tablica strongów do stworzenia listy
     */
    public List(String[] names) {
        this();
        for (int i = names.length - 1; i >= 0; i--) {
            insert(names[i], first);
        }
    }

    /**
     * Tworzy listę z dwoma elementami
     *
     * @param name1 Nazwa pierwszego elementu
     * @param name2 Nazwa drugiego elementu
     */
    public List(String name1, String name2) {
        this(new String[]{name1, name2});
    }

    /**
     * Sprawdza, czy lista jest pusta (zawiera jedynie wartownika).
     *
     * @return True, jeżeli lista jest pusta. False w przeciwnym przypadku.
     */
    public boolean isEmpty() {

        if (getFirst().getNext() == null) {
            return (true);
        } else {
            return (false);
        }
    } // isEmpty

    /**
     * Wstawia element o danej nazwie po podanym elemencie.
     *
     * @param name Nazwa wstawianego elementu.
     * @param prev Element poprzedzajacy wstawiany element.
     */
    public void insert(String name, Link prev) {

        Link tmp = new Link(name, (prev.getNext()));
        prev.setNext(tmp);
    } // insert

    /**
     * Usuwanie elementu nastepującego po podanym elemencie.
     *
     * @param link Element poprzedzający usuwany element.
     */
    @Deprecated
    public void deleteNext(Link link) {

        Link target = link.getNext();
        if (link.getNext() != null) {
            if (target.getNext() != null) {
                Link tmp = link.getNext();
                link.setNext(tmp.getNext());
            } else {
                if (target.getNext() == null) {
                    link.setNext(null);
                }
            }
        }
    } // deleteNext

    /**
     * Usuwanie elementu o podanej nazwie.
     *
     * @param name nazwa usuwanego elementu.
     */
    public void delete(String name) {

        Link target = first.getNext();
        Link prev = target;
        while (target != null) {
            if (name.equals(target.getName())) {
                prev.setNext(target.getNext());
                return;
            }
            prev = target;
            target = target.getNext();
        }
    } //delete

    /**
     * Wyszukiwanie elementu o danej nazwie.
     *
     * @param name Nazwa szukanego elementu.
     * @return link, jeżeli istnieje element o takiej nazwie, null w przeciwnym
     * przypadku.
     */
    public Link search(String name) {

        Link link = first.getNext();
        while (link != null) {
            if (name.equals(link.getName())) {
                return (link);
            }
            link = link.getNext();
        }
        return (null);
    } //search

    /**
     * Wyszukiwanie elementu o danej nazwie.
     *
     * @param name Nazwa szukanego elementu.
     * @return True, jeżeli istnieje element o takiej nazwie. False w przeciwnym
     * przypadku.
     */
    public boolean isPresent(String name) {

        Link link = first.getNext();
        while (link != null) {
            if (name.equals(link.getName())) {
                return (true);
            }
            link = link.getNext();
        }
        return (false);
    } // isPresent

    /**
     * Wypisywanie listy.
     */
    public void display() {

        System.out.print("Lista:");
        Link link = first.getNext();
        while (link != null) {
            System.out.print(" " + link.getName());
            link = link.getNext();
        }
        System.out.println("");
    } // display

    /**
     * Wypisywanie elementów listy wraz z identyfikatorem id.
     */
    public void displayWithId() {

        System.out.print("Lista:");
        Link link = first.getNext();
        while (link != null) {
            System.out.print(" " + link.getName() + "[id=" + link.getId() + "]");
            link = link.getNext();
        }
        System.out.println("");
    } // displayWithId

    /**
     * Zmiana nazwy elementu listy (do celów testowych). Zmieniona zostanie
     * nazwa każdego elementu listy, którego nazwa odpowiada podanemu
     * parametrowi.
     *
     * @param name pierwotna nazwa elementu
     * @param newName nowa nazwa elementu
     */
    public void nameChange(String name, String newName) {

        Link link = first.getNext();
        while (link != null) {
            if (name.equals(link.getName())) {
                link.setName(newName);
            }
            link = link.getNext();
        }
    } // nameChange

    /**
     * Odwrócenie kolejności elementów na liście
     */
    public void reverse() {

        Link prevElement = new Link(null, null);
        Link currentElement = first.getNext();
        Link nextElement;

        while (currentElement != null) {
            nextElement = currentElement.getNext();
            currentElement.setNext(prevElement.getNext());
            prevElement.setNext(currentElement);
            first.setNext(nextElement);
            currentElement = nextElement;
        }
        first = prevElement;
    } // reverse

    public List reverse2() {

        List tmpList = new List();
        Link link = first.getNext();
        while (link != null) {
            tmpList.insert(link.getName(), tmpList.getFirst());
            link = link.getNext();
        }
        return tmpList;
    } // reverse2

   
public void reverse3(Link curr) {
    
        if(isEmpty()) { return;}     //curr == null
        if(curr.getNext() == null) {
            getFirst().setNext(curr);
            return;
        }
        reverse3(curr.getNext());
        curr.getNext().setNext(curr);
        curr.setNext(null);
    } // reverse3

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }
    /**
     * Wartownik.
     */
    private Link first;
}