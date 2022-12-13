package org.hibernate.OneToMany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "qID")
    private int qId;

    @Column(name = "question")
    private String question;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getId() {
        return qId;
    }

    public void setId(int qId) {
        this.qId = qId;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }



}
