java-fundamentals-20130107
==========================

Class design recipe
-------------------

  * Fields (all private, and mostly final)
  * Constructor (initializing all final fields, and optionally others)
  * Getters, setters and other logic
  * Identity: hashCode and equals (implemented using final fields only)

Class inheritance pitfalls
--------------------------

  * Be careful not to inherit behavior from a superclass that doesn't apply correctly to the subclass!
  * Be careful not to change assumptions in a subclass that should be true for the superclass!
  * When classes are immutable, inheritance is much safer (i.e. Liskov substitutability is much easier to maintain and verify).

Commonly-used collections
-------------------------

  * Collection
    * List
      * ArrayList (fast random access)
      * LinkedList (fast arbitrary insertion)
    * Set
      * HashSet (very fast operations, unsorted)
      * TreeSet (reasonably fast operations, sorted)
  * Map
    * HashMap (very fast operations, unsorted)
    * TreeMap (reasonably fast operations, sorted)

Design patterns
---------------

  * Composite: implement a recursive data structure by defining an interface, and some implementation classes that may contain other instances of that interface.
  * Decorator: wrap instances of lower-level classes to provide new higher-level functionality.

Videos
------

Day 1:

  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/1.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/1.2.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/1.3.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/1.4.mov

Day 2:

  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/2.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/2.2.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/2.3.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/2.4.mov

Day 3:

  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/3.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/3.2.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/3.3.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/3.4.mov

Day 4:

  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/4.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/4.2.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/4.3.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/4.4.mov

Day 5:

  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/5.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-fundamentals-cisco-20130107/5.2.mov

References
----------

  * Best Practices: "Effective Java"
  * Concurrency: "Java Concurrency in Practice"
  * Maven: http://maven.apache.org