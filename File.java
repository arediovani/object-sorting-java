package pkg2d.array.sorting;

public class File {

    private String name;
    private String type;
    private String date;
    private int size;

    public File() {
    }

    public File(String name, String type, String date, int size) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.size = size;
    }

    @Override
    public String toString() {
        return name + "." + type + " - Date Of Creation=" + date + " - Size=" + size + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
