package br.edu.ifrs.osorio.tads.aulabanco;
import br.edu.ifrs.osorio.tads.aulabanco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import br.edu.ifrs.osorio.tads.aulabanco.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PrincipalRunner implements CommandLineRunner {

    @Autowired
    ClienteRepository cr;

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome("Robertin do grau");
        cliente.setCpf("123456789");
        cliente.setTelefone("123456789");
        cliente.setBairro("Bairro");
        cliente.setCidade("Bairro");
        cliente.setUf("RS");
        cliente.setEndereco("Qualquer um");
        cliente.setCep("123123212312");

        cr.save(cliente);

        Optional<Cliente> c;
        c = cr.findById(1);
        System.out.println("Nome: " + c.get().getNome());
    }


}