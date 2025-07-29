package Day4;

public class FindTheDistance{
    public static void main(String[] args)
    {

        ThreeD point1 = new ThreeD(); //Default constructor using to assign the values
        point1.setX(1);
        point1.setY(2);
        point1.setZ(3);


        //parameterized constructor
        ThreeD point2 = new ThreeD(4,5,6) ; 

        double d = point1.findDistance(point2);
        System.out.println("Distance between two 3D points: " + d);
    }
}//main class

class TwoD{
    protected int x ,y ;

    TwoD()
    {
        x = y = 0;
        
    }//default constructor

    TwoD(int x, int y)
    {
        this.x = x;
        this.y = y;

    }//parameterized constructor

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getX()
    {  return x; }

    public int getY()
    {  return y; }


    
    
}//class - TwoD

class ThreeD extends TwoD{
    private int z;

    ThreeD() { z = 0; }

    ThreeD(int z)
    { 
        super();
        this.z= z;
    }
    ThreeD(int x, int y,int z)
    { 
        this.x = x;
        this.y= y;
        this.z = z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    public int getZ()
    {
        return z;
    }

    public double findDistance(ThreeD other)
    {

        int xValue = (this.getX() - other.getX()) * 2;
        int yValue = (this.getY() - other.getY()) * 2;
        int zValue = (this.getZ() - other.getZ()) * 2;

        return xValue + yValue + zValue;

    }

}