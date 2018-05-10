## Decisions

* We chose to represent the back of the queue as the back of the arrayList because it would make add() O(1) runtime.


## Runtimes

* ``void add(String s)`` O(1)
* ``boolean isEmpty()`` O(1)
* ``String peekMin()`` O(n)
* ``String removeMin()`` O(n)
* ``String toString()`` O(n)