package com.swjtuhc.demo.model;

public class Summary {
	private int summary_Id;
	@Override
	public String toString() {
		return "Summary [summary_Id=" + summary_Id + ", summary=" + summary + "]";
	}
	public int getSummary_Id() {
		return summary_Id;
	}
	public void setSummary_Id(int summary_Id) {
		this.summary_Id = summary_Id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	private String summary;
}
