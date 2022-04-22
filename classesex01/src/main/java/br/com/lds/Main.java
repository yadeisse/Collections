package br.com.lds;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	private Scanner scanner = new Scanner(System)
	// PrivateList<Cavalo> cavalos = new ArrayList<cavalo>();
	}

	private Scanner scanner = new Scanner(System.in);

	// Estude a palavra magica STATIC (com letra minuscula (static))

	public void start() {

		// boolean emExecucao; <- isso aqui eh igual a false
		boolean emExecucao = true;

		// while(!emExecucao) { <- enquanto emExecucao == false
		while (emExecucao) {
			exibirMenu();

			int opcao = -1;
			try {
				opcao = scanner.nextInt();
			} catch (Exception e) {

				scanner.next();

				System.out.println(e.getMessage());
				System.out.println("Ocorreu um erro. Tente novamente.");
				System.out.println("-----------");

				// pula o Switch e retorna para o topo para execucao novamente - retorna para o
				// inicio do laco
				continue;
			}

			switch (opcao) {
			case 1:
				cadastrarCavalo();
				break;

			case 2:
				cadastrarGirafa();
				break;

			case 3:
				listarCavalo();
				break;

			case 4:
				listarGirafa();
				break;

			case 5:
				listarTodosAnimais();
				break;

			case 6:
				removerAnimaisPorID();
				System.out.println("Digite o ID do animal a ser removido: ");
				
				try { 
				int idDoAnimal = scanner.nextInt();
				removerAnimalPorID (idDoAnimal);
				
				break;

			case 7:
				exibirAQuantidadeDeAnimaisPorTipo();
				break;
			case 8:
				System.out.println("Saindo...");
				emExecucao = false;
				break;

			default:
				System.out.println("Opcao invalida");

				break;
			}

		}

	}

	private void exibirMenu() {
		System.out.println("1. Cadastrar cavalo");
		System.out.println("2. Cadastrar girafa");
		System.out.println("3. Listar cavalo");
		System.out.println("4. Listar girafa");
		System.out.println("5. Listar todos os animais");
		System.out.println("6. Remover animal por ID");
		System.out.println("7. Exibir a quantidade de animais por tipo");
		System.out.println("8. Sair");

		System.out.println("Sua opção: ");
	}

	private void cadastrarCavalo() {

		System.out.println("............");
		System.out.println("Digite o nome do cavalo: ");

		try {
			String nome = scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			scanner.next();
		}

	}

	private void cadastrarGirafa() {

		System.out.println("............");
		System.out.println("Digite o nome da girafa: ");

		try {

			String nome = scanner.nextLine();
			Girafa girafa = new Girafa(1, nome);
			girafas.add(girafa);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			scanner.next();

		}

	}

	private void listarCavalo() {

		System.out.println("--------");

		for (Cavalo cavalo : cavalos) {
			System.out.println("Dados do cavalo: " + cavalo.getId() + cavalo.getNome());

		}
	}

	private void listarGirafa() {
		for (Girafa girafa : girafas) {
			System.out.println("Dados da girafa: " + girafa.getId() + girafa.getNome());
		}
	}

	private void listarTodosAnimais() {

	}

	private void removerAnimaisPorID() {
		
		int indiceDaLista = -1;
		for (int 1 = 0; i <animais.size(); (i++) { 
			Animal animal = animais.get(i); 
			if(animal.getId() = idDoAnimal) {
				indiceDaLista = 1; 
				break; 
			}
		}
	}

	if(indiceDaLista==-1)

	{

		System.out.println("O animal com este item da lista, não foi encontrado");
		return;
	}

	animais.remove(indiceDaLista);System.out.println("Animal removido com sucesso.");

	}

	private void exibirAQuantidadeDeAnimaisPorTipo() {
		
		System.out.println("--------");
		
		if(animais.size() == 0) {
			System.out.println("Nenhum animal cadastrado");
			return;
		}
		
		final String chaveCavalo = "CAVALO";
		final String chaveGirafa = "GIRAFA";
		
		MapString, List <Animal>> mapaDeAnimais = new HashMap<String, List <Animal>> (); 
		
		mapaDeAnimais.put(ChaveCavalo, new ArrayList<Animal>());
		mapaDeAnimais.put(ChaveGirafa, new ArrayList<Animal>());

		for (Animal animal : animais) {
			
			if(animal instanceof Cavalo) { 
				
				List<Animal> listaDeCavalos = mapaDeAnimais.get(ChaveCavalo);
				
				listaDeCavalo.add(animal);
			}
				
			
		}else if (animal instanceof Girafa) {
			
			List<Animal> listaDeGirafas = mapaDeAnimais.get(ChaveGirafa);
			
			listaDeGirafa.add(animal);
			
		}
	}

	List<Animal> cavalos = mapaDeAnimais.get(chaveCavalo);
	List<Animal> girafas = mapaDeAnimais.get(chaveGirafa);

	System.out.prinln("Numero de cavalos:"+cavalos.size());System.out.prinln("Numero de girafas:"+girafas.size());System.out.prinln("Numero de girafas:"+girafas.size());

	for(
	Animal animal:animais)
	{ 
		
	if(animal instanceof Cavalo ) {
		
		System.out.println("Dados do cavalo: " + animal.getId() + "|" + animal.getNome());

} else if (animal instanceof Girafa) {
	System.out.println("Dados de girafa:" + animal.getId () + "|" + animal.getNome());
}

}
