/*

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
Note that Math.abs(n) returns the absolute value of a number.

*/

public int close10(int a, int b) {
int diffA = Math.abs(10-a);
int diffB = Math.abs(10-b);

//oringinally I had 10- var, and that would mean I would have to switch my logic
 if(diffA == diffB) return 0;
 if(diffA < diffB) return a;
 return b;
}
