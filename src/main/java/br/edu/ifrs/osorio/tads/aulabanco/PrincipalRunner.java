package br.edu.ifrs.osorio.tads.aulabanco;
import br.edu.ifrs.osorio.tads.aulabanco.model.Endereco;
import br.edu.ifrs.osorio.tads.aulabanco.repository.ClienteRepository;
import br.edu.ifrs.osorio.tads.aulabanco.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import br.edu.ifrs.osorio.tads.aulabanco.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PrincipalRunner implements CommandLineRunner {

    @Autowired
    ClienteRepository cr;
    @Autowired
    EnderecoRepository err;  //para teste, deve-se retirar o cascade do endereco la no cliente. E entao
    // criar um endereco, instanciar e salvá-lo antes de salvar o cliente

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente = new Cliente();
        Endereco end = new Endereco();

        cliente.setNome("Robertin do grau");
        cliente.setCpf("123456789");
        cliente.setTelefone("123456789");


        end.setNumero(401);
        end.setBairro("Bairro");
        end.setCidade("Bairro");
        end.setUf("RS");
        end.setLogradouro("Qualquer um");
        end.setCep("123123212312");

        cliente.setEndereco(end);

        cr.save(cliente);

        Optional<Cliente> c;
        c = cr.findById(1);
        System.out.println("Nome: " + c.get().getNome());
    }


}