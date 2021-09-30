
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
public class StackImplementationTest {

    @Test
    public void pushTest() throws Exception {
         MyStack stack = new MyStack(2);

         stack.push(33);
         stack.push(34);

         assertEquals(33,stack.arraytostoreStack[0]);
         assertEquals(34,stack.arraytostoreStack[stack.topPointer]);

    }

    @Test
   public void topTest() throws Exception {
        MyStack stack = new MyStack(2);

        stack.push(33);
        stack.push(34);

        assertEquals(34, stack.top());


    }


    @Test
    public void popTest() throws Exception {
        MyStack stack = new MyStack(3);

        stack.push(33);
        stack.push(34);
        stack.push(35);

        assertEquals(35,stack.pop());
    }

    @Test
   public void sizeTest() throws Exception {
        MyStack stack = new MyStack(3);

        stack.push(33);
        stack.push(34);
        stack.push(35);

        assertEquals(3,stack.size());
    }


    @SuppressWarnings("static-access")
    @Test
   public void displayStackTest() throws Exception {

        MyStack stack = new MyStack(3);
         stack.push(10);
         stack.push(11);
         stack.push(12);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

       stack.displayStack();


       assertEquals("Stack : [ 10 11 12 ]",ConsoleOutput.toString().trim());

    }
}
