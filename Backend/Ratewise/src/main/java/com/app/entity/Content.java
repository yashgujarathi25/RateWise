package com.app.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "content")
//@NoArgsConstructor 
//@Getter 
//@Setter
//@ToString
//@AllArgsConstructor
public class Content extends BaseEntity{

	@Column
	@Enumerated(EnumType.STRING)
	private ContentType type;
	@Column(length = 50)
	private String name;
	@Column(length = 500)
	private String posterLink;
	@Column(length = 30)
	private Double length;
	@Column
	private String genre;
	
	@OneToMany(mappedBy = "content", orphanRemoval = true, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Review> reviews;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "content_artist",
	joinColumns = {@JoinColumn(name = "content_id" )},
	inverseJoinColumns = {@JoinColumn(name = "artist_id")})
	private Set<Artist> artists;
	
	
	public Content() {
		// TODO Auto-generated constructor stub
	}


	public Content(ContentType type, String name, String posterLink, Double length, String genre) {
		super();
		this.type = type;
		this.name = name;
		this.posterLink = posterLink;
		this.length = length;
		this.genre = genre;
	}


	public ContentType getType() {
		return type;
	}


	public void setType(ContentType type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPosterLink() {
		return posterLink;
	}


	public void setPosterLink(String posterLink) {
		this.posterLink = posterLink;
	}


	public Double getLength() {
		return length;
	}


	public void setLength(Double length) {
		this.length = length;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Review> getReviews() {
		return reviews;
	}


	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}


	public Set<Artist> getArtists() {
		return artists;
	}


	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	
	
	
}
