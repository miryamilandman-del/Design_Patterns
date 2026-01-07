import java.util.Objects;

public class Execl  extends File{
    public int rows;
    public int columnls;
    public  Execl(){

    }

    public Execl(Execl execl) {
       super(execl);
       if(execl!=null){
           this.columnls=execl.columnls;
           this.rows=execl.rows;
       }
    }



    @Override
    public File clone() {
        return new Execl(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Execl) || !super.equals(o)) return false;
        Execl execl = (Execl) o;
        return rows == execl.rows && columnls == execl.columnls;
    }


}


