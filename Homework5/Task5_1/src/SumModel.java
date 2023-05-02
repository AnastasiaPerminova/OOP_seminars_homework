
public class SumModel extends CalcDoubleModel {

    public static final  String name = "Сумма ";


    public SumModel() {

    }

    public String getName() {
        return name;
    }

    @Override
    public Object result() {
        return x + y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }


}
