package esa.entidades;

public class Produto {
	
		private String nome;
		private Review descricao;
		private Integer codigo ;
		
		
		public Produto(String nome, int id, Review descricao) {
			this.descricao = descricao;
			this.nome = nome;
			this.codigo = id;
			
		}


		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}


		/**
		 * @param nome the nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}


		/**
		 * @return the descricao
		 */
		public Review getDescricao() {
			return descricao;
		}


		/**
		 * @param descricao the descricao to set
		 */
		public void setDescricao(Review descricao) {
			this.descricao = descricao;
		}


		/**
		 * @return the codigo
		 */
		public Integer getCodigo() {
			return codigo;
		}


		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		

}
