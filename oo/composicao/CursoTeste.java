package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Alciliano");
		Aluno aluno2 = new Aluno("Mirin");
		Aluno aluno3 = new Aluno("João");
		
		Curso curso1 = new Curso("Java e Orientção a objetos");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("Libras");
		
		// construindo os relacionamentos
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		// pegando todos os alunos do curso 1
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no " + curso1.nome + " e me chamo " + aluno.nome);
		}
		System.out.println();

	}

}
