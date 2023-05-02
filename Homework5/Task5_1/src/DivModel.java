public class DivModel extends CalcDoubleModel{
    public static final String name = "Частное ";

    public DivModel() {
    }

    @Override
    public Object result() {
        return x / y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }
    public String getName() {
        return name;
    }
}
