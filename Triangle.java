/**
 * Triangle
 */
public class Triangle {
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    
    public Triangle(double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public boolean isValid() {
        if (this.sideLenOne + this.sideLenTwo >= this.sideLenThree
        && this.sideLenTwo + this.sideLenThree >= this.sideLenOne
        && this.sideLenThree + this.sideLenOne >= this.sideLenTwo) {
            return true;
        } else {
            return false;
        }
    }

    public int isEquilateral() {
        if (this.isValid()) {
            if (this.sideLenOne == this.sideLenTwo && this.sideLenOne == this.sideLenThree
            && this.sideLenTwo == this.sideLenThree) {
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }

    public int isIsosceles() {
        if (this.isValid()) {
            if (this.sideLenOne == this.sideLenTwo || this.sideLenOne == this.sideLenThree
            || this.sideLenTwo == this.sideLenThree) {
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }

    public int isScalene() {
        if (this.isValid()) {
            if (this.sideLenOne != this.sideLenTwo && this.sideLenOne != this.sideLenThree
            && this.sideLenTwo != this.sideLenThree) {
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }

    public String triangleType() {
        if (this.isEquilateral() == 1) {
            return "Equilateral";
        }
        if (this.isIsosceles() == 1) {
            return "Isosceles";
        }
        if (this.isScalene() == 1) {
            return "Scalene";
        }
        return "Undefined";
    }

    public double findPerimeter() {
        if (this.isValid()) {
            double perimeter = this.sideLenOne + this.sideLenTwo + this.sideLenThree;
            return perimeter;
        }
        return -1;
    }

    public double findArea() {
        if (this.isValid()) {
            String type = this.triangleType();

            if (type.equals("Equilateral")) {
                double area = (Math.sqrt(3) * Math.pow(this.sideLenOne, 2)) / 4;
                return area;
            }
            if (type.equals("Isosceles")) {
                double b  = this.sideLenOne;
                double h = Math.sqrt(Math.pow(this.sideLenTwo, 2) - Math.pow(this.sideLenOne, 2) / 4);
                double area = (b * h) /2;
                return area;
            }
            if (type.equals("Scalene")) {
                double s = this.findPerimeter() / 2;
                double area = Math.sqrt(s * (s - this.sideLenOne) * (s - this.sideLenTwo) * (s - this.sideLenThree));
                return area;
            }
        }
        return -1;
    }

}