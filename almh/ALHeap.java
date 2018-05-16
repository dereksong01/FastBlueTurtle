/*****************************************************
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 *****************************************************/

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap; 

  /*****************************************************
   * default constructor  ---  inits empty heap
   *****************************************************/
  public ALHeap() 
  { 
    _heap = new ArrayList<Integer>();
  }



  /*****************************************************
   * toString()  ---  overrides inherited method
   * Returns either 
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   *****************************************************/
  public String toString() 
  { 
    //temporary
    String retVal = "[";
    for(int i = 0; i < _heap.size(); i++){
      retVal += _heap.get(i) + ",";
    }
    return retVal + "]";
  }//O(?)


  /*****************************************************
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   *****************************************************/
  public boolean isEmpty()
  { 
    return(_heap.size() == 0);
  }//O(1)


  /*****************************************************
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   *****************************************************/
  public Integer peekMin()
  { 
    Integer min = _heap.get(0);
    for(int i = 0; i < _heap.size(); i++){
      if(_heap.get(i) < min){
        min = _heap.get(i);
      }
    }
    return min;
  }//O(n)


  /*****************************************************
   * add(Integer) 
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   *****************************************************/
  public void add( Integer addVal )
  { 
    if(_heap.size() == 0){
      _heap.add(addVal);
    }

    else{
      for(int i = 0; i < _heap.size() - 1; i++){
        if(_heap.get(i) < addVal && _heap.get(i + 1) > addVal){
          _heap.add(i + 1, addVal);
        }
      }
    }

  }//O(n)


  /*****************************************************
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   *****************************************************/
  public Integer removeMin()
  { 
    Integer retVal = peekMin();

    if(minChildPos(0) == -1){
      return null;
    }

    _heap.remove(minChildPos(0));

    return retVal;
  }//O(n)


  /*****************************************************
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or 
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   *****************************************************/
  private int minChildPos( int pos )
  { 
    int retVal = 0;

    if(_heap.size() == 0){
      return -1;
    }

    for(int i = 0; i < _heap.size(); i++){
      if(_heap.get(i) < _heap.get(retVal)){
        retVal = i;
      }
    }
    return retVal;
  }//O(n)
  

  //************ aux helper fxns ***************
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
	    return a;
    else
	    return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );	
  }
  //********************************************



  //main method for testing
  public static void main( String[] args )
  {

      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
