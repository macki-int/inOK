package pl.trollsystems.inOK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.trollsystems.inOK.repository.InstallationPlaceRepository;

@RestController
@RequestMapping("/installation-place")
public class InstallationPlaceController {
    private InstallationPlaceRepository installationPlaceRepository;

    @Autowired
    public InstallationPlaceController(InstallationPlaceRepository installationPlaceRepository) {
        this.installationPlaceRepository = installationPlaceRepository;
    }

    
}
