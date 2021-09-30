
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import nl.altindag.console.ConsoleCaptor;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;


public class CircularLinkedListTest {

    @Test
    public void pushFrontTest()
    {
        // List :  18 19 32
        CircularLinkedList List;
        List = new CircularLinkedList();
        List.pushFront(32);
        List.pushFront(19);
        List.pushFront(18);

        //CircularLinkedList.Node N = new CircularLinkedList.Node();
        assertEquals(18, List.head.key);
        assertEquals(19, List.head.next.key);
        assertEquals(32, List.head.next.next.key);
        assertNotNull(List.head.next.next.next);
        assertEquals(List.head,List.head.next.next.next);

    }

    @Test
    public void pushBackTest()
    {
        // list : 15 20 25
        CircularLinkedList List;
        List = new CircularLinkedList();
        List.pushBack(15);
        List.pushBack(20);
        List.pushBack(25);
        //assertEquals(15, List.head.key);
        //assertEquals(20, List.head.next.key);
        //assertEquals(25, List.head.next.next.key);
        assertNotNull(List.head.next.next.next);
    }


    @Test
    public void popFrontTest()
    { CircularLinkedList List;
        List = new CircularLinkedList();
        //List : 17 15 13
        List.pushFront(13);
        List.pushFront(15);
        List.pushFront(17);
        assertEquals(17, List.head.key);

        List.popFront();
        assertEquals(15, List.head.key);

    }

    @Test
    public void popBackTest()
    { CircularLinkedList List;
        List = new CircularLinkedList();
        //List : 23 25 27
        List.pushFront(23);
        List.pushFront(25);
        List.pushFront(27);
        assertEquals(27, List.head.key);

        List.popBack();
        assertEquals(25, List.head.next.key);
        assertEquals(List.head, List.head.next.next);

    }

}
