

import static org.assertj.core.api.Assertions.assertThat;
import nl.altindag.console.ConsoleCaptor;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ArrayInsertionTest {

    @Test
    public void insertTest()
    {
        ArrayInsertion A = new ArrayInsertion();

        int [] array = new int[10];
        ConsoleCaptor consoleCaptor = new ConsoleCaptor();

        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},  A.insert(array,1,0));
        assertArrayEquals(new int[]{1, 0, 5, 0, 0, 0, 0, 0, 0, 0}, A.insert(array,5,2));
        assertArrayEquals(new int[]{1, 56, 0, 5, 0, 0, 0, 0, 0, 0}, A.insert(array,56,1));
        assertArrayEquals(new int[]{1, 56, 0, 5, 12, 0, 0, 0, 0, 0}, A.insert(array,12,4));
        assertArrayEquals(new int[]{1, 56, 0, 5, 12, 0, 2, 0, 0, 0}, A.insert(array,2,6));
        assertArrayEquals(new int[]{1, 56, 0, 90, 5, 12, 0, 0, 0, 0}, A.insert(array,90,3));
        assertArrayEquals(new int[]{1, 56, 0, 90, 5, 12, 0, 16, 0, 0}, A.insert(array,16,7));



        consoleCaptor.close();



    }
}
