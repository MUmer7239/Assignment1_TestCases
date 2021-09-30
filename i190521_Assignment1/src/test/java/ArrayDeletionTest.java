
import static org.assertj.core.api.Assertions.assertThat;
import nl.altindag.console.ConsoleCaptor;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;




public class ArrayDeletionTest
{
    //Test 1
    @Test
    public void ArrayDeletionTest() throws NoSuchMethodException, SecurityException, InvocationTargetException, IllegalAccessException
    {
        ArrayDeletion A = new ArrayDeletion();

        Method method = ArrayDeletion.class.getDeclaredMethod("delete",int[].class, int.class);
        method.setAccessible(true);

        int [] array = {1,6,34,0,2,43};
        int []expectedArray = {1,6,34,2,43,-1};

        int[] result = (int[]) method.invoke(A,array,3);
        assertArrayEquals(expectedArray,result);

        int[] result1 = (int[]) method.invoke(A,array,17);
        assertArrayEquals(expectedArray,result1);

    }


    //Test 2
    @Test
    public void displayFTest()
    {

        ConsoleCaptor consoleCaptor = new ConsoleCaptor();
        ArrayDeletion A = new ArrayDeletion();

        int [] array = {1,6,34,0,2,43};
        String expectedOutput = "1 6 34 0 2 43";

        A.display(array);

        assertThat(consoleCaptor.getStandardOutput()).contains(expectedOutput);


        consoleCaptor.close();
    }

}
