
import nl.altindag.console.ConsoleCaptor;
import org.testng.annotations.Test;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class DoublyLinkedListImplementationTest {

    @Test
    public void pushFront_Test()
    {
        DoublyLinkedList list = new DoublyLinkedList();
        list.pushFront(10);               // 9 8 10
        list.pushFront(8);
        list.pushFront(9);

        assertEquals(9,list.head.key);
        assertEquals(8,list.head.next.key);
        assertEquals(10,list.head.next.next.key);
        Assert.assertNull(list.head.next.next.next);


    }


    @Test
    public void pushBack_Test()
    {
        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(2);               // 2 4 6
        list.pushBack(4);
        list.pushBack(6);

        assertEquals(2,list.head.key);
        assertEquals(4,list.head.next.key);
        assertEquals(6,list.head.next.next.key);
        Assert.assertNull(list.head.next.next.next);

    }


    @Test
    public void push_Test()
    {
        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(2);               // 2 4 6
        list.pushBack(4);
        list.pushBack(6);

        assertEquals(2,list.head.key);
        assertEquals(4,list.head.next.key);
        assertEquals(6,list.head.next.next.key);
        Assert.assertNull(list.head.next.next.next);

    }



    @Test
    public void popFrontTest() throws Exception {

        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(16);               // 16 17 18
        list.pushBack(17);

        list.popFront();

        assertEquals(17,list.head.key);
        assertEquals(17,list.head.key);
        assertEquals(17,list.tail.key);


    }


    @Test
    public void popBackTest() throws Exception {

        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(6);               // 6 7
        list.pushBack(7);

        list.popBack();

        assertEquals(6,list.head.key);
        assertEquals(6,list.head.key);
        assertEquals(6,list.tail.key);


    }

    @Test
    public void topFront_topBackTest() throws Exception {

        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(6);               // 6 7
        list.pushBack(7);

        assertEquals(6,list.topFront());
        assertEquals(7,list.topBack());



    }


    @Test
    public void FindTest(){

        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(6);               // 6 7
        list.pushBack(7);

        assertEquals(true,list.Find(6));
        assertFalse(list.Find(16));
    }


    @Test
    public void SizeTest(){

        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(6);               // 6 7
        list.pushBack(7);

        assertEquals(2,list.size());


    }

    @Test
    public void removeTest() throws Exception {

        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(6);               // 6 7
        list.pushBack(7);
        list.remove(6);

        assertEquals(7,list.head.key);
        assertEquals(7,list.tail.key);


    }


    @SuppressWarnings("static-access")
    @Test
    public void forwardDisplayTest() throws Exception {


           DoublyLinkedList list = new DoublyLinkedList();
            list.pushBack(2);               // 2 8 9
            list.pushBack(8);
            list.pushBack(9);

            ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
            System.setOut(new PrintStream(ConsoleOutput));

            list.forwardDisplay();

            if(list.head==null){
                assertEquals("Empty List." ,ConsoleOutput.toString().trim());

            }
            assertEquals("List : 2 8 9" ,ConsoleOutput.toString().trim());
    }



    @SuppressWarnings("static-access")
    @Test
    public void ReverseDisplayTest() throws Exception {


        DoublyLinkedList list = new DoublyLinkedList();
        list.pushBack(2);               // 2 8 9
        list.pushBack(8);
        list.pushBack(9);

        ByteArrayOutputStream ConsoleOutput= new ByteArrayOutputStream();
        System.setOut(new PrintStream(ConsoleOutput));

        list.reverseDisplay();

        if(list.head==null){
            assertEquals("Empty List." ,ConsoleOutput.toString().trim());

        }
        assertEquals("Reverse List : 9 8 2" ,ConsoleOutput.toString().trim());
    }




}
