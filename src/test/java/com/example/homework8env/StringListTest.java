package com.example.homework8env;

import com.example.homework8env.service.StringList;
import com.example.homework8env.service.StringListImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringListTest {

    private final StringListImpl stringList = new StringListImpl();

    @Test
    public void addItemTest() {
        StringListImpl stringList = new StringListImpl();
        assertThat(stringList.add("test1"));
    }

    @Test
    public void addNullItemTest() {
        StringList stringList = new StringListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.add(null));

    }

    @Test
    public void addItemCapacityTest() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");
        stringList.add("test5");
        stringList.add("test6");
        stringList.add("test7");
        stringList.add("test8");
        stringList.add("test9");
        stringList.add("test10");
        stringList.add("test11");
        stringList.add("test14");
        stringList.add("test13");
        stringList.add("test14");
        stringList.add("test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.add("test16"));
    }

    @Test
    public void addIndexTest1() {
        StringListImpl stringList = new StringListImpl();
        assertThat(stringList.add(0, "test1"));
    }

    @Test
    public void addIndexTest2() {
        StringListImpl stringList = new StringListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.add(-1, "test1"));
    }

    @Test
    public void addNullIndexTest1() {
        StringListImpl stringList = new StringListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.add(3, null));
    }

    @Test
    public void addNullIndexTest2() {
        StringListImpl stringList = new StringListImpl();
        assertThat(stringList.add(3, "test"));
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.add(3, null));
    }

    @Test
    public void addIndexItemCapacityTest1() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.add(15, "test16"));
    }

    @Test
    public void addIndexItemCapacityTest2() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.add(14, "test16"));
    }

    @Test
    public void setTest1() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> stringList.set(0,null));
    }

    @Test
    public void setTest2() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> stringList.set(-1, "test1"));
    }

    @Test
    public void setTest3() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.set(16,"test"));
    }

    @Test
    public void removeItemTest1() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.remove("test16"));
    }

    @Test
    public void removeItemTest2() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.remove(null));
    }

    @Test
    public void removeIndexTest1() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.remove(-1));
    }

    @Test
    public void removeIndexTest2() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.remove(16));
    }

    @Test
    public void containsTest() {
        StringList stringList = new StringListImpl();
        stringList.add(0, "test1");
        stringList.add(1, "test2");
        stringList.add(2, "test3");
        stringList.add(3, "test4");
        stringList.add(4, "test5");
        stringList.add(5, "test6");
        stringList.add(6, "test7");
        stringList.add(7, "test8");
        stringList.add(8, "test9");
        stringList.add(9, "test10");
        stringList.add(10, "test11");
        stringList.add(11, "test14");
        stringList.add(12, "test13");
        stringList.add(13, "test14");
        stringList.add(14, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.contains(null));
    }

    @Test
    public void indexOfTest() {
        StringList stringList = new StringListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.indexOf(null));
    }

    @Test
    public void lastIndexOf() {
        StringList stringList = new StringListImpl();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.indexOf(null));
    }

    @Test
    public void getTest1() {
        StringList stringList = new StringListImpl();
        stringList.add(1, "test1");
        stringList.add(2, "test2");
        stringList.add(3, "test3");
        stringList.add(4, "test4");
        stringList.add(5, "test5");
        stringList.add(6, "test6");
        stringList.add(7, "test7");
        stringList.add(8, "test8");
        stringList.add(9, "test9");
        stringList.add(10, "test10");
        stringList.add(11, "test11");
        stringList.add(12, "test14");
        stringList.add(13, "test13");
        stringList.add(14, "test14");
        stringList.add(0, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.get(-1));
    }

    @Test
    public void getTest2() {
        StringList stringList = new StringListImpl();
        stringList.add(1, "test1");
        stringList.add(2, "test2");
        stringList.add(3, "test3");
        stringList.add(4, "test4");
        stringList.add(5, "test5");
        stringList.add(6, "test6");
        stringList.add(7, "test7");
        stringList.add(8, "test8");
        stringList.add(9, "test9");
        stringList.add(10, "test10");
        stringList.add(11, "test11");
        stringList.add(12, "test14");
        stringList.add(13, "test13");
        stringList.add(14, "test14");
        stringList.add(0, "test15");
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()->stringList.get(16));
    }
}

