public class FindAreaAndPerimeter {

public void initial(){
    //Do nothing
}

public double calculateSquareArea(double side){
    double area = side * side;
    return area;
}

public double calculateSquarePerimeter(double side) {
    double perimeter = 4 * side;
    return perimeter;
}

public double calculateRectangleArea(double length, double breadth){
    double area = length * breadth;
    return area;
}

public double calculateRectanglePerimeter(double length, double breadth){
    double perimeter = 2 * (length + breadth);
    return perimeter;
}
}
