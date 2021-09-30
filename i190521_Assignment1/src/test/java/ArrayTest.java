
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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
public class ArrayTest {

    @Test
    public void testinsertValeTest()
    {
        Array array = new Array();
        array.insert(10,0);
        array.insert(16,1);
        array.insert(12,2);
        array.insert(14,3);

        assertEquals(10,array.array[0]);
        assertEquals(16,array.array[1]);
        assertEquals(12,array.array[2]);
        assertEquals(14,array.array[3]);

        array.bubbleSort();
        assertEquals(10,array.array[0]);
        assertEquals(12,array.array[1]);
        assertEquals(14,array.array[2]);
        assertEquals(16,array.array[3]);
    }

    @Test
    public void bubbleSortTest()
    {
        Array array = new Array();
        array.insert(10,0);
        array.insert(16,1);
        array.insert(12,2);
        array.insert(14,3);

        array.bubbleSort();
        assertEquals(10,array.array[0]);
        assertEquals(12,array.array[1]);
        assertEquals(14,array.array[2]);
        assertEquals(16,array.array[3]);
    }



    @Test
    public void binarySearchTest()
    {
        Array array = new Array();
        array.insert(10,0);
        array.insert(16,1);
        array.insert(12,2);
        array.insert(14,3);


        assertEquals(false,array.binarySearch(16,0, 4));

    }


    @Test
    public void linearSearchTest()
    {
        Array array = new Array();
        array.insert(10,0);
        array.insert(16,1);
        array.insert(12,2);
        array.insert(14,3);


        assertEquals(true,array.linearSearch(16));

    }


    @SuppressWarnings("static-access")
    @Test
    public void displayTest() {

        Array array = new Array();
        array.insert(10,0);
        array.insert(16,1);
        array.insert(12,2);
        array.insert(14,3);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        array.display();

        assertEquals("10 16 12 14",ConsoleOutput.toString().trim());
    }
}
