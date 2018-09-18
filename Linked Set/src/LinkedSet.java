/**
*  A linked-node implementation of the Set ADT
*/
public class LinkedSet implements SetInterface<String> 
{
@Override
public int getCurrentSize() 
	{
		return 0;
	}

@Override
public boolean isEmpty() 
	{
		return false;
	}
@Override
public boolean add(String newEntry) 
	{
		return false;
	}
@Override
public boolean remove(String anEntry) 
	{
		return false;
	}
@Override
public String remove() 
	{
		return null;
	}
@Override
public void clear() 
	{
		
	}
@Override
public boolean contains(String anEntry) 
	{
		return false;
	}
@Override
public LinkedSet reverseLink(Node head) 
	{
		return null;
	}
/*
 * returns a string representation of the items in the bag,
 * specifically a space separated list of the strings, enclosed
 * in square brackets [].  For example, if the set contained
 * cat, dog, then this should return "[cat dog]".  If the
 * set were empty, then this should return "[]".
 */
@Override
public String toString() 
	{
		return null;
	}

@Override
public String[] toArray() 
	{
		return null;
	}
}