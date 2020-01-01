package com.swjtuhc.demo.model;

public class Strategy {
	private String gamename;
	private String strategy;
	@Override
	public String toString() {
		return "Strategy [gamename=" + gamename + ", strategy=" + strategy + "]";
	}
	public String getGamename() {
		return gamename;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
}
