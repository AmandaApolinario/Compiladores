import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



public class Main {

	public static void main(String[] args) throws IOException {
		// Cria um CharStream que lê os caracteres de stdin.
		CharStream input = CharStreams.fromStream(System.in);

		// Cria um lexer que consome a entrada do CharStream.
		golangramLexer lexer = new golangramLexer(input);

		// Cria um buffer de tokens vindos do lexer.
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// Cria um parser que consome os tokens do buffer.
		golangramParser parser = new golangramParser(tokens);

		// Começa o processo de parsing na regra 'line'.
		ParseTree tree = parser.begin();

		if (parser.getNumberOfSyntaxErrors() != 0) {
			// Houve algum erro sintático. Termina a compilação aqui.
			return;
		}

		Visitor visitor = new Visitor();
		visitor.visit(tree);

		// Saída final.
		//System.out.println("Result = " + visitor.strTable);
		System.out.println(visitor.funcTable.toString());
}

}
