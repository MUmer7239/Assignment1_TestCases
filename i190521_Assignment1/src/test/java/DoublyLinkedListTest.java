
import nl.altindag.console.ConsoleCaptor;
import org.testng.annotations.Test;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class DoublyLinkedListTest {

    @Test
    public void pushFrontTest() {

        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.pushFront(10);               // 9 8 10
        list.pushFront(8);
        list.pushFront(9);
        assertEquals(9,list.head.key);
        assertEquals(8,list.tail.prev.key);
        assertEquals(10,list.tail.key);
    }

    @Test
    public void pushBackTest() {

        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.pushBack(100);               // 100 800 900
        list.pushBack(800);
        list.pushBack(900);
        assertEquals(100,list.head.key);
        assertEquals(800,list.tail.prev.key);
        assertEquals(900,list.tail.key);
        list.displayB();
    }


    @SuppressWarnings("static-access")
    @Test
    public void popFrontTest()
    {

        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.pushBack(20);               // 20 80 90
        list.pushBack(80);
        list.pushBack(90);
        assertEquals(20,list.head.key);
        assertEquals(80,list.tail.prev.key);

        assertNotNull(list.head==null);

        if(list.head==null)
        {
            ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
            System.setOut(new PrintStream(ConsoleOutput));
            list.popFront();
            //  System.getProperty("line.separator");
            assertEquals("Empty List. " ,ConsoleOutput.toString().trim());

        }

    }


    @Test
   public void popBackTest() {

        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.pushBack(2);               // 2 8 9
        list.pushBack(8);
        list.pushBack(9);
        assertEquals(2,list.head.key);
        assertEquals(8,list.tail.prev.key);

        list.popBack();
        assertEquals(8,list.tail.key);

    }

    @SuppressWarnings("static-access")
    @Test
    public void displayFTest() {

        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.pushBack(2);               // 2 8 9
        list.pushBack(8);
        list.pushBack(9);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        list.displayF();

        if(list.head==null){
             assertEquals("Empty List." ,ConsoleOutput.toString().trim());

        }
        assertEquals("List : 2 8 9" ,ConsoleOutput.toString().trim());




    }



    @SuppressWarnings("static-access")
    @Test
    public void displayBTest() {

        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.pushBack(2);               // 2 8 9
        list.pushBack(8);
        list.pushBack(9);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        list.displayB();

        if(list.head==null){
            assertEquals("Empty List." ,ConsoleOutput.toString().trim());

        }
        assertEquals("Reverse List : 9 8 2" ,ConsoleOutput.toString().trim());




    }

    @Test
    public void Test()
    {
        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.pushFront(10);
        list.pushBack(12);
        list.pushFront(8);
        list.pushBack(14);
        list.displayF();
        displayFTest();

        list.displayB();
        displayBTest();

        list.popFront();
        list.displayF();
        displayFTest();

        list.displayB();
        displayBTest();

        list.popBack();

        list.displayF();
        displayFTest();

        list.displayB();
        displayBTest();

        list.popFront();
        list.displayB();
        displayBTest();

        list.popFront();

        list.displayF();
        displayFTest();

    }

}
