package info.amsa.b;

import java.io.FileInputStream;
import java.util.function.Consumer;

import lombok.Data;

@Data
public class LibB {
    private final String field1;
    private final String field2;

    public void doJava11() {
        var f = this.field1;
        System.out.println(f);

        Consumer<String> printer = (var s) -> System.out.println(s);

        FileInputStream i;
        try {
            i = new FileInputStream("f.txt");
            try (i) {
                int b = i.read();
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        catch (java.io.FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
