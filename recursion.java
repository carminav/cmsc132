// Two ways adding numbers 0 -> 10

 //for loop
 public int addUpTo(int x) {
     int sum = 0;
     for (int i = 0; i <= x; i++) {
	sum += i;
     }

     return sum;
 }

//recursive 
 public int recursiveAddUpTo(int x) {
   
      //Base Case
      //if x is 0, then what is the sum?
      if (x == 0) {
     	return 0;
      } else { //Recursive step
	return x + recursiveAddUpTo(x-1);
      }	      
 }


________________________________________


recursiveAddUpTo(3); // should return 6

1. recursiveAddUpTo(3) -> 3 + recursiveAddUpTo(2) 
2. recursiveAddUpTo(2) -> 2 + recursiveAddUpTo(1)
3. recursiveAddUpTo(1) -> 1 + recursiveAddUpTo(0)
4. recursiveAddUpTo(0) -> 0



















