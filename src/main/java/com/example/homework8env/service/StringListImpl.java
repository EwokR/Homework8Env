package service;

import java.util.Objects;

public class StringListImpl implements StringList {

    private static final int INITIAL_SIZE = 15;

    private String[] data;
    private int capacity;

    public StringListImpl() {
        data = new String[INITIAL_SIZE];
    }

    public StringListImpl(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("List size could not be equal or below zero.");
        }
        data = new String[n];
    }

    @Override
    public String add(String item) {
        if (capacity >= data.length) {
            throw new IllegalArgumentException("List is full!");
        }
        if (Objects.isNull(item)) {
            throw new IllegalArgumentException("You can not add this.");
        }
        return data[capacity++] = item;
    }

    @Override
    public String add(int index, String item) {
        if (capacity >= data.length) {
            throw new IllegalArgumentException("List is full!");
        }
        if (Objects.isNull(item)) {
            throw new IllegalArgumentException("You can not add this.");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Index can not be below zero.");
        }
        if (index > capacity) {
            throw new IllegalArgumentException("Index " + index + " , Size: " + capacity);
        }
        for (int i = capacity; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = item;
        capacity++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        if (Objects.isNull(item)) {
            throw new IllegalArgumentException("You can not add this.");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Index can not be below zero.");
        }
        if (index >= capacity) {
            throw new IllegalArgumentException("Index " + index + " , Size: " + capacity);
        }
        return data[index] = item;
    }

    @Override
    public String remove(String item) {
        int indexForRemoving = indexOf(item);
        if (indexForRemoving == -1) {
            throw new IllegalArgumentException("Can not find element.");
        }
        return remove(indexForRemoving);
    }


    @Override
    public String remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index can not be below zero.");
        }
        if (index >= capacity) {
            throw new IllegalArgumentException("Index " + index + " , Size: " + capacity);
        }
        String removed = data[index];
        for (int i = index; i > capacity - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--capacity] = null;
        return removed;
    }

    @Override
    public boolean contains(String item) {
        if (Objects.isNull(item)) {
            throw new IllegalArgumentException("You can not add this.");
        }
        for (int i = 0; i < capacity; i++) {
            if (data[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if (Objects.isNull(item)) {
            throw new IllegalArgumentException("You can not add this.");
        }
        int index = -1;
        for (int i = 0; i < capacity; i++) {
            if (data[i].equals(item)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(String item) {
        if (Objects.isNull(item)) {
            throw new IllegalArgumentException("You can not add this.");
        }
        int index = -1;
        for (int i = capacity - 1; i >= 0; i--) {
            if (data[i].equals(item)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public String get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index can not be below zero.");
        }
        if (index >= capacity) {
            throw new IllegalArgumentException("Index " + index + " , Size: " + capacity);
        }
        return data[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (size() != otherList.size()) {
            return false;
        }
        for (int i = 0; i < capacity; i++) {
            if (!data[i].equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            data[i] = null;
        }
        capacity = 0;
    }

    @Override
    public String[] toArray() {
        String[] result = new String[capacity];
        for (int i = 0; i < capacity; i++) {
            result[i] = data[i];
        }
        return result;
    }
}
