

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.starwars.File;
import com.starwars.Folder;



public class FilesystemTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void file_simple()
    {
        File file1 = new File("File 1");
      
        assertNotNull(file1);
        assertEquals("File 1", file1.getName());
        
    }

    @Test
    public void file_with_empty_name_should_generate_error()
    {
        //JUnit4
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Name is invalid.");

        File file1 = new File("");

        //JUnit5
        //Exception exception = assertT(NumberFormatException.class, () -> {
        //     File file1 = new File("");
        //});
       
      
        
    }


    @Test
    public void folder_simple()
    {
        Folder folder = new Folder("Folder 1");
      
        assertNotNull(folder);
        assertEquals("Folder 1", folder.getName());
         assertEquals(0, folder.count());
    }


    @Test
    public void folder_count_one_item()
    {
        Folder folder1 = new Folder("Folder 1");

        File file1 = new File("File 1");

        folder1.add(file1);
      
        assertNotNull(folder1);
        assertEquals("Folder 1", folder1.getName());
         assertEquals(1, folder1.count());
    }


    @Test
    public void folder_count_two_items()
    {
        Folder folder1 = new Folder("Folder 1");

        File file1 = new File("File 1");
        File file2 = new File("File 2");
        
        folder1.add(file1);
        folder1.add(file2);

        assertNotNull(folder1);
        assertEquals("Folder 1", folder1.getName());
         assertEquals(2, folder1.count());
    }

    @Test
    public void folder_count_tree_items()
    {
        Folder folder1 = new Folder("Folder 1");
        File file1 = new File("File 1");

        folder1.add(file1);

        Folder folder2 = new Folder("Folder 2");
        File file2 = new File("File 2");

        folder2.add(file2);

        assertNotNull(folder1);
        assertEquals("Folder 1", folder1.getName());
        assertEquals(1, folder1.count());
        assertEquals(1, folder2.count());
    }
     
}
