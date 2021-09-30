//Program to implement LinkedList.

import org.testng.annotations.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class LinkedListImplementationTest {

    @Test
    public void addTest() throws Exception {

        LinkedListImplementation L = new LinkedListImplementation();
        LinkedList list = new LinkedList(); //create a LinkedList.
        list.add(10);
        list.add(12);
        list.add(20);
        assertEquals(10, list.headPointer.data);
        assertEquals(20, list.tailPointer.data);

        list.popFront();
        assertEquals(12, list.headPointer.data);

    }

    @Test
    public void pushFront_pushBackTest()
    {
        LinkedListImplementation L1 = new LinkedListImplementation();
        LinkedList list1 = new LinkedList(); //create a LinkedList.


        list1.pushFront(11);                 //list: 20 12 22 12 11 70
        list1.pushFront(12);
        list1.pushFront(22);
        list1.pushBack(70);
        list1.display();
        assertEquals(22, LinkedList.headPointer.data);
        assertEquals(70, LinkedList.tailPointer.data);



    }

    @Test
   public void topFront_topBackTest() throws Exception {
        LinkedListImplementation L1 = new LinkedListImplementation();
         new LinkedList(); //create a LinkedList.

        assertEquals(22,  new LinkedList().topFront());
        assertEquals(70,  new LinkedList().topBack());
        assertEquals(70, LinkedList.tailPointer.data);


    }

    @Test
   public void sizeTest() {
        LinkedListImplementation L1 = new LinkedListImplementation();
        LinkedList L = new LinkedList(); //create a LinkedList.

        assertEquals(6, L.size());


    }
}
