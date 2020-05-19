# Overview of the Collections Framework

Understand the architecture of the Java collections framework.
> *  A collection groups together elements and allows them to be retrieved later.
> *  A list is a collection that remembers the order of its elements.
> *  A set is an unordered collection of unique elements.
> *  A map keeps associations between key and value objects.

Understand and use linked lists.
> *  A linked list consists of a number of nodes, each of which has a reference to the next node.
> *  Adding and removing elements at a given position in a linked list is efficient.
> *  Visiting the elements of a linked list in sequential order is efficient, but random access is not.
> *  You use a list iterator to access elements inside a linked list.

Choose a set implementation and use it to manage sets of values.
> *  The HashSet and TreeSet classes both implement the Set interface.
> *  Set implementations arrange the elements so that they can locate them quickly.
> *  You can form hash sets holding objects of type String, Integer, Double, Point, Rectangle, or Color.
> *  You can form tree sets for any class that implements the Comparable interface, such as String or Integer.
> *  Sets don’t have duplicates. Adding a duplicate of an element that is already present is ignored.
> *  A set iterator visits the elements in the order in which the set implementation keeps them.
> *  You cannot add an element to a set at an iterator position.

Use maps to model associations between keys and values.
> *  The HashMap and TreeMap classes both implement the Map interface.
> *  To find all keys and values in a map, iterate through the key set and find the values that correspond to the keys.
> *  A hash function computes an integer value from an object.
> *  A good hash function minimizes collisions—identical hash codes for different objects.
