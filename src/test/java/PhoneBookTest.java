import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    String name1 = "Ilya";
    String name2 = "Ivan";
    int number1 = 8903;
    int number2 = 9348;

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        Assertions.assertEquals(phoneBook.add(name1, number1), 1);
        Assertions.assertEquals(phoneBook.add(name1, number1), 1);
        Assertions.assertEquals(phoneBook.add(name2, number2), 2);
    }
}
