public class CreditCard {
  public static void main (String args []) {
    String cardNumber = args[0];
    System.out.print("You entered "+ cardNumber + "\n");
    //Display the users Command Line Argument
    String newCardNumber = cardNumber.replace(" ", "");
    //Replace the spaces in the argument
    String [] cardArr = newCardNumber.split(""); 
    //Set up the card number into an array with ONE number in each index
    int sum2 = 0;
    int sum1 = 0;
    int finalSum = 0;
    for (int i = 0; i < cardArr.length; i++) {
      if( ((i % 2) == 0) ) { //Check whether the index is in an even spot in the array
        char current = newCardNumber.charAt(i); //Grab the number at the defined index
        int neww = Character.getNumericValue(current) * 2; //Multiply the number at the defined index by 2 and set it to variable neww
        if (neww > 9) { //If neww larger than 9 subtract 9 to create a single digit variable
          neww -= 9;
        }
        cardArr[i] = Integer.toString(neww);
        //Replace array values with new values being created
        sum2 += Integer.parseInt(cardArr[i]);
        //If index is an even position, add it onto sum2
      }
      else {
        sum1 += Integer.parseInt(cardArr[i]);
        //If index is an odd position, add it onto sum1
      }
    }
    finalSum = sum1 + sum2;
    if( (finalSum % 10) == 0){ //If finalSum is divisible by 10, card number is valid
      System.out.print("Valid");
    }
    else{
      System.out.print("Invalid"); //If finalSum is not divisible by 10, card number is invalid
  }
    }
}