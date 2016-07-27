/**
 * 
 */
package com.github.cloud.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author daniel.menezes
 *
 */
public class CommonTEST {

	/**
	 * Simple test to compare equals String
	 */
	@Test
	public void simpleTestString() {
		Assert.assertEquals("Simple test", "Simple " + "test");
	}
	
	/**
	 * Simple test to compare simple sum
	 */
	@Test
	public void simpleTestInteger() {
		Integer sum = new Integer("1") + new Integer("1");
		String oneMoreOne = sum.toString();
		Integer two = new Integer("2");
		Assert.assertEquals(oneMoreOne, two.toString());
	}

}
