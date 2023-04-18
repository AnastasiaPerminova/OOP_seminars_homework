import java.util.Random;

public class Closet {
    private Purpose purpose; //Назначение шкафа
    private int size; //Размер шкафа

    private boolean closed_doors;// Закрытые дверцы

    private int emptySpace;//Пустое пространство

    private int occupied;//Занятое пространство

    //конструктор класса
    public Closet(Purpose purpose){
        this.purpose = purpose;
        this.size = new Random().nextInt(10, 20);
        this.occupied = new Random().nextInt(0, size + 1);
        this.emptySpace = size - occupied;
        this.closed_doors = true;

    }
    //преобразование класса для вывода на печать
    @Override
    public String toString() {
        return String.format("Назначение шкафа: %s, размер шкафа: %d, занято: %d, cвободное место: %d", purpose, size, occupied, emptySpace);
    }

    /**
     * Изменяет значение переменной closed_doors на false.
     */
    public void openDoors(){
        if (closed_doors == true){
            closed_doors = false;
        }
    }

    /**
     * Изменяет значение переменной closed_doors на true.
     */
    public void closeDoors() {
        if (closed_doors == false) {
            closed_doors = true;
        }
    }

    /**
     * "Убирает" @param object из шкафа Closet, изменяя значение переменных occupied, emptySpace.
     */
    public void takeObject(Object object)
    {
        if (object.purpose.equals(this.purpose) && !closed_doors && (occupied > 0))
        { System.out.println("Ура! Взяли!");
          occupied = occupied - 1;
          emptySpace +=1;
          closeDoors();
        }

        else if (!object.purpose.equals(this.purpose))
        {
            System.out.println("Это не тот шкаф!");
        } else if (closed_doors) {
            System.out.println("Откройте дверцы!");
        } else if (occupied == 0) { System.out.println("Шкаф пуст!");

        }

    }

    /**
     * "Добавляет" @param object в шкаф Closet, изменяя значение переменных occupied, emptySpace.
     */
    public void putObject(Object object)
    {if (object.purpose.equals(this.purpose) && !closed_doors && (emptySpace> 0)) {
        System.out.println("Ура! Положили!");
        occupied += 1;
        emptySpace = emptySpace - 1 ;
        closeDoors();
    }
    else if (!object.purpose.equals(this.purpose))
    {
        System.out.println("Это не тот шкаф!");
    } else if (closed_doors) {
        System.out.println("Откройте дверцы!");
    } else if (emptySpace == 0) { System.out.println("Шкаф полон!");

    }
    }

}


