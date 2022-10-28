package com.springboot.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Entity(name="EntityBuilder")
public class EntityBuilder {
@Id
@Column(precision = 10)
private String empid;
private String Name;
private float price;

}
