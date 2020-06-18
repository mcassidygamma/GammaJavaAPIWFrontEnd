package uk.co.gamma.demo.openweather;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("forecast")
@Produces(MediaType.APPLICATION_JSON)
public interface OepnWeatherForecastResource
{
	/**
	 * Gets the forecast for a given city
	 * 
	 * @param cityName
	 *            The name of the city
	 * @param apiKey
	 *            The API key
	 * @return The forcast
	 */
	@GET
	Map<String, Object> getDailyForecast(@QueryParam("q") String cityName, @QueryParam("appid") String apiKey);
}
