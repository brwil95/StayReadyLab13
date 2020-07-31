import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class MyArrayListTest{


    MyArrayList<String> intArrListNoLength;
    MyArrayList<Integer> intArrListWithLength;


    @Before
    public void setup() {
        intArrListNoLength = new MyArrayList<>();
        intArrListWithLength = new MyArrayList<>(3);
    }

    @Test
    public void myArrayListOneArgSizeTest() {
        int expectedSize = 0;
        int actualSize = intArrListNoLength.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void myArrayListTwoArgSizeTest() {
        int expectedSize = 3;
        int actualSize = intArrListWithLength.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void addWithoutSpecifyingIndexTest() {
        int expectedValue = 24;
        intArrListWithLength.add(24);
        int actualValue = intArrListWithLength.get(0);
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addToSpecificIndexTest() {
        //Given
        int expectedValue = 12;
        intArrListWithLength.add(2, 12);

        //When
        int actualValue = intArrListWithLength.get(2);

        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void addTillResizeTest() {
        //Given
        int expectedNewSize = 6;
        intArrListWithLength.add(0, 5);
        intArrListWithLength.add(1, 3);
        intArrListWithLength.add(2, 4);
        intArrListWithLength.add(3, 7);

        //When
        int actualNewSize = intArrListWithLength.size();

        //Then
        Assert.assertEquals(expectedNewSize, actualNewSize);
    }

    @Test
    public void setTest() {
        //Given
        int expectedReturnValue = 46;
        intArrListWithLength.add(2, 34);
        intArrListWithLength.set(2, 46);

        //When
        int actualReturnValue = intArrListWithLength.get(2);

        //Then
        Assert.assertEquals(expectedReturnValue, actualReturnValue);
    }

    @Test
    public void getTest() {
        int expectedReturnValue = 6;
        intArrListWithLength.add(6);
        int actualReturnValue = intArrListWithLength.get(0);
        Assert.assertEquals(expectedReturnValue, actualReturnValue);
    }

    @Test
    public void isEmptyTest(){
        //Given


        //When
        boolean actualIsEmpty = intArrListWithLength.isEmpty();


        //Then
        Assert.assertTrue(actualIsEmpty);

    }

    @Test
    public void isNotEmptyTest(){
        //Given
        intArrListWithLength.add(2);

        //When
        boolean actualIsEmpty = intArrListWithLength.isEmpty();

        //Then
        Assert.assertFalse(actualIsEmpty);

    }
}
