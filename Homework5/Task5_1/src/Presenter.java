import java.io.FileWriter;
import java.io.IOException;

public class Presenter<T extends Model> {
 

    View view;
    T model;
    final String path = "Calculating.txt";
    public Presenter(T m, View v) {
        model = m;
        view = v;
    }


    public void buttonClick(){
        if (model instanceof DoubleModel){

            double a = view.getValue("a: ");
            double b = view.getValue("b: ");
            ((DoubleModel) model).setX(a);
            ((DoubleModel) model).setY(b);
            save(a, b, model.getName());
        }
        if(model instanceof ComplexModel){
            ComplexNumber a = new ComplexNumber(view.getValue("Введите действительную часть 1го комплексного числа: "), view.getValue("Введите мнимую часть 1го комплексного числа: "));
            ComplexNumber b = new ComplexNumber(view.getValue("Введите действительную часть 2го комплексного числа: "), view.getValue("Введите мнимую часть 2го комплексного числа: "));
            ((ComplexModel) model).setX(a);
            ((ComplexModel) model).setY(b);
            save(a, b, model.getName());
        }


        Object result = model.result();
        view.print(result,  model.getName() + " = ");
        save(result);

    }

    public void save(Object a, Object b, String modelName) {
        try (FileWriter writer = new FileWriter(path, true)) {
                writer.append(modelName+ " " + a + " и " + b + " = ");
                writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void save(Object result) {
        try (FileWriter writer = new FileWriter(path, true)) {
            writer.append(result.toString() + "\n");
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
