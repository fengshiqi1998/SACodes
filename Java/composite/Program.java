package composite;

public class Program {
    public static void main(String[] args) {
        Files rootFiles = new Files("根目录root");
        rootFiles.Add(new Doc("根目录下的文件A"));
        rootFiles.Add(new Doc("根目录下的文件B"));

        Files comp = new Files("根目录下的文件夹FA");
        comp.Add(new Doc("文件夹FA下的文件AA"));
        comp.Add(new Doc("文件夹FA下的文件AB"));

        rootFiles.Add(comp);

        Files comp2 = new Files("根目录下的文件夹FAX");
        comp2.Add(new Doc("文件夹FAX下的文件AXA"));
        comp2.Add(new Doc("文件夹FAX下的文件AXB"));

        comp.Add(comp2);

        rootFiles.Add(new Doc("根目录下的文件C"));
        Doc leafD = new Doc("根目录下的文件D");
        rootFiles.Add(leafD);
        rootFiles.Remove(leafD);
        rootFiles.Display(1);
    }
}
