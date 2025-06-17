import org.junit.Test;

public class SomeClass {
    @Test
    public void test1(){
        int value = 2;
        int value2 = 3;
        assert value2 + value == 5;
    }

    @Test
    public void test2(){
        int x=2085;
        int y=5555;
        assert x!=y;
    }
}
