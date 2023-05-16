package tables;

import java.util.ArrayList;
import java.util.Formatter;

@SuppressWarnings("serial")
public final class StrTable extends ArrayList<String>{
    // No mundo real isto certamente deveria ser um hash...

    @Override
    public boolean add(String s) {
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).equals(s)) {
				return false;
			}
		}
		return super.add(s);
	}

	public String toString(String funcName) {
		StringBuilder sb = new StringBuilder();
		Formatter f = new Formatter(sb);
		f.format("Strings table: %s\n", funcName);
		for (int i = 0; i < this.size(); i++) {
			f.format("Entry %d -- %s\n", i, this.get(i));
		}
		f.close();
		return sb.toString();
	}

	public StrTable copy() {
        StrTable copiedTable = new StrTable();
        copiedTable.addAll(this);
        return copiedTable;
    }
}
