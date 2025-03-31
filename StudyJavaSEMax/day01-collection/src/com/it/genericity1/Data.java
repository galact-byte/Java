package com.it.genericity1;

public interface Data<T> {
    void add(T a);
    void delete(T a);
    void update(T a);
    T query(int id);
}
