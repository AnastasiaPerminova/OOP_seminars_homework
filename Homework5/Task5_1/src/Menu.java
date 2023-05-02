public class Menu {
    final View view = new View();
    Presenter presenter;

    public Menu() {
    }

    public void setPresenter(){
        int numbers = view.getMenu("Выберите с какими числами Вы хотите работать. \n" +
                "1 - действительные числа.\n" +
                "2 - комплексные числа.\n" +
                "Введите: ");
        int action = view.getMenu("Какое вычисление хотите произвести?. \n" +
                "1 - сложение.\n" +
                "2 - вычитание.\n" +
                "3 - умножение.\n" +
                "4 - деление.\n" +
                "Введите: ");
        if (numbers == 1 && action == 1) {
            presenter = new Presenter(new SumModel(), new View());
        }
        else if (numbers == 1 && action == 2) {
             presenter = new Presenter(new DiffModel(), new View());
        }
        else if (numbers == 1 && action == 3) {
            presenter = new Presenter(new MultModel(), new View());
        }
        else if (numbers == 1 && action == 4) {
            presenter = new Presenter(new DivModel(), new View());
        }
        else if (numbers == 2 && action == 1) {
            presenter = new Presenter(new ComplexSumModel(), new View());

        }
        else if (numbers == 2 && action == 2) {
            presenter =new Presenter(new ComplexDiffModel(), new View());

        }
        else if (numbers == 2 && action == 3) {
            presenter = new Presenter(new ComplexMultModel(), new View());

        }
        else if (numbers == 2 && action == 4) {
            presenter = new Presenter(new ComplexDivModel(), new View());
        }
    }


    public void run(){
        boolean run = true;
        while (run) {
            int button = view.getMenu("1 - Продолжить работу. \n" +
                    "0 - Выйти.\n" +
                    "Введите: ");
            if (button == 0) {
                run = false;
            }
            else if(button == 1){
                setPresenter();
                presenter.buttonClick();
            }
            else {
                System.out.println("Невозможно обработать.");
            }
        }

    }
}
