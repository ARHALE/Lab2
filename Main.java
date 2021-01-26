class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int numAll;
    double numBlue, numBrown, numGreen, numOrange,numRed, numYellow;
    numAll=55*9;
    numBlue=numAll*.24;
    numBrown=numAll*.13;
    numGreen=numAll*.16;
    numOrange=numAll*.20;
    numRed=numAll*.13;
    numYellow=numAll*.14;
    System.out.println("Blue: " +numBlue);
    System.out.println("Brown: " +numBrown);
    System.out.println("Green: " +numGreen);
    System.out.println("Orange: " +numOrange);
    System.out.println("Red: " +numRed);
    System.out.println("Yellow: " +numYellow);
    double sumAll =(numBlue + numBrown + numGreen + numOrange + numRed + numYellow);
    System.out.println("Sum: " +sumAll);
    if ( numBlue > numBrown && numGreen > numRed)
    System.out.println("Blue over Brown and Green over Red");
    if ( numBrown <= numOrange)
     System.out.println("Brown is less than or equal to Orange");
     if ( sumAll == numAll)
     System.out.println( "Numbers match");

  }
}