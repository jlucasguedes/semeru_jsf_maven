package br.com.semeru.model.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "endereco")
public class Endereco implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column (name = "idEndereco", nullable = false)
    private Integer idEndereco;
    @Column (name = "bairro", length = 80)
    private String bairro;
    @Column (name = "nomeLogradouro", length = 90)
    private String nomeLogradouro;
    @Column (name = "cep", length = 9)
    private String cep;
    @Column (name = "numero", length = 6)
    private String numero;
    @Column (name = "complemento", length = 20)
    private String complemento;
    
    
}
