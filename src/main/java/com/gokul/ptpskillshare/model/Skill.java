package com.gokul.ptpskillshare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Skill {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    @NonNull
    private String skill_name;
    @NonNull
    private String category;
    @NonNull
    private String description;
}
