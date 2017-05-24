/*S.McDonald 11/2/2016
Invoice.java
*/


public class Invoice
{
   //holds five data members
   int invoiceNumber;
   double balance;
   int month;
   int day;
   int year;
   
   final int MIN_INVOICE = 1000; //minimum allowed invoice number
   final int MAX_MONTH = 12; //maximum allowed month
   final int MAX_DAY = 31; //maximum allowed day
   final int MAX_YEAR = 2017; //maximum allowed year
   final int MIN_YEAR = 2011; //minimum allowed year
   
   //create a constructor with required parameters
   public Invoice(int num, double bal, int mo, int da, int yr)
   {
      //create data validation rules for private data members
      if (num < 1000)
         invoiceNumber = 0;
      else
         invoiceNumber = num;
      //validate the month
      if (mo < 1 || mo > MAX_MONTH)
         month = 0;
      else
         month = mo;
      //validate a day
      if (da < 1 || da > MAX_DAY)
         day = 0;
      else
         day = da;
      //validate the year
      if (yr < MIN_YEAR || yr > MAX_YEAR)
         year = 0;
      else
         year = yr;
         
      balance = bal; //capture the value of bal passed
         
   
   }//Invoice constructor
   
   public void show()
   {
      System.out.println("Invoice #" + invoiceNumber + " $" + balance + " Due: " + month + "/" + day +
                         "/" + year);
   
   }//show method

}//class