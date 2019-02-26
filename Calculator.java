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
 * Declaring the class Calculator which will be used to perfrom basic 
 * calculations and also used to record the history of operations 
 * performed.
 */
public class Calculator {

	/*
	 * This variable of integer type is used to store the result of 
	 * all the operations.
	 */
	private int total;
	
	/*
	 * This variable is used of String type is used to create a history 
	 * of all the operations performed using this program. 
	 */
	private String opHistory;
	
	/*
	 * This constructor is used to intialize the variable total to 0.
	 * The String variable opHistory is also intialized in the contructor
	 */
	public Calculator() {
		total = 0;  // not needed - included for clarity
		opHistory = new String("0");
	}
	
	/*
	 * This is a accessor method. It accesses the "total"
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
	 * to the variable "total". It also records the operation
	 * performed by adding the add(+ sign) symbol and "value" to 
	 * the variable opHistory
	 * @param value
	 */
	public void add (int value) {
		total = total+value;
		opHistory = opHistory + " + " + value;
	}
	
	/*
	 * The given method subtracts the given parameter 'value'
	 * from the integer variable "total" and assigns a new value 
	 * to the variable "total". It also records the operation
	 * performed by adding the subtract(- sign) symbol and "value" to 
	 * the variable opHistory
	 * @param value
	 */
	public void subtract (int value) {
		total = total-value;
		opHistory = opHistory + " - " + value;
	}
	
	/*
	 * The given method multiplies the variable "total" by
	 * the given parameter "value" and assigns a new value 
	 * to the variable "total". It also records the operation
	 * performed by adding the multiply symbol and "value" to 
	 * the variable opHistory.
	 * @param value
	 */
	public void multiply (int value) {
		total = total*value;
		opHistory = opHistory + " * " + value;
	}
	
	/*
	 * This method divides the variable total by
	 * given parameter "value" and assigns a new value 
	 * to the variable "total". It also records the operation
	 * performed by adding the divide symbol and "value" to 
	 * the variable opHistory
	 * @param value
	 */
	public void divide (int value) {
		if(value==0) {
			total =0;
		}else
			total = total/value;
		
		opHistory = opHistory + " / " + value;
	}
	
	/*
	 * This method is another accesor method which is used to get 
	 * the history of all the operations completed at a certain point 
	 * or after all the operations are completed.
	 * @return opHistory
	 */
	public String getHistory () {
		return opHistory;
	}	

}
