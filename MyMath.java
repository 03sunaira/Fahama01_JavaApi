/*
 * Copyright (c) Fahama Barakzai. All rights reserved.
 * MUET. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * Portions Copyright 14SW01. All Rights Reserved.
 */

//package java.math;
import java.io.*;

/**
 * Immutable objects which describe certain rules for numerical operators, such as those
 * implemented by the basic mathematical operators.
 *
 * <p>The base-independent settings are:
 * <ol>
 * <li>{@code precision}:
 * the number of basic mathematical operations
 *
 * @see     add, sub,mult,div
 * @author  Fahama Barakzai (14SW01)
 * @since 1.5
 */


class MyMath
{
	/*
	*
	* initializing variables which will be used for storing values
	* initializing methods which will be used for this class
	*/
	public int resultAdd = 0;
	public int resultSub = 0;
	public int resultMult = 0;
	public int resultDiv = 0;

	/*
	* defining methods
	*/

	//***--Method for Addition--***
	public int add(int a, int b)
	{
		resultAdd = a+b;
		return resultAdd;
	}

	//***--Method for Subtraction--***
	public int sub(int a, int b)
	{
		resultSub = a-b;
		return resultSub;
	}

	//***--Method for Multiplication--***
	public int mult(int a, int b)
	{
		resultMult = a*b;
		return resultMult;
	}

	//***--Method for Division--***
	public int Div(int a, int b)
	{
		resultDiv = a/b;

		/*
		* condition
		*/
		if (b == 0)
		{
			System.out.println("APPROACHES TO INFINITY");
		}

		return resultDiv;
	}
}