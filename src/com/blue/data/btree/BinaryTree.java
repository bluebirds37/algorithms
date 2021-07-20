package com.blue.data.btree;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BinaryTree<T> {

    private T current;
    private T left;
    private T right;

    private T search(T t) {

        T result = null;
        if (t == null) {
            return t;
        }
        if (t.equals(current)) {
            return current;
        }
        if (t.equals(left)) {
            return left;
        }
        if (t.equals(right)) {
            return right;
        }
        if (left != null) {
            result = search(t);
        }
        if (right != null) {
            result = search(right);
        }
        return result;

    }

}
