import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void test(){
        Person person = new Person(18);

        System.out.println(person);

        Assert.assertEquals(18, person.getAge());
    }
}