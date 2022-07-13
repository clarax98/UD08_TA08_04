package Serie;

public class Serie {
	private String titulo = "";
	private int temporada = 3;
	private boolean entregado = false;
	private String genero = "Accion";
	private String creador = "";
	
	public Serie() {
		// TODO Auto-generated constructor stub
		
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int temporada, String generoString, String creador) {
		super();
		this.titulo = titulo;
		this.temporada = temporada;
		this.genero = generoString;
		this.creador = creador;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the temporada
	 */
	public int getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	/**
	 * @return the entregado
	 */
	public boolean isEntregado() {
		return entregado;
	}

	/**
	 * @param entregado the entregado to set
	 */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	/**
	 * @return the generoString
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param generoString the generoString to set
	 */
	public void setGenero(String generoString) {
		this.genero = generoString;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporada=" + temporada + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	

}
