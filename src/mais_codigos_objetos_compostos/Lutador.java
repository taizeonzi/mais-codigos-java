package mais_codigos_objetos_compostos;

public class Lutador {
	//atributos
	private String nome; /*privado pois estamos aplicando o conceito de encapsulamento*/
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	//métodos principais (públicos)
	public void apresentar() {
		System.out.println("-----------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.altura);
		System.out.println("pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas e");
		System.out.println(this.getEmpates() + " empates!");
	}
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		// this.vitorias = this.vitorias + 1; PODERIA FAZER DESTA FORMA
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);		
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	//construtor
	public Lutador(String no, String na, int id, float al,
			float pe, int vi, int de, int em) {
		this.nome = no; /*poderia fazer: nome = no, já que são caracteres diferentes*/
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);/*assim,quando chamo o setPeso, vai configurar o peso lá no método void,
		após chamará o setCategoria, fazendo a análise da categoria que ele pertence */
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	//getters e setters(métodos especiais)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(); /*categoria não vai ser usado de fora, apenas como método interno*/
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() { /*categoria não vai ser usado de fora, apenas como método interno*/
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
}
	