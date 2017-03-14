public class MyStack{
private int maxSize;
private long[] stackArray;
private int top;
public MyStack(int m)
{
maxsize=m;
stackArray=new long[maxSize];
top=-1;
}
public void push(long i);
stackArray[++top]=i;
}
public long pop(){
return stackArray[top];
}
public boolean is Empty(){
return(top==-1);
}
public boolean is full(){
return(top==maxSize -1);
}
public static void main (string []args)
{
MyStack Tstack=new MyStack(9);
Tstack.push(8);
Tstack.push(45);
Tstack.push(87);
while (! Tstack.isEmpty()){
long value=Tstack.pop();
system.out.print(value);
system.out.print(" ");
}
system.out.println("");
}
}
