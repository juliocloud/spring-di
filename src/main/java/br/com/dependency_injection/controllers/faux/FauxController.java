package br.com.dependency_injection.controllers.faux;

import br.com.dependency_injection.services.envMgmnt.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final FauxService fauxService;

    public FauxController(@Qualifier("fauxService") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public void whichEnvImAt(){
        System.out.println(fauxService.getEnv());
    }
}
