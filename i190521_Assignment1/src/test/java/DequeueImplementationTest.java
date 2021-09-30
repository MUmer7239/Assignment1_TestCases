
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


public class DequeueImplementationTest {

    @Test
    public void addRightTest()
    {
        Dequeue queue = new Dequeue(5);

        queue.addRight(5);
        queue.addRight(10);
        queue.addRight(15);
        queue.addRight(20);
        queue.addRight(25);


       assertEquals(25,queue.array[0]);
       assertEquals(20,queue.array[1]);
       assertEquals(15,queue.array[2]);
       assertEquals(10,queue.array[3]);
       assertEquals(5,queue.array[4]);

    }

    @Test
    public void addLeftTest()
    {
        Dequeue queue = new Dequeue(3);

        queue.addLeft(5);
        queue.addLeft(10);
        queue.addLeft(15);

        System.out.println(queue.rightPointer);
        System.out.println(queue.leftPointer);

        assertEquals(5,queue.array[0]);
        assertEquals(10,queue.array[1]);
        assertEquals(15,queue.array[2]);


    }


    @SuppressWarnings("static-access")
    @Test
    public void displayTest() {

        Dequeue queue = new Dequeue(3);
        queue.addLeft(5);
        queue.addLeft(10);
        queue.addLeft(15);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        queue.display();

        assertEquals("DeQueue : 5 10 15",ConsoleOutput.toString().trim());
    }

}
