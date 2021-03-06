package multiThread.chap04MT.balking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BalkingData {
    private final String fileName;
    private String content;
    private boolean changed;

    public BalkingData(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
        this.changed = true;
    }

    public synchronized void change(String newContent) {
        this.content = newContent;
        this.changed = true;
    }//change()

    public synchronized void save() throws IOException {
        if(changed) {
            doSave();
            changed = false;
        } else {
            System.out.println("<< Balking return >>");
            return;
        }
    }//save()

//    //====== 練習問題 4-2 (2) ======
//    //synchronized を外し、無駄な書き込みが起こることを確認。
//    public void save() throws IOException, InterruptedException {
//        if(changed) {
//            Thread.sleep(1000);
//            doSave();
//            changed = false;
//        } else {
//            System.out.println("<< Balking return >>");
//            return;
//        }
//    }//save()

    private void doSave() {
        System.out.println(Thread.currentThread().getName()
            + " calls doSave(), content = " + content);

        try(var writer = Files.newBufferedWriter(
                Paths.get(fileName), StandardOpenOption.APPEND)){
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//doSave()

}//class
