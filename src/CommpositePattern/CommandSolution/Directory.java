package CommpositePattern.CommandSolution;

import java.util.ArrayList;
import java.util.Collection;

public class Directory implements Data{

    protected String name;
    protected Collection<Data> dirList = new ArrayList<Data>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("-- dir "+name+" size="+ computeSize()+" bytes");

        for (Data dir : dirList){

            dir.print();
        }

    }


    public int computeSize(){

        int sizeInBytes=0;
        for (Data file : dirList){
            sizeInBytes+=file.computeSize();
        }

        return sizeInBytes;
    }

    public void addData(Data file){
        dirList.add(file);
    }


}
