import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest
{

    @Test
    void addFirst()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        myList.addFirst("Jeff Geoff");
        myList.addFirst("Steven");
        myList.addFirst("BillyBobJoel");
        String actual = myList.getFirst();
        String expected = "BillyBobJoel";
        assertEquals(expected,actual);
    }

    @Test
    void getFirst()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        myList.addFirst("Jeff Geoff");
        myList.addFirst("Steven");
        myList.addFirst("BillyBobJoel");
        String actual = myList.getFirst();
        String expected = "BillyBobJoel";
        assertEquals(expected,actual);
    }

    @Test
    void getFirstException()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        Assertions.assertThrows(NoSuchElementException.class, () ->
                myList.getFirst());
    }

    @Test
    void removeFirstException()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        Assertions.assertThrows(NoSuchElementException.class, () ->
                myList.removeFirst());
    }

    @Test
    void removeFirst()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        myList.addFirst("Jeff Geoff");
        myList.addFirst("Steven");
        myList.addFirst("BillyBobJoel");
        myList.removeFirst();

        String actual = myList.removeFirst();
        String expected = "Steven";
        assertEquals(expected,actual);
    }

    @Test
    void isEmpty()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        boolean actual = myList.isEmpty();
        boolean expected = true;
        assertEquals(expected, actual);

        myList.addFirst("Steven");
        myList.addFirst("Jeff");
        myList.addFirst("BillyBobJoel");

        actual = myList.isEmpty();
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void print()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        myList.addFirst("Steven");
        myList.addFirst("Jeff");
        myList.addFirst("BillyBobJoel");

    }

    @Test
    void size()
    {
        CP3LinkedList<String> myList = new CP3LinkedList<>();

        myList.addFirst("Steven");
        myList.addFirst("Jeff");
        myList.addFirst("BillyBobJoel");
        int actual = myList.size();
        int expected = 3;
        assertEquals(expected, actual);
    }
}