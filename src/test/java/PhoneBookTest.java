import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    String name1 = "Ilya";
    String name2 = "Ivan";
    int number1 = 8903;
    int number2 = 9348;
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void testAdd() {
        Assertions.assertEquals(phoneBook.add(name1, number1), 1);
        Assertions.assertEquals(phoneBook.add(name1, number1), 1);
        Assertions.assertEquals(phoneBook.add(name2, number2), 2);
    }
    @Test
    public void testFindByNumber(){
        Assertions.assertEquals(phoneBook.findByNumber(number1), name1);
        Assertions.assertEquals(phoneBook.findByNumber(number2), name2);
    }
}
