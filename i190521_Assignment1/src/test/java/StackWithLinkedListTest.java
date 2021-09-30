
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

public class StackWithLinkedListTest {

    @Test
   public void pushTest()
    {
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(19);
        stack.push(21);
        stack.push(23);
        assertEquals(23,stack.head.key);

    }

    @Test
   public void topTest()
    {
        StackWithLinkedList stack = new StackWithLinkedList();

        if(stack.head==null) {
            assertEquals(-1, stack.top());
        }

        stack.push(19);
        stack.push(21);
        stack.push(23);
        assertEquals(23,stack.top());
    }

    @Test
    public void popTest()
    {
        StackWithLinkedList stack = new StackWithLinkedList();

        if(stack.head==null) {
            assertEquals(-1, stack.top());
        }

        stack.push(19);
        stack.push(21);
        stack.push(23);
        assertEquals(23,stack.pop());
    }


    @Test
    public void getSizeTest() throws Exception {
        StackWithLinkedList stack = new StackWithLinkedList();

        stack.push(33);
        stack.push(34);
        stack.push(35);

        assertEquals(3,stack.getSize());
    }



    @SuppressWarnings("static-access")
    @Test
   public void displayStackTest(){

        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(10);
        stack.push(11);
        stack.push(12);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        stack.display();


       assertEquals("12 11 10",ConsoleOutput.toString().trim());





    }
}
