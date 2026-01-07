import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//שאלה מספר 1
        PizzaBuilder builder1 = new PizzaBuilder();
        Director director = new Director(builder1);
        director.creatPizzaWithToppings();
        Pizza pizza = builder1.getResult();
        System.out.println(pizza);

        PizzaBuilder builder2 = new PizzaBuilder();
        Director director2 = new Director(builder2);
        director2.creatPizzaWithOutToppings();
        Pizza pizza2 = builder2.getResult();
        System.out.println(pizza2);
        //שאלה מספר 2
        List<File> files=new ArrayList<>();
        List<File> filesCopy=new ArrayList<>();
        String []s=new String[2];
        s[0]="hi";
        s[1]="world";
        Word word=new Word();
        word.numOfPages=5;
        word.isAlong=true;
        word.name="home work1";
        word.path="D:\\lesson 2\\code from lesson\\src";
        word.size="a4";
        word.content=s;
        files.add(word);

        Word anotherWord =(Word) word.clone() ;
        files.add(anotherWord);
        Execl execl=new Execl();
        execl.rows=10;
        execl.columnls=5;
        execl.name="home work2";
        word.path="C:\\Users\\This User\\Desktop\\פרויקטים\\PROJECT Python";
        execl.size="a5";
        word.content=s;
        files.add(execl);
        cloneAndCompare(files, filesCopy);
        System.out.println("\n--- עכשיו נשנה את אחד ההעתקים כדי לקבל BOOO ---");
        filesCopy.get(0).name = "New Updated Name";
        if (files.get(0).equals(filesCopy.get(0))) {
            System.out.println("Still identical (yay!)");
        } else {
            System.out.println("0: But they are not identical (booo!😃😃)");
        }
    }

      private static void cloneAndCompare(List<File> files, List<File> filesCopy) {
        for (File file : files) {
            filesCopy.add(file.clone());
        }
        for (int i = 0; i < files.size(); i++) {
            if (files.get(i) != filesCopy.get(i)) {
                System.out.println(i + ": files are different objects (yay!😎😎)");
                if (files.get(i).equals(filesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!😎😎)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!😃😃)");
                }
            } else {
                System.out.println(i + ": file objects are the same (booo!😃😃)");
            }
        }
    }
}




