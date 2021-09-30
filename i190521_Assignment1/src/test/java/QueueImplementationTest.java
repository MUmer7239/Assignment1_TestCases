
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


public class QueueImplementationTest {

    @Test
    public void enqueueTest() throws Exception {
         Queue queue = new Queue(3);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        assertEquals(5,queue.array[0]);
        assertEquals(10,queue.array[1]);
        assertEquals(15,queue.array[2]);


    }


    @Test
   public void dequeueTest() throws Exception {
        Queue queue = new Queue(3);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        assertEquals(5,queue.dequeue());
        assertEquals(10,queue.dequeue());
        assertEquals(15,queue.dequeue());

    }


    @Test
   public void emptyTest() throws Exception {
        Queue queue = new Queue(3);

        assertEquals(true,queue.empty());

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        assertEquals(false,queue.empty());


    }


    @Test
   public void sizeTest() throws Exception {
        Queue queue = new Queue(3);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        assertEquals(3,queue.size());
    }



    @SuppressWarnings("static-access")
    @Test
   public void displayTest() throws Exception {

        Queue queue = new Queue(3);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        queue.display();

        assertEquals("Queue : 5 10 15",ConsoleOutput.toString().trim());
    }



}
