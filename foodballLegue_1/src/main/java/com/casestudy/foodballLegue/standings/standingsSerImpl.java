package com.casestudy.foodballLegue.standings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class standingsSerImpl  implements StandingsSer{
	
	@Autowired
	private StandingRepo standingRepo;
	
	@Override
	public List<Standings> getStandingsByLeagueId(Integer id) {
		
		List<Standings> standingList = new ArrayList<Standings>();
		standingRepo.findById(id).stream().forEach((standing)-> {
			standingList.add(standing);
		 });
		return standingList;
	}

	@Override
	public void addStandings(Standings standings) {
		// TODO Auto-generated method stub
		standingRepo.save(standings);
	}

}
