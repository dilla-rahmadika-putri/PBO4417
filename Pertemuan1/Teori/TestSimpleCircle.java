package Pertemuan1.Teori;

public class TestSimpleCircle {
    /**Dilla Rahmadika Putri A11.2019.1174
     * @param args*/
    public static void main(String[] args){
        //membuat circle dengan radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("Luas ruangan meeting " + circle1.radius + " adalah " + circle1.getArea());
        
        //membuat circle dengan radius 20
        SimpleCircle circle2 = new SimpleCircle(20);
        System.out.println("Luas ruangan meeting " + circle2.radius + " adalah " + circle2.getArea());
        
        //membuat circle dengan radius 150
        SimpleCircle circle3 = new SimpleCircle(150);
        System.out.println("Luas ruangan meeting " + circle3.radius + " adalah " + circle3.getArea());
        
        //modify circle radius
        circle2.radius = 100;
        System.out.println("Luas ruangan meeting  " + circle2.radius + " adalah " + circle2.getArea());  
    }
}
