
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

public class StackTest {

    @Test
    public void pushTest() throws Exception {
        Stack stack = new Stack();

        stack.push(77);
        stack.push(78);

        assertEquals(77,stack.array[0]);
        assertEquals(78,stack.array[1]);

    }

   @SuppressWarnings("static-access")
    @Test
    public void popTest(){

        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        assertEquals(12,stack.pop());
        stack.pop();

       if(stack.addPointer==0){
           assertEquals("Stack is Empty!",ConsoleOutput.toString().trim());
           assertEquals(-1,stack.pop());
       }





    }


    @SuppressWarnings("static-access")
    @Test
    public void displayTest() {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        stack.display();


        assertEquals("Stack : 10 11 12",ConsoleOutput.toString().trim());

    }


}
