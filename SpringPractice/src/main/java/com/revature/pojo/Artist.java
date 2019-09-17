package com.revature.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Artist {
	
	private Album albums;
	
	@Id
	private String artistName;
	
	private String recordLabel;
	
	private String tour;
	
	private int yearsActive;

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(Album albums, String artistName, String recordLabel, String tour, int yearsActive) {
		super();
		this.albums = albums;
		this.artistName = artistName;
		this.recordLabel = recordLabel;
		this.tour = tour;
		this.yearsActive = yearsActive;
	}

	@Override
	public String toString() {
		return "Artist [albums=" + albums + ", artistName=" + artistName + ", recordLabel=" + recordLabel + ", tour="
				+ tour + ", yearsActive=" + yearsActive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albums == null) ? 0 : albums.hashCode());
		result = prime * result + ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result + ((recordLabel == null) ? 0 : recordLabel.hashCode());
		result = prime * result + ((tour == null) ? 0 : tour.hashCode());
		result = prime * result + yearsActive;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		if (albums == null) {
			if (other.albums != null)
				return false;
		} else if (!albums.equals(other.albums))
			return false;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (recordLabel == null) {
			if (other.recordLabel != null)
				return false;
		} else if (!recordLabel.equals(other.recordLabel))
			return false;
		if (tour == null) {
			if (other.tour != null)
				return false;
		} else if (!tour.equals(other.tour))
			return false;
		if (yearsActive != other.yearsActive)
			return false;
		return true;
	}

	public Album getAlbums() {
		return albums;
	}

	public void setAlbums(Album albums) {
		this.albums = albums;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}

	public String getTour() {
		return tour;
	}

	public void setTour(String tour) {
		this.tour = tour;
	}

	public int getYearsActive() {
		return yearsActive;
	}

	public void setYearsActive(int yearsActive) {
		this.yearsActive = yearsActive;
	}
	
	

}
