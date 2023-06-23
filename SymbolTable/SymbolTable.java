package SymbolTable;


import java.util.*;

public class SymbolTable {
    private Map<String, List<MyIdentifier>> table;

    public SymbolTable() {
        table = new HashMap<>();
    }

    public void insert(MyIdentifier id) {
        String name = id.getName();
        if (!table.containsKey(name)) {

            table.put(name, new ArrayList<>());
        }
        table.get(name).add(id);
    }

    public MyIdentifier lookup(String name) {
        if (table.containsKey(name)) {
            List<MyIdentifier> ids = table.get(name);
            return ids.get(ids.size() - 1);
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String name : table.keySet()) {
            sb.append(name).append(": ");
            List<MyIdentifier> ids = table.get(name);
            for (MyIdentifier id : ids) {
                sb.append(id).append(", ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
