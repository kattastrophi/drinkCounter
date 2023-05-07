import javax.swing.JButton;
import javax.swing.JFileChooser;

public class FileSaveLocation {
    public static String Directory(){
        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("user.home"));
        fc.setDialogTitle("Select a location to save");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){
            //
        }
        return fc.getSelectedFile().getAbsolutePath();
    }
}
