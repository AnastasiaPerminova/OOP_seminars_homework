public class ComplexMultModel extends ComplexCalcModel{
    public static final  String name = "Произведение ";

    public ComplexMultModel() {
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public Object result() {
        return new ComplexNumber((x.x * y.x - x.i * y.i), (x.i * y.x + x.x * y.i));
    }

    @Override
    public void setX(ComplexNumber value) {super.x = value;

    }

    @Override
    public void setY(ComplexNumber value) {super.y = value;

    }

}
