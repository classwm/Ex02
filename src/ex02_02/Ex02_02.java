package ex02_02;

public class Ex02_02 {

    public static void main(String[] args) {
        List list = new List();
        
        separator("-", "Test isEmpty", 8);
        System.out.println("Czy pusty? " + list.isEmpty());
        separator("-", "Test dodawania elementów i wyświetlania listy", 8);
        list.insert("zielone", list.getFirst());
        list.insert("papugi", list.getFirst());
        list.insert("dwie", list.getFirst());
        list.insert("albo", list.getFirst());
        list.insert("kota", list.getFirst());
        list.display();
        list.insert("ma", list.getFirst());
        list.display();
        list.insert("ala", list.getFirst());
        list.display();
        
        separator("-", "Test reverse", 8);
        list.display();
        list.reverse();
        list.display();
        list.reverse();
        list.display();       
        
        separator("-", "Test działania przypisywania identyfikatora id", 8);
        list.displayWithId(); // test działania przypisywania identyfikatora id
        list.reverse();
        list.displayWithId();
        list.reverse();
        
        separator("-", "Test działania deleteNext", 8);
        list.display();
        list.deleteNext(list.search("papugi")); // test działania deleteNext
        list.display();             
        
        separator("-", "Test usuwania z listy podanego elementu", 8);
        list.insert("pies", list.getFirst());
        list.insert("ryba", list.getFirst());
        list.display();
        list.delete("pies"); // test usuwania z listy podanego elementu
        list.display();
        
        separator("-", "Test niemożności zmiany raz ustalonej nazwy elementu", 8);
        list.display();
        list.nameChange("pies", "kret"); // test niemożności zmiany raz ustalonej nazwy elementu
        list.display();

        separator("-", "Test test działania isPresent - szukania ze zwróceniem wartości boolean;", 8);
        System.out.println("Czy na liście jest wyraz 'kota'? " + list.isPresent("kota")); // test działania isPresent, czyli szukania ze zwróceniem wartości boolean;

        separator("-", "Test działania search - szukania podanej nazwy", 8);
        list.display();
        System.out.println("Wyraz 'kota'" + (list.search("kota") != null ? "" : " nie") + " istnieje.");

        list.deleteNext(list.search("ma"));
        list.display();
        System.out.println("Wyraz 'kota'" + (list.search("kota") != null ? "" : " nie") + " istnieje.");

        separator("-", "Test konstruktora listy z tablicy", 8);
        String[] words = {"zupełnie", "nowa", "lista", "elementów"}; //test konstruktora listy z tablicy
        List listFromArray = new List(words);
        listFromArray.display();

        separator("-", "Test konstruktora listy z dwoma stringami", 8);
        List listOfTwoStrings = new List("czarne", "koty"); //test konstrukotra listy z dwoma stringami
        listOfTwoStrings.display();
        
        separator("-", "Test reverse2", 8);
        list.display();
        list = list.reverse2();
        list.display();
        
        separator("-", "Test reverse3", 8);
        // list.reverse3(list.getFirst()).getNext();
        // list.getFirst().setNext(list.reverse3(list.getFirst()).getNext());
        list.reverse3((list.getFirst()).getNext());
        list.display();
    }

    /**
     * Formatowanie wyjścia danych programu.
     * @param sep Ciąg znaków separatora.
     * @param info String z opisem następnego bloku wypisanych danych.
     * @param i Ilośc powtórzen wyświetlenia separatora.
     */
    private static void separator(String sep, String info, int i) {
        System.out.println("");
        while (i > 0) {
            System.out.print(sep);
            i--;
        }
        System.out.println(" "+ info + ":");
    }
}