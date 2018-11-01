package tutorial7.service;

import java.util.List;
import java.util.Optional;

import tutorial7.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);

    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);

	List<FlightModel> getAllFlight();

	void deleteById(long flightId);

	Optional<FlightModel> getFlightDetailById(long flightId);

	void updateFlight(FlightModel flight);
}