package ru.itis.hackaton.models;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Data
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer inspirationPoints;
    private Integer timePoints;
    private Integer knowledgePoints;
    private String name;
}