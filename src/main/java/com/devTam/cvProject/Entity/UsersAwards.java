package com.devTam.cvProject.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity()
@Table(name = "users_awards")
public class UsersAwards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public UsersAwards(Users users, Award awards) {
        this.users = users;
        this.awards = awards;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    Users users;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "award_id")
    Award awards;
}
