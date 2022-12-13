package org.hibernate.OneToMany.entity;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Column(name = "answer")
    private String answer;
    @Id
    @Column(name = "aId")
    private int aId;

    @ManyToOne
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }



    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }






}
