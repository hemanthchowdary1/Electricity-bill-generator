// Program to create Electricity Bill Generator
/*
Rupees per unit for domestic connection
1-100 - 1Rs per unit
101-200 - 2.5Rs per unit
201-500 - 4Rs per unit
501 above - 6Rs per unit
*/
/*
Rupees per unit for commercial connection
1-100 - 2Rs per unit
101-200 - 4.5Rs per unit
201-500 - 6Rs per unit
501 above - 7Rs per unit
*/
import java.util.Scanner;
public class ElectricityBill
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter The Consumer ID : ");
int consumer_no = sc.nextInt();
System.out.println("Enter The Consumer Name : ");
String consumer_name = sc.next();
System.out.println("ENter The Prev Reading : ");
int previous_reading = sc.nextInt();
System.out.println("Enter the Current Reading : ");
int current_reading = sc.nextInt();
System.out.println("Enter The Type of EB connection in Numbers ( 1) Domestic / 2) Commerial ) ");
int connection_type = sc.nextInt();
int choice;
double bill_amount = 0;
if(connection_type == 1)
{
choice = 1;
}
else
{
choice = 2;
}
switch(choice)
{
case 1:
if(current_reading>=0 && current_reading<=100)
{
bill_amount = current_reading*1;
}
else if(current_reading>100 && current_reading<=200)
{
bill_amount = ((100*1)+(current_reading-100)*2.5);
}
else if(current_reading>200 && current_reading<=500)
{
bill_amount = ((100*1)+(100*2.5)+(current_reading-200)*4);
}
else
{
bill_amount = ((100*1)+(100*2.5)+(100*4)+(current_reading-500)*6);
}
break;
case 2:
if(current_reading>=0 && current_reading<=100)
{
bill_amount = current_reading*2;
}
else if(current_reading>100 && current_reading<=200)
{
bill_amount = ((100*2)+(current_reading-100)*4.5);
}
else if(current_reading>200 && current_reading<=500)
{
bill_amount = ((100*2)+(100*4.5)+(current_reading-200)*6);
}
else
{
bill_amount = ((100*2)+(100*4.5)+(100*6)+(current_reading-500)*7);
}
break;
}
String total = Double.toString(bill_amount);
System.out.println("--------------------------------");
System.out.println(" Electricity Bill ");
System.out.println("--------------------------------");
System.out.println("Consumer No : "+consumer_no);
System.out.println("Consumer Name : "+consumer_name);
System.out.println("Previous reading : "+previous_reading);
System.out.println("Current Reading : "+current_reading);
System.out.println("Connection Type : "+connection_type);
System.out.println("***************");
System.out.println("The Bill Amount : "+total);
}
}