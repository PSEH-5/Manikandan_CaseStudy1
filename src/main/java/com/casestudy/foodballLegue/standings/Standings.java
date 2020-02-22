package com.casestudy.foodballLegue.standings;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Standings {
	public Standings() {
		// TODO Auto-generated constructor stub
	}	


	
	public Standings(Integer leagueId, String leagueName, Integer countryId, String countryName, Integer teamId,
			String teamName, Integer overAllLeaguePosition) {
		super();
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		this.countryId = countryId;
		this.countryName = countryName;
		this.teamId = teamId;
		this.teamName = teamName;
		this.overAllLeaguePosition = overAllLeaguePosition;
	}



	@Id
	private Integer leagueId;
	private String leagueName;
	private Integer countryId;
	private String countryName;
	private Integer teamId;
	private String teamName;
	private Integer overAllLeaguePosition;
	
	
	
	public Integer getTeamId() {
		return teamId;
	}



	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}



	public Integer getCountryId() {
		return countryId;
	}



	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}



	public String getCountryName() {
		return countryName;
	}



	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	public Integer getLeagueId() {
		return leagueId;
	}



	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}



	public String getLeagueName() {
		return leagueName;
	}



	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}



	public Integer getOverAllLeaguePosition() {
		return overAllLeaguePosition;
	}



	public void setOverAllLeaguePosition(Integer overAllLeaguePosition) {
		this.overAllLeaguePosition = overAllLeaguePosition;
	}

	

	@Override
	public String toString() {
		return "Standings [countryId=" + countryId + ", countryName=" + countryName + ", leagueId=" + leagueId
				+ ", leagueName=" + leagueName + ", teamId=" + teamId + ", teamName=" + teamName
				+ ", overAllLeaguePosition=" + overAllLeaguePosition + "]";
	}
	
	
	
}
