package tutorial7.service;

import java.util.Optional;

import tutorial7.model.PilotModel;

/**
 * PilotService
 */
public interface PilotService {
    Optional<PilotModel> getPilotDetailByLicenseNumber(String licenseNumber);

    PilotModel addPilot(PilotModel pilot);

    void deletePilotByLicenseNumber(String licenseNumber);

    Optional<PilotModel> getPilotDetailById(long id);

	String updatePilot(long pilotId, PilotModel pilot);
}