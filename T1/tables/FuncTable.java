package tables;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public final class FuncTable {
    VarTable varTable = new VarTable();

	// No mundo real isto certamente deveria ser um hash...
	// Implementação da classe não é exatamente Javanesca porque
	// tentei deixar o mais parecido possível com a original em C.
	private List<Entry> table = new ArrayList<Entry>();

	public int lookupVar(String s) {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).name.equals(s)) {
				return i;
			}
		}
		return -1;
	}

	public int addVar(String s, int line, int numParams) {
		Entry entry = new Entry(s, line, numParams);
		int idxAdded = table.size();
		table.add(entry);
		return idxAdded;
	}

	public String getName(int i) {
		return table.get(i).name;
	}

	public int getLine(int i) {
		return table.get(i).line;
	}

	public int getNumParams(int i) {
		return table.get(i).numParams;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Formatter f = new Formatter(sb);
		f.format("Variables table:\n");
		for (int i = 0; i < table.size(); i++) {
			f.format("Entry %d -- name: %s, line: %d, numParams: %d\n", i,
	                 getName(i), getLine(i), getNumParams(i));
		}
		f.close();
		return sb.toString();
	}

	private static final class Entry {
		final String name;
		final int line;
		final int numParams;
        VarTable varTable;


		Entry(String name, int line, int numParams, VarTable varTable) {
			this.name = name;
			this.line = line;
			this.numParams = numParams; 
            this.varTable = varTable;
		}
	}
}
