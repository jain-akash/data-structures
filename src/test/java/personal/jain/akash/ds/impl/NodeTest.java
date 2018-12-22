package personal.jain.akash.ds.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import personal.jain.akash.ds.api.INode;

/**
 * Unit test for Node.
 */
public class NodeTest {

	@Test
    public void getValueShouldAnswerWithNull()
    {
		INode<String> myNode = new Node<String>();
		assertNull("Node value should be null", myNode.getValue());
    }
	
	@Test
    public void getValueShouldAnswerWithValueSetUsingSetValue()
    {
		INode<String> myNode = new Node<String>();
		String valueString = "test value";
		myNode.setValue(valueString);
		assertEquals("Either setValue or getValue of Node is broken", valueString, myNode.getValue());
    }
	
	@Test
    public void nextShouldAnswerWithNull()
    {
		INode<String> myNode = new Node<String>();
		assertNull("Node's next should be null", myNode.next());
    }
	
	@Test
    public void nextShouldAnswerWithINodeSetUsingSetNext()
    {
		INode<String> myNode = new Node<String>();
		INode<String> nextNode = new Node<String>();
		myNode.setNext(nextNode);
		assertEquals("Either setNext or getNext of Node is broken", nextNode, myNode.next());
    }
	
	@Test
	public void hasNextShouldAnswerWithFalse()
	{
		INode<String> myNode = new Node<String>();
		assertFalse("Node's hasNext is broken", myNode.hasNext());
	}
	
	@Test
	public void hasNextShouldAnswerWithTrue()
	{
		INode<String> myNode = new Node<String>();
		INode<String> nextNode = new Node<String>();
		myNode.setNext(nextNode);
		assertTrue("Node's hasNext or setNext is broken", myNode.hasNext());
	}
}
