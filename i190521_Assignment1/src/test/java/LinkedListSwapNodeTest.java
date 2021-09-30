
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



public class LinkedListSwapNodeTest {

    @Test
    public void pushFront_pushBackTest()
    {
        // List : 6 8 10 12

        LinkedListSwapNode list = new LinkedListSwapNode();

        list.pushFront(10);
        list.pushBack(12);
        LinkedListSwapNode.Node node = new LinkedListSwapNode.Node(12);

        list.pushFront(8);
        list.pushFront(6);
        assertEquals(6, list.head.key);
    }


    @Test
    public void swapTest()
    {
        // List : 6 8 10 12

        LinkedListSwapNode list = new LinkedListSwapNode();
        list.pushFront(10);
        list.pushBack(12);
        list.pushFront(8);
        list.pushFront(6);
        assertEquals(6, list.head.key);

        list.swap();
        assertEquals(12, list.head.key);
    }


}
