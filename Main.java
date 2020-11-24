import java.util.TreeSet;
import java.util.set;

// Tree Set : já deixa ordenado´
// Árvore Rubro Negra

public class Main {

	public static void main(String[] args) {
		
		Set<Aluno> nomes = new TreeSet<>();
		nomes.add( new Aluno ("Maria","1111"));
		nomes.add( new Aluno ("Sandra","2222"));
		nomes.add( new Aluno ("Carlos","3333"));
		nomes.add( new Aluno ("Paulo","4444"));
		
		System.out.println(nomes);

	}

}
