package com.techsharezone.bootify.kafka.model;

/*
 * @created 03/02/2021 -23:52
 * @project bootify-kafka
 * @author  saurabhshcs
 */

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class User {

    @Id
    @NotNull
    private long userId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

}
