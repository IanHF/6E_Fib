/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public long fib_recurrence( int n) {
        if ((n = 1) | (n = 0)){
            return n;
        }else{
            if(n < 0){
                return -2;
            }else{
                return fib(n-1) + fib(n-2);
            } 
        } 
    }

    public static void main (String args[]) 
    { 
    int n = 9; 
    System.out.println(fib(n)); 
    } 
        }
    }
     /* These are instance methods because these are no objects to apply these methods to. A numerical is all the needed input.
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public long fib_grade8( int n) {
        if (n <= 0){
            return -2;
        }else{
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 0; i = n; i++){
                c = b;
                b += a;
                a = c;
            }
            return b;
        }
    }
    /* Time complexity:
       Consider the size of the problem to be the size of n.
       
       As the proxy for the time required, count number of invocations or loops.
       
       Then cost of the the recurrence algorithm
       grows logarithmically
       as the size of the problem increases,
       because each invocation results in two more, leading to powers of two defining how many invocations there are total.
     */
    //the 8grade algorithm grows linearly.

    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public double fib_Binet( int n) {
        if(n < 0){
                return -2;
            }else{
                double phi= (1+Math.sqrt(5))/2;
                double x = Math.pow(phi,n);
                double y = Math.pow(1-phi,n);
                double z = Math.sqrt(5);
                return( (int) ((x-y)/z) );
            }
    }
    /* Time complexity:
       Then cost of the the binet algorithm
       is constant. 
       as the size of the problem increases,
       because a single solution of this equation will always take the same amount of time.
     */
}