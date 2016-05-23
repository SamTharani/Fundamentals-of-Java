import java.io.File;
import java.io.FileReader;

public class CreateExceptions {

    public void forFileNotFound(){
        File file = new File("Documents/fileNotFound.txt");
        FileReader fr = new FileReader(file);
    }
	
	public static void main(String args[]){
		CreateExceptions ce = new CreateExceptions();
		ce.forFileNotFound();
	}
}
