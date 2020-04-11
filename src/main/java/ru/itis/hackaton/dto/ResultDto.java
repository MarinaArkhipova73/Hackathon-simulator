package ru.itis.hackaton.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultDto implements Serializable {
    private String text;
    private Integer inspirationPoints;
    private Integer timePoints;
    private Integer knowledgePoints;
}
