package com.entities;

public class Film {
	private int film_id;
	private String title;
	private String desc;
	private long language;
	private String language_name;

	public String getLanguage_name() {
		return language_name;
	}

	public void setLanguage_name(String language_name) {
		this.language_name = language_name;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public long getLanguage() {
		return language;
	}

	public void setLanguage(long language) {
		this.language = language;
	}

	
}
