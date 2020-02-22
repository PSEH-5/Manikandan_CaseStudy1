package com.casestudy.foodballLegue.standings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StandingsCtrl {
	
	@Autowired
	private StandingsSer standingsSer;
	
	@RequestMapping("/get_standings/{leagueId}")
	public List<Standings> getStandings(@PathVariable Integer leagueId) {
		return standingsSer.getStandingsByLeagueId(leagueId);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/add_standings")
	public void getStandings(@RequestBody Standings standings) {
		 standingsSer.addStandings(standings);
		
	}

}
