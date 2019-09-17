package com.revature.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Album {
	
	private int numOfTracks;
	
	private String genre;
	
	private String producer;
	
	private Track tracks;
	
	@Id
	private String albumName;

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(int numOfTracks, String genre, String producer, Track tracks, String albumName) {
		super();
		this.numOfTracks = numOfTracks;
		this.genre = genre;
		this.producer = producer;
		this.tracks = tracks;
		this.albumName = albumName;
	}

	@Override
	public String toString() {
		return "Album [numOfTracks=" + numOfTracks + ", genre=" + genre + ", producer=" + producer + ", tracks="
				+ tracks + ", albumName=" + albumName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albumName == null) ? 0 : albumName.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + numOfTracks;
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		result = prime * result + ((tracks == null) ? 0 : tracks.hashCode());
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
		Album other = (Album) obj;
		if (albumName == null) {
			if (other.albumName != null)
				return false;
		} else if (!albumName.equals(other.albumName))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (numOfTracks != other.numOfTracks)
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		if (tracks == null) {
			if (other.tracks != null)
				return false;
		} else if (!tracks.equals(other.tracks))
			return false;
		return true;
	}

	public int getNumOfTracks() {
		return numOfTracks;
	}

	public void setNumOfTracks(int numOfTracks) {
		this.numOfTracks = numOfTracks;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Track getTracks() {
		return tracks;
	}

	public void setTracks(Track tracks) {
		this.tracks = tracks;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	
	

}
