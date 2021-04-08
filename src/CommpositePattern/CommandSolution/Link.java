package CommpositePattern.CommandSolution;


public class Link implements Data{

    private String name;
    private String url;

    public Link(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("The url for the link " + name + " is " + url);
    }

    @Override
    public int computeSize() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
