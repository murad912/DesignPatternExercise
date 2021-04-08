package CommpositePattern.CommandSolution;

public class File implements Data{

    private String name;
    private int sizeInBytes;

    public File(String name, int sizeInBytes) {

        this.name = name;
        this.sizeInBytes = sizeInBytes;

    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public int computeSize(){
        return getSizeInBytes();
    }

    @Override
    public void print() {
        System.out.println("--- file "+name+" size= "+getSizeInBytes()+" bytes");
    }
}
