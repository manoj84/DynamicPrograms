/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer

    Modified by Manoj M to ovveride equls and Hashcode.
 */

package code.trees.tree.core;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Binary tree node implementation: Pointers to children
 * 
 * @param E
 *            The data element
 * @param Key
 *            The associated key for the record
 */
public class BSTNode<Key, E> implements BinNode<E> {
    private Key key; // Key for this node
    private E element; // Element for this node
    private BSTNode<Key, E> left; // Pointer to left child
    private BSTNode<Key, E> right; // Pointer to right child
    private int height = 0;
    private BSTNode<Key, E> parent;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Key is " + key + " ");
        builder.append("Element is " + element + " ");
        builder.append("Height is " + height);
        return builder.toString();
    }

    /** Constructors */
    public BSTNode() {
        left = right = null;
    }

    public BSTNode(Key k, E val) {
        left = right = null;
        key = k;
        element = val;
    }

    public BSTNode(Key k, E val, BSTNode<Key, E> l, BSTNode<Key, E> r) {
        left = l;
        right = r;
        key = k;
        element = val;
    }

    /** Get and set the key value */
    public Key key() {
        return key;
    }

    public void setKey(Key k) {
        key = k;
    }

    /** Get and set the element value */
    public E element() {
        return element;
    }

    public void setElement(E v) {
        element = v;
    }

    /** Get and set the left child */
    public BSTNode<Key, E> left() {
        return left;
    }

    public void setLeft(BSTNode<Key, E> p) {
        left = p;
    }

    /** Get and set the right child */
    public BSTNode<Key, E> right() {
        return right;
    }

    public void setParent(BSTNode<Key, E> p) {
        this.parent = p;
    }

    public BSTNode<Key, E> getParent() {
        return this.parent;
    }

    public void setRight(BSTNode<Key, E> p) {
        right = p;
    }

    /** @return True if a leaf node, false otherwise */
    public boolean isLeaf() {
        return (left == null) && (right == null);
    }

    /** @return All children of current node **/
    @SuppressWarnings("unchecked")
    public List<BSTNode<Integer, String>> getChildren() {
        List<BSTNode<Integer, String>> list = new LinkedList<BSTNode<Integer, String>>();
        list.add((BSTNode<Integer, String>) left);
        list.add((BSTNode<Integer, String>) right);
        return list;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}