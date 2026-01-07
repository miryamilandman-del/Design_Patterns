import java.util.Objects;

public class Word extends File {
 public  int numOfPages;
 public boolean isAlong;
 public Word(){

 }
 public Word(Word word){
     super(word);
     if(word!=null){
         this.isAlong=word.isAlong;
         this.numOfPages=word.numOfPages;
     }
 }

    @Override
    public File clone() {
       return new Word(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Word word = (Word) o;
        return numOfPages == word.numOfPages && isAlong == word.isAlong;
    }


}


