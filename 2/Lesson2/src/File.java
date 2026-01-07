import java.util.Arrays;
import java.util.Objects;

public abstract class File {
    protected String name;
    protected  String path;
    protected  String size;
    protected  String[] content;

    public File() {
    }

    public File(File file) {
        if (file != null) {
            this.name = file.name;
            this.path = file.path;
            this.size = file.size;


            if (file.content != null) {
                this.content = new String[file.content.length];
                for (int i = 0; i < file.content.length; i++) {
                    this.content[i] = file.content[i];
                }
            } else {
                this.content = null;
            }
        }
    }

    public abstract File clone();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(name, file.name) && Objects.equals(path, file.path) && Objects.equals(size, file.size) && Objects.deepEquals(content, file.content);
    }

}
