package Rest.Lycoris.model;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")//acho que é intuitivo
public class Usuarios {

    @Id //usado para informar a chave primaria
    @GeneratedValue(strategy= GenerationType.IDENTITY)//O provedor de persistência escolhe automaticamente a estratégia de geração de chave mais apropriada. Geralmente, isso pode ser uma sequência, tabela de identidade, ou outro mecanismo, dependendo do banco de dados subjacente.
    @Column(name="u_id")
    private Integer u_id;
    @Column(name="u_name", length=200, nullable = true)
    private String u_name;
    @Column(name="u_email", length=80, nullable = true)
    private String u_email;
    @Column(name="u_user", length=20)
    private String u_user;
    @Column(name="u_password", length=20)
    private String u_password;
    @Column(name="u_phone", length=11)
    private String u_phone;

    public Integer getU_id() {return u_id;}

    public void setU_id(Integer u_id) { this.u_id = u_id;}

    public String getU_name() {return u_name;}

    public void setU_name(String u_name) {this.u_name = u_name;}

    public String getU_email() {return u_email;}

    public void setU_email(String u_email) {this.u_email = u_email;}

    public String getU_phone() {return u_phone;}

    public void setU_phone(String u_phone) {this.u_phone = u_phone;}

    public String getU_user() {return u_user;}

    public void setU_user(String u_user) {this.u_user = u_user;}

    public String getU_password() {return u_password;}

    public void setU_assword(String password) {this.u_password = password;}
}
