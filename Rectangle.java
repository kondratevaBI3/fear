//прямоугольник
public class Rectangle implements Square{
    int a=34;
    int b=16;
   @Override
    public int FindSquare () {
       int result = a*b;
       return result;
    }
    @Override
    public int FindPerimeter(){
       int res=2*(a+b);
       return res;
    }
    @Override
    public void print (){
        System.out.println("this Rectangle has square:"+ FindSquare());
        System.out.println("this Rectangle has perimeter: "+ FindPerimeter());
    }
}
