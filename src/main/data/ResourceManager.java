package main.data;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResourceManager {

    public static void save(Serializable data, String fileName) throws Exception {
        ObjectOutputStream OOS = null;
        try {
            OOS = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
            OOS.writeObject(data);
        } finally {
            if (OOS != null) {
                try {
                    OOS.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static Object load(String fileName) throws Exception {
        try (ObjectInputStream OIS = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            return OIS.readObject();
        }
    }
}
