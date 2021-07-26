import java.util.Comparator;

//параллелограм
public class Parallelogram implements Square, Comparator<Parallelogram> {
    int Parallelogram1 =34;
    int h=16;
    int Parallelogram2=25;
    @Override
    public int FindSquare() {
        int result = Parallelogram1*h;
        return result;
    }
    @Override
    public int FindPerimeter (){
        int res = 2*(Parallelogram1+Parallelogram2);
        return res;
    }
    @Override
    public int сompare(int Parallelogram1, int Parallelogram2) {
        if (Parallelogram1 == Parallelogram2) {
            return 0;
        }
        if (Parallelogram1>Parallelogram2) {
            return 1;
        }
        else {
            return -1;
        }
    }
    @Override
    public void print(){
        System.out.println("This Parallelogram has square:"+ FindSquare());
        System.out.println("This Parallelogram has perimeter: "+ FindPerimeter());
        System.out.println("The longest side is: "+ compare());

    }


}

