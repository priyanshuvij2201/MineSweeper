import java.io.*;
class mineblock
{
public static void main(String ar[])throws Exception
{
double aa,bb,cc,dd;
int rows,col,n,x,y,r=0,c=0,nbomb,t,ro=0,co=0,ch,p=0,count=0,total,correctflag=0,correctdoubt=0,score;
DataInputStream z=new DataInputStream(System.in);
System.out.println("Enter No. of Rows & Column");
rows=Integer.parseInt(z.readLine());
col=Integer.parseInt(z.readLine());
n=rows;
while(n!=0)
{
System.out.print("|");
n--;
for(x=1;x<=col;x++)
{
System.out.print("_|");
}
System.out.println();
}
System.out.print("Enter No. of Bombs");
nbomb=Integer.parseInt(z.readLine());
int A[][]=new int[rows][col];
for(y=1;y<=nbomb;y++)
{
aa=Math.random();
 bb=aa*rows;
r=(int)bb;
cc=Math.random();

while(aa==cc)
{
cc=Math.random();
}
dd=cc*col;
c=(int)dd;
A[r][c]=10+A[r][c];
try
{
A[r-1][c-1]=A[r-1][c-1]+1;
}
catch(ArrayIndexOutOfBoundsException b)
{
}
try
{
A[r-1][c+1]=A[r-1][c+1]+1;

}
catch(ArrayIndexOutOfBoundsException b)
{
}
try
{
A[r+1][c+1]=A[r+1][c+1]+1;

}
catch(ArrayIndexOutOfBoundsException b)
{
}
try
{
A[r+1][c-1]=A[r+1][c-1]+1;
}
catch(ArrayIndexOutOfBoundsException b)
{
}
try
{
A[r+1][c]=A[r+1][c]+1;

}
catch(ArrayIndexOutOfBoundsException b)
{
}
try
{A[r-1][c]=A[r-1][c]+1;
}
catch(ArrayIndexOutOfBoundsException b)
{
}
try
{
A[r][c-1]=A[r][c-1]+1;
}
catch(ArrayIndexOutOfBoundsException b)
{
}
try
{
A[r][c+1]=A[r][c+1]+1;
}
catch(ArrayIndexOutOfBoundsException b)
{}
}
total=rows*col;
boolean bool=true;
String B[][]=new String[rows][col];
while(bool==true)
{
System.out.println("Enter Choice 1-Play, 2-Flag , 3-Doubt");
ch=Integer.parseInt(z.readLine());
System.out.println("Enter row and Column");
ro=Integer.parseInt(z.readLine());
co=Integer.parseInt(z.readLine());
switch (ch)
{
case 1:
B[ro][co]=(String.valueOf(A[ro][co]));
if(A[ro][co]>=10)
{
bool=false;
System.out.println("You clicked on a bomb");
for(x=0;x<rows;x++)
{
for(y=0;y<col;y++)
 System.out.print(A[x][y]+"_|");
System.out.println();
 }
break;
}
else
p++;
for(x=0;x<rows;x++)
{

for(y=0;y<col;y++)
 System.out.print(B[x][y]+"_|");
System.out.println();
 }
break;
case 2:
B[ro][co]="*";
if(A[ro][co]>=10)
correctflag++;
for(x=0;x<rows;x++)
{

for(y=0;y<col;y++)
 System.out.print(B[x][y]+" _|");
System.out.println();
 }


break;
case 3:
B[ro][co]="?";
if(A[ro][co]>=10)
correctdoubt++;
for(x=0;x<rows;x++)
{

for(y=0;y<col;y++)
 System.out.print(B[x][y]+" _|");
System.out.println();
 }
break;
default:
System.out.println("wrong choice");
}
count++;
if(count==total)
bool=false;
}
if(correctflag==nbomb)
score=(correctflag*100)+1000;
else
score=correctflag*100;
System.out.println("Your Total Score is " +score);

 }
 }
 


