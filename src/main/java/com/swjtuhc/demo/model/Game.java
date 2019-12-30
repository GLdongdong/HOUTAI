package com.swjtuhc.demo.model;

public class Game {
    private int gId;
    private String gameName;
    private String address;
    private String summary;
    private String poster;
    private String skill;
    private String video;
    public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	@Override
	public String toString() {
		return "Game [gId=" + gId + ", gameName=" + gameName + ", address=" + address + ", summary=" + summary
				+ ", poster=" + poster + ", skill=" + skill + ", video=" + video + "]";
	}
	
}
