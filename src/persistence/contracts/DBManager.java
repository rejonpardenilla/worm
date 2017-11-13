package persistence.contracts;

import java.util.HashMap;

public interface DBManager {
    void save(String tableName,HashMap<String, String> values);
    void update();
    void create();
    void delete(String tableName,int id);
    HashMap<String, String> getObject(String tableName, int id);
    HashMap<String, String>[] getAll(String tableName);
}
