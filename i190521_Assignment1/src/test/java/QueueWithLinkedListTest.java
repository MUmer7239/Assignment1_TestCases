
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import nl.altindag.console.ConsoleCaptor;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class QueueWithLinkedListTest {


    @Test
    public void enqueueTest()  {
        QueueWithLinkedList queue = new QueueWithLinkedList();


        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);

        assertEquals(1,queue.head.key);
        assertEquals(3,queue.head.next.key);
        assertEquals(5,queue.head.next.next.key);
    }

    @SuppressWarnings("static-access")
    @Test
   public void dequeueTest() {
        QueueWithLinkedList queue = new QueueWithLinkedList();
        if(queue.head==null){
             assertEquals(-1,queue.dequeue());
        }

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));
        assertEquals("Queue : 5 10 15",ConsoleOutput.toString().trim());

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        assertEquals(5,queue.dequeue());

    }



    @SuppressWarnings("static-access")
    @Test
    public void displayTest() {

        QueueWithLinkedList queue = new QueueWithLinkedList();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        queue.display();

        assertEquals("Queue : 5 10 15",ConsoleOutput.toString().trim());
    }
}
