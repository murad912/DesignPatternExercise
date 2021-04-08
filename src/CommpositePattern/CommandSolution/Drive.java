package CommpositePattern.CommandSolution;


import java.util.ArrayList;
import java.util.Collection;

public class Drive implements Data{

    protected String name;
    private Collection<Data> datas = new ArrayList<>();

    public Drive(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Data> getDatas() {
        return datas;
    }

    public void setDatas(Data datas) {
        this.datas.add(datas);
    }

    @Override
    public void print() {
        System.out.println("- drive "+ name);
        for(Data d : datas){
            d.print();
        }
    }

    public int computeSize(){
        int sizeInBytes=0;

        for(Data d : datas){
            sizeInBytes += d.computeSize();
        }
        return sizeInBytes;
    }
}
