package CommpositePattern.CommandSolution;


public class Application {

    public static void main(String[] args) {

        Drive cdrive = new Drive("C");
        Directory appdir = new Directory("applications");
        Directory datadir = new Directory("my data");
        Directory coursedir = new Directory("cs525");
        Data excelfile = new File("msexcel.exe", 2353256);
        Data wordfile = new File("msword.exe", 3363858);
        Data studentsfile = new File("students.doc", 34252);

        //lets add a link to our drive
        Data google = new Link("google","www.google.com");
        Data amazon = new Link("amazon","www.amazon.com");
        cdrive.setDatas(google);


        cdrive.setDatas(appdir);
        cdrive.setDatas(datadir);
        datadir.addData(coursedir);
        appdir.addData(excelfile);
        appdir.addData(wordfile);
        coursedir.addData(studentsfile);
        appdir.addData(amazon);
        cdrive.print();
    }
}
