package exc2;
import java.util.ArrayList;
import java.util.List;
public class Folder implements FileSystemComponent{
    private String type = "Folder";
    private List<FileSystemComponent> components = new ArrayList<>();

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
