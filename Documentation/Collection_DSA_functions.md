#DATA STRUCTURES

##Linkedlist

```java

    String s= "Code here";

```

| METHOD | DESCRIPTION    |
| ------ | -------------- |
| add(int index, E element)|	This method Inserts the specified element at the specified position in this list.|
|add(E e)	|This method Appends the specified element to the end of this list.|
|addAll(int index, Collection<E> c)|	This method Inserts all of the elements in the specified collection into this list, starting at the specified position.|
|addAll(Collection<E> c)|	This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.|
|addFirst(E e)|	This method Inserts the specified element at the beginning of this list.|
|clear()	|This method removes all of the elements from this list.|
|clone()	|This method returns a shallow copy of this LinkedList.|
|contains(Object o)	|This method returns true if this list contains the specified element.|
|element()|	This method retrieves, but does not remove, the head (first element) of this list.|
|get(int index)|	This method returns the element at the specified position in this list.|
|getFirst()|	This method returns the first element in this list.|
|getLast()|	This method returns the last element in this list.|
|indexOf(Object o)|	This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.|
|lastIndexOf(Object o)|	This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.|
|offer(E e)|	This method Adds the specified element as the tail (last element) of this list.|
|offerFirst(E e)|	This method Inserts the specified element at the front of this list.|
|offerLast(E e)|	This method Inserts the specified element at the end of this list.|
|peek()|	This method retrieves, but does not remove, the head (first element) of this list.|
|peekFirst()|	This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.|
|peekLast()|	This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.|
|poll()|	This method retrieves and removes the head (first element) of this list.|
|pollFirst()|	This method retrieves and removes the first element of this list, or returns null if this list is empty.|
|pollLast()|	This method retrieves and removes the last element of this list, or returns null if this list is empty.|
|pop()|	This method Pops an element from the stack represented by this list.|
|push(E e)|	This method Pushes an element onto the stack represented by this list.|
|remove()|	This method retrieves and removes the head (first element) of this list.|
|remove(int index)|	This method removes the element at the specified position in this list.|
|remove(Object o)|	This method removes the first occurrence of the specified element from this list, if it is present.|
|removeFirst()|	This method removes and returns the first element from this list.|
|removeFirstOccurrence(Object o)|	This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).|
|removeLast()|	This method removes and returns the last element from this list.|
|removeLastOccurrence(Object o)|	This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).|
|set(int index, E element)|	This method replaces the element at the specified position in this list with the specified element.|
|size()|	This method returns the number of elements in this list.|
|toArray()|	This method returns an array containing all of the elements in this list in proper sequence (from first to last element).|
|toString()|	This method returns a String containing all of the elements in this list in proper sequence (from first to last element), each element is separated by commas and the String is enclosed in square brackets.|

##Stack

```java

    String s= "Code here";

```

| METHOD | DESCRIPTION    |
| ------ | -------------- |
| empty() | It returns true if nothing is on the top of the stack. Else, returns false.|
| peek() | Returns the element on the top of the stack, but does not remove it.|
| pop() | Removes and returns the top element of the stack. An ‘EmptyStackException’ An exception is thrown if we call pop() when the invoking stack is empty.|
| push(Object element) | Pushes an element on the top of the stack.|
| search(Object element) | It determines whether an object exists in the stack. If the element is found, It returns the position of the element from the top of the stack. Else, it returns -1.|

##Queue

```java

    String s= "Code here";

```

| METHOD | DESCRIPTION    |
| ------ | -------------- |
| add(int index, element) |	This method is used to add an element at a particular index in the list. When a single parameter is passed, it simply adds the element at the end of the list.|
|addAll(int index, Collection collection)|	This method is used to add all the elements in the given collection to the list. When a single parameter is passed, it adds all the elements of the given collection at the end of the list.|
|size()|	This method is used to return the size of the list.|
|clear()|	This method is used to remove all the elements in the list. However, the reference of the list created is still stored.|
|remove(int index)|	This method removes an element from the specified index. It shifts subsequent elements(if any) to left and decreases their indexes by 1.|
|remove(element)|	This method is used to remove the first occurrence of the given element in the list.|
|get(int index)|	This method returns elements at the specified index.|
|set(int index, element)|	This method replaces elements at a given index with the new element. This function returns the element which was just replaced by a new element.|
|indexOf(element)|	This method returns the first occurrence of the given element or -1 if the element is not present in the list.|
|lastIndexOf(element)|	This method returns the last occurrence of the given element or -1 if the element is not present in the list.|
|equals(element)|	This method is used to compare the equality of the given element with the elements of the list.|
|isEmpty()|	This method is used to check if the list is empty or not. It returns true if the list is empty, else false.|
|contains(element)|	This method is used to check if the list contains the given element or not. It returns true if the list contains the element.|
|containsAll(Collection collection)|	This method is used to check if the list contains all the collection of elements.|
|sort(Comparator comp)|	This method is used to sort the elements of the list on the basis of the given comparator.|

##Deque

```java

    String s= "Code here";

```

| METHOD | DESCRIPTION    |
| ------ | -------------- |
|add(element)|	This method is used to add an element at the tail of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.|
|addFirst(element)|	This method is used to add an element at the head of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.|
|addLast(element)|	This method is used to add an element at the tail of the queue. If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.|
|contains()|	This method is used to check whether the queue contains the given object or not.|
|getFirst()|	This method is used to retrieve, but not remove, the first element of this deque.|
|getLast()|	This method is used to retrieve, but not remove, the last element of this deque.|
|offer(element)|	This method is used to add an element at the tail of the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.|
|offerFirst(element)|	This method is used to add an element at the head of the queue. This method is preferable to addFirst() method since this method does not throws an exception when the capacity of the container is full since it returns false.|
|offerLast(element)|	This method is used to add an element at the tail of the queue. This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.|
|peek()|	This method is used to retrieve the element at the head of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.|
|peekFirst()|	This method is used to retrieve the element at the head of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.|
|peekLast()|	This method is used to retrieve the element at the tail of the deque but doesn’t remove the element from the deque. This method returns null if the deque is empty.|
|poll()|	This method is used to retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.|
|pollFirst()|	This method is used to retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.|
|pollLast()|	This method is used to retrieve and remove the element at the tail of the deque. This method returns null if the deque is empty.|
|pop()|	This method is used to remove an element from the head and return it.|
|push(element)|	This method is used to add an element at the head of the queue.|
|removeFirst()|	This method is used to remove an element from the head of the queue.
|removeLast()|	This method is used to remove an element from the tail of the queue.|
|size()|	This method is used to find and return the size of the deque.|

##Hashmap

```java

    String s= "Code here";

```

| METHOD | DESCRIPTION    |
| ------ | -------------- |
|clear()|  Removes all of the mappings from this map.|
|clone()|  Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.|
|containsKey(Object key) | Returns true if this map contains a mapping for the specified key.|
|containsValue(Object value)| Returns true if this map maps one or more keys to the specified value.|
|entrySet()|	Returns a Set view of the mappings contained in this map.|
|get(Object key)| Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.|
|isEmpty()|	Returns true if this map contains no key-value mappings.|
|keySet()	|Returns a Set view of the keys contained in this map.|
|put(K key, V value)|	Associates the specified value with the specified key in this map.|
|remove(Object key)	|Removes the mapping for the specified key from this map if present.|
|size()	|Returns the number of key-value mappings in this map.|
|values()	|Returns a Collection view of the values contained in this map.|
