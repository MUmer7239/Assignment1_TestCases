
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


public class QueueWithArrayTest {

    @Test
    public void enqueueTest()  {
        QueueWithArray queue = new QueueWithArray(3);

        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(9);

        assertEquals(3,queue.array[0]);
        assertEquals(6,queue.array[1]);
        assertEquals(9,queue.array[2]);


    }


    @Test
   public void dequeueTest() {
        QueueWithArray queue = new QueueWithArray(3);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        assertEquals(5,queue.dequeue());
        assertEquals(10,queue.dequeue());
        assertEquals(15,queue.dequeue());

    }


    @SuppressWarnings("static-access")
    @Test
   public void displayTest() {

        QueueWithArray queue = new QueueWithArray(3);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        queue.display();

        assertEquals("Queue : 5 10 15",ConsoleOutput.toString().trim());
    }
}

