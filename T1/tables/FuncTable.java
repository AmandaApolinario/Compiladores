package tables;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import typing.Type;

public final class FuncTable {
    private List<FunctionEntry> table = new ArrayList<>();
	Type type;

    public int containsFunction(String functionName) {
        for (FunctionEntry entry : table) {
            if (entry.name.equals(functionName)) {
                return 1;
            }
        }
        return -1;
    }

	private FunctionEntry getFunction(String functionName) {
		for (FunctionEntry entry : table) {
			if (entry.name.equals(functionName)) {
				return entry;
			}
		}
		return null;
	}

    public void addFunction(String functionName, VarTable varTable) {
        FunctionEntry entry = new FunctionEntry(functionName, varTable);
        table.add(entry);
    }
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb);
        f.format("Functions table:\n" );
        for (int i = 0; i < table.size(); i++) {
            FunctionEntry entry = table.get(i);
            f.format("Entry %d -- name: %s\n", i, entry.name);
			System.out.println(entry.varTable.toString(entry.name));
		}
        f.close();
        return sb.toString();
    }

    private static class FunctionEntry {
        private final String name;

	   	VarTable varTable;

        FunctionEntry(String name, VarTable varTable) {
            this.name = name;
			this.varTable = varTable;
        }
    }
}
