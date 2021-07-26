//трапеция
public class Trapezoidal4 implements Square{
    int a=5;
    int b=7;
    int c=6;
    int d=7;
    int h=4;
    @Override
    public int FindSquare(){
        int result=(a+b)/2*h;
        return result;
    }
    @Override
    public int FindPerimeter(){
        int res= a+b+c+d;
        return res;
    }
    @Override
    public void print (){

        System.out.println("this Trapezoidal has square:"+ FindSquare());
        System.out.println("this Trapezoidal has perimeter: "+ FindPerimeter());
    }

}
