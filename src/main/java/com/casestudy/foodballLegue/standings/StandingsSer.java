package com.casestudy.foodballLegue.standings;

import java.util.List;

public interface StandingsSer {
	public List<Standings> getStandingsByLeagueId(Integer id);

	public void addStandings(Standings standings);
}
