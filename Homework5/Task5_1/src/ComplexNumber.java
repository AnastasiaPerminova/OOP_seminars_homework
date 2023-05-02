class ComplexNumber {

    double x;
    double i;


    ComplexNumber(double x, double i) {
        this.x = x;
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ComplexNumber compNum = (ComplexNumber) obj;
        return this.x == compNum.x && this.i == i;
    }

    @Override
    public String toString() {
        if(i >= 0){
            return x + " + " + i + "i";  }
        else {
            return x +" " + i + "i";
        }  }
//    @Override
//    public ComplexNumber sum( ComplexNumber y) {
//        return new ComplexNumber((x + y.x), (i + y.i));
//    }
//
//    @Override
//    public ComplexNumber diff(ComplexNumber y) {
//        return new ComplexNumber((x - y.x), (i - y.i));
//
//    }
//
//    @Override
//    public ComplexNumber mult(ComplexNumber y) {
//        return new ComplexNumber((x * y.x - i * y.i), (i * y.x + x * y.i));
//    }
//
//    @Override
//    public ComplexNumber div(ComplexNumber y) {
//        return new ComplexNumber(((x * y.x + i * y.i)/(y.x * y.x + y.i * y.i)), ((i * y.x - x * y.i)/(y.x * y.x + y.i * y.i)));
//    }

}
