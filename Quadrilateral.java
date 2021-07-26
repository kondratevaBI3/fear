//четырехугольник
public class Quadrilateral implements Square{
    int a=23;
    int s=12;
    int d=15;
    int f=21;
    int d1=28;
    int d2=19;
    @Override
    public int FindSquare(){
        int result = d1*d2/2;
        return result;
    }
    @Override
    public int FindPerimeter(){
        int res=a+s+d+f;
        return res;
    }
    @Override
    public void print (){

        System.out.println("this Quadrilateral has square:"+ FindSquare());
        System.out.println("this Quadrilateral has perimeter: "+ FindPerimeter());
    }
}



