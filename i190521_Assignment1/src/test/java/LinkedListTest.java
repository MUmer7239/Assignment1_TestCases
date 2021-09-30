
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import nl.altindag.console.ConsoleCaptor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;


public class LinkedListTest {



    @Test
     public void pushFrontTest()
     {
         // List :  18 19 32
         LinkedList1 L;
         L = new LinkedList1();
         L.pushFront(32);
         L.pushFront(19);
         L.pushFront(18);
         assertEquals(18, L.head.key);
     }

    @Test
    public void pushBackTest()
    {
        LinkedList1 L;
        L = new LinkedList1();
        // list : 15 20 25
        L.pushBack(15);
        L.pushBack(20);
        L.pushBack(25);
        assertEquals(15, L.head.key);
    }


    @Test
    public void popFrontTest()
    {
        LinkedList1 L;
        L = new LinkedList1();
        //List : 17 15 13
        L.pushFront(13);
        L.pushFront(15);
        L.pushFront(17);
        assertEquals(17, L.head.key);

        L.popFront();
        assertEquals(15, L.head.key);

    }

    @Test
    public void popBackTest()
    {
        LinkedList1 L;
        L = new LinkedList1();
        //List : 23 25 27
        L.pushBack(23);
        L.pushBack(25);
        L.pushBack(27);
        assertEquals(23, L.head.key);

        L.popBack();
        assertEquals(25, L.head.next.key);

        Assert.assertNull(L.head.next.next);

    }

    @Test
    public void popAnyPositionTest()
    {
        LinkedList1 L;
        L = new LinkedList1();
        //List : 23 25 27 29
        L.pushBack(23);
        L.pushBack(25);
        L.pushBack(27);
        L.pushBack(29);
        assertEquals(23, L.head.key);

        L.pop(2);
        //List : 23 25 29
        assertEquals(23, L.head.key);
        assertEquals(25, L.head.next.key);
        assertEquals(29, L.head.next.next.key);

    }

}
