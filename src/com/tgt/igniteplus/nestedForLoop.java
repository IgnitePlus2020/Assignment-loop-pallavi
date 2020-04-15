/*Example for nested for loop: to print a pyramid
output:
*
* *
* * *
* * * *
* * * * *
 */

package com.tgt.igniteplus;

public class nestedForLoop
{
    public static void main(String[] args)
    {
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();//new line
    }
    }
}
