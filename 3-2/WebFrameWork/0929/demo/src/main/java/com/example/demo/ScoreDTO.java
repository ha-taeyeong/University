package com.example.demo;

public class ScoreDTO {
    private String name;
    private Double score1;
    private Double score2;
    private Double score3;
    
    public ScoreDTO() {}
	
	public ScoreDTO(String name, Double score1, Double score2, Double score3) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Double getScore1() {return score1;}
	public void setScore1(Double score1) {this.score1 = score1;}
	public Double getScore2() {return score2;}
	public void setScore2(Double score2) {this.score2 = score2;}
	public Double getScore3() {return score3;}
	public void setScore3(Double score3) {this.score3 = score3;}
    
}
