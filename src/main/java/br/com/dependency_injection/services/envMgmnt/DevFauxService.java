package br.com.dependency_injection.services.envMgmnt;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("fauxService")
public class DevFauxService implements FauxService{

    @Override
    public String getEnv() {
        return "dev";
    }
}
