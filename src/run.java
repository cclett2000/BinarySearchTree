/*
Charles Lett Jr.
November 26, 2021
Desc: binary search tree implementation
    - Link: https://www.softwaretestinghelp.com/binary-search-tree-in-java/
*/
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.text.DecimalFormat;

public class run {
    public static void main (String[] args) throws IOException {
        boolean EE = false;

        long runtime_start = System.currentTimeMillis();

        // sample file to use (testing)
        // valid names: 'sample_9.txt', 'sample_500.txt', 'sample_662978.txt'
        // 'sample_662978.txt' - welp, any display prior to this file's values is obliterated
        String samp_file = "sample_500.txt";

        // create BST object
        BST tree = new BST();

        if(EE){
            tree.EE();
            System.exit(42069);
        }

        // file handler
        System.out.print("Running File Handler...");
            BufferedReader reader = Files.newBufferedReader(Paths.get(samp_file));
            String line;
        System.out.print("\nDone.\n");

        // add items to BST and show data before BST sort
        int data_count = 0;
        System.out.print("\nData Before BST Sort \n\t> ");
            while((line = reader.readLine()) != null){
                System.out.print(line + " ");
                tree.insert(Integer.parseInt(line));
                data_count += 1;
            }

        // BST stuph
        // show sorted data
        System.out.print("\nTree Inorder Traversal - Sorted Data\n\t> ");
        tree.sort(); // display tree structure? (inorder?)
                        // this display is...functional, but makes no sense to me
                        // wait it shows the sorted data? Neat

        // if other tests are needed (delete, search) refer to link, should be pretty simple from here
        DecimalFormat f = new DecimalFormat("#.00");
        long end_runtime = System.currentTimeMillis();
        double used_mem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.print("\n\n>>> Number of Values: " + data_count);
        System.out.print("\n>>> Runtime: " + (end_runtime - runtime_start) + "ms");
        System.out.print("\n>>> Memory used: " + f.format(used_mem/Math.pow(10, 6)) + " MB");
    }
}
