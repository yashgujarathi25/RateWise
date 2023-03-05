package com.app.dto;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import com.app.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Table(name = "comment")
public class CommentDto extends BaseEntity{
	
	@Column(length = 100)
	private String text;

	@UpdateTimestamp
	private LocalDateTime timestamp;

	
    public CommentDto() {
		// TODO Auto-generated constructor stub
	}

	public CommentDto(String text, LocalDateTime timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Comment [text=" + text + ", timestamp=" + timestamp +" ]";
	}
    
    
	
}
