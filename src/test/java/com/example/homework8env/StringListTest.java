package test;

import org.junit.jupiter.api.Test;
import service.StringList;
import service.StringListImpl;

import static org.assert
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringListTest {

    private final StringListImpl stringList = new StringListImpl();

    @Test
    public void addNull() {
        StringList stringListTest = new StringListImpl(10);
        stringListTest.add(null);
        assertThat

    }

}
