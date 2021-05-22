//Test Method Using main 

public static void main(String[] args)
{

//Test case 1     
int x1[]={1,2,10,4,5,-2};
int t1=12;

if(Checker(x1,t1))
{
System.out.println("Valid List on X1[1,2,6,4,5,-2]-->Target as 12");
}
else 
{
 System.out.println("Invalid List on X1[1,2,6,4,5,-2]-->Target as 12");   
}
//Test Case 2
int x2[]={-1,0,-3,4,5,6};
int t2=10;

if(Checker(x2,t2))
{
System.out.println("Valid List on X2[-1,0,-3,4,5,6]-->Target as 10");
}
else 
{
 System.out.println("Invalid List on X2[-1,0,-3,4,5,6]-->Target as 10");   
}
//Test Case 3
int x3[]={1,2,3,4,5,0};
int t3=3;

if(Checker(x3,t3))
{
System.out.println("Valid List on X3[1,2,3,4,5,0]-->Target as 3");
}
else 
{
 System.out.println("Invalid List on X3[1,2,3,4,5,0]-->Target as 3");   
}

//Test Case 4
int x4[]={1,2,3,4,5,-58};
int t4=5;

if(Checker(x4,t4))
{
System.out.println("Valid List on X4[1,2,3,4,5,-58]-->Target as 4");
}
else 
{
 System.out.println("Invalid List on X4[1,2,3,4,5,-58]-->Target as 4");   
}
//Test Case 5
int x5[]={0,-2,1,4,5,6};
int t5=5;

if(Checker(x5,t5))
{
System.out.println("Valid List on X5[0,-2,1,4,5,6]-->Target as 5");
}
else 
{
 System.out.println("Invalid List on X5[0,-2,1,4,5,6]-->Target as 5");   
}
}
}
