/*this is my first program 
hahah
hello function()
*/
#include <stdio.h>

void main() {

   int a = 20;
   int b = 10;
   int c = 15;
   int d = 5;
   float e;

   e = (a + b) * c / d;      // ( 30 * 15 ) / 5
   printf("Value of (a + b) * c / d is : %d\n",  e );

   e = ((a + b) * c) / d;    // (30 * 15 ) / 5
   printf("Value of ((a + b) * c) / d is  : %d\n" ,  e );

   e = (a + b) * (c / d);   // (30) * (15/5)
   printf("Value of (a + b) * (c / d) is  : %d\n",  e );

   e =  a/c;     //  20 + (150/5)
   printf("Value of a + b * c / d is  : %f\n" ,  e );   // * / have same level of precedence, they follow left to right associativity. 

   //a*(b/c) == (a*b)/c
  
}

