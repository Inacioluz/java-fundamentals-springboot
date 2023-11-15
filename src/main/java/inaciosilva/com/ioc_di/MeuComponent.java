package inaciosilva.com.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {

    public String chamarMeuConponent() {
        return "Chamando meu Component";
    }
    
}
