/**
 * Name: Rahul Kancharala
 * Class ID: 431
 * Assignment 2
 * Description: This class is given to the students to
 * 				practice using a version control system. It is a 
 * 				calculator class which needs to be documented
 * 				according to the JavaDoc format and indented properly 
 * 				with structured programming.
 */

/**
 * The link to the GitHub site for the following assignment is below
 * 
 */

/**
 * This connects the project and specifies the package.
 */

package cse360assign2;

/**
 * Declaring the class Calculator
 */

public class Calculator {

	/*
	 * This variable of integer type is used to store the result of 
	 * all the operations.
	 */
	private int total;
	
	/*
	 * This constructor is used to intialize the variable total to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * This is a accessor method. It accesses the total
	 * variable after all the operations are completed or 
	 * whenever required.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * The given method adds the parameter "value" to the 
	 * integer variable "total" and assigns a new value
	 * to the variable "total".
	 * @param value
	 */
	public void add (int value) {
		total = total+value;
	}
	
	/*
	 * The given method subtracts the given parameter 'value'
	 * from the integer variable "total" and assigns a new value 
	 * to the variable "total".
	 * @param value
	 */
	public void subtract (int value) {
		total = total-value;
	}
	
	/*
	 * The given method multiplies the variable "total" by
	 * the given parameter "value" and assigns a new value 
	 * to the variable "total".
	 * @param value
	 */
	public void multiply (int value) {
		total = total*value;
	}
	
	/*
	 * This method divides the variable total by
	 * given parameter "value" and assigns a new value 
	 * to the variable "total".
	 * @param value
	 */
	public void divide (int value) {
		if(value==0) {
			total =0;
		}else
			total = total/value;
	}
	
	/*
	 * 
	 * @return ""
	 */
	public String getHistory () {
		return "";
	}
	

}
