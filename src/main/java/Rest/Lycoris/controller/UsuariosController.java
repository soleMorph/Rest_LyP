package Rest.Lycoris.controller;

import Rest.Lycoris.DAO.IUsuarios;
import Rest.Lycoris.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/Usuarios")
public class UsuariosController {

    @Autowired
    private IUsuarios dao;//O Autowired faz uma injeção automática dos métodos do Crudrepository através do dao

    @GetMapping//Mapeia as requisições HTTP GET para este método.
    public List<Usuarios> listaUsuarios(){//Método que retorna uma lista de todos os usuários Usa o método findAll() do repositório dao
        return (List<Usuarios>) dao.findAll();
    }

    @PostMapping
    public Usuarios criarUsuario(@RequestBody Usuarios usuario){
        return dao.save(usuario);
    }

    @PutMapping
    public Usuarios editarUsuario(@RequestBody Usuarios usuario){
        Usuarios usuarioNovo;
        usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @DeleteMapping("/{u_id}")
    public Optional<Usuarios> deletarUsuario(@PathVariable Long u_id){
        Optional<Usuarios> usuario=dao.findById(u_id);
        dao.deleteById(u_id);
        return usuario;
    }

}
