package br.com.dependency_injection.services.envMgmnt;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("fauxService")
public class QAFauxService implements FauxService {
    @Override
    public String getEnv() {
        return "qa";
    }
}
