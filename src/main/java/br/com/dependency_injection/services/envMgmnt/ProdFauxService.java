package br.com.dependency_injection.services.envMgmnt;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("fauxService")
public class ProdFauxService implements FauxService{
    @Override
    public String getEnv() {
        return "prod";
    }
}
