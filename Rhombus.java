//ромб
public class Rhombus implements Square{
    int t=14;
    int d1=23;
    int d2=10;
    @Override
    public int FindSquare () {
        int result = (d1*d2)/2;
        return result;
    }
    @Override
    public int FindPerimeter(){
        int res = 4*t;
        return res;
    }
    @Override
    public void print (){
        System.out.println("this Rhombus has square:"+ FindSquare());
        System.out.println("this Rhombus has perimeter: "+ FindPerimeter());
    }
}

