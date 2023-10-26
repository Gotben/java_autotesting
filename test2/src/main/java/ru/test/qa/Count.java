package ru.test.qa;

public class Count {
    public int a;
    public int b;

    public Count(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int count() {
        return this.a + this.b;
    }
}
