package exc2;

public class File implements FileSystemComponent{
    private String type;
    private int size;

    public File(String type, int size) {
        this.type = type;
        this.size = size;
    }
    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
