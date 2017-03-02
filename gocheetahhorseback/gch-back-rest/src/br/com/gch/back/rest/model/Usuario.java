package br.com.gch.back.rest.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {
	
	
	@XmlElement(name="codRetorno", required=false)
    private String codRetorno;
	
	@XmlElement(name="cpf", required=true)
    private String cpf;
	
	@XmlElement(name="nome", required=false)
    private String nome;
	
	@XmlElement(name="email", required=false)
    private String email;
	
//	@XmlSchemaType(name = "dateTime")
	@XmlElement(name="dtNascimento", required=false)
    protected Date dtNascimento;
	
	@XmlElement(name="endereco", required=false)
    private String endereco; 
	
	@XmlElement(name="lat", required=false)
    private double lat;
	
	@XmlElement(name="longe", required=false)
    private double longe;
	
	@XmlElement(name="perfilAcesso", required=false)
	private String perfilAcesso;
	
	@XmlElement(name="empresa", required=false)
	private String empresa;
    
    public Usuario() {}
    
	public Usuario(String codRetorno, String cpf, String nome, String email, Date dtNascimento, String endereco, double lat,
			double longe, String perfilAcesso, String empresa) {
		
		super();
		
		this.codRetorno = codRetorno;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.lat = lat;
		this.longe = longe;
		this.perfilAcesso = perfilAcesso;
		this.empresa = empresa;
	}

	public String getCodRetorno() {
		return codRetorno;
	}

	public void setCodRetorno(String codRetorno) {
		this.codRetorno = codRetorno;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public double getLonge() {
		return longe;
	}

	public void setLonge(int longe) {
		this.longe = longe;
	}    
	
	public String getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public static class Builder{
		
	    private String codRetorno;
	    private String cpf;
	    private String nome;
	    private String email;
//	    @XmlSchemaType(name = "dateTime")
	    private Date dtNascimento;
	    private String endereco; 
	    private double lat;
	    private double longe;
	    private String perfilAcesso;
	    private String empresa;
	    
	    public Usuario build() {
	    	return new Usuario(this.codRetorno, this.cpf, this.nome, this.email , this.dtNascimento, this.endereco, this.lat, this.longe, this.perfilAcesso, this.empresa);
		}
		
	    
		public Builder comcodRetorno(String codRetorno) {
			this.codRetorno = codRetorno;
			return this;
		}
		
		public Builder comcpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
	    
		public Builder comnome(String nome) {
			this.nome = nome;
			return this;
		}
	    
		public Builder comemail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder comdtNascimento(Date dtNascimento) {
			this.dtNascimento = dtNascimento;
			return this;
		}
		
		public Builder comendereco(String endereco) {
			this.endereco = endereco;
			return this;
		}
		
		public Builder comlat(double lat) {
			this.lat = lat;
			return this;
		}
	    
		public Builder comlonge(double longe) {
			this.longe = longe;
			return this;
		}
		
		public Builder comperfilAcesso(String perfilAcesso) {
			this.perfilAcesso = perfilAcesso;
			return this;
		}
		
		public Builder comempresa(String empresa) {
			this.empresa = empresa;
			return this;
		}
	}
	
}
