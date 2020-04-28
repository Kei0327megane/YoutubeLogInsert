package com.example.demo.repository.resources;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Getter
@Table(name="log_table")
@RequiredArgsConstructor
public class LogTableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private final String keyword;

    private final ZonedDateTime created_at;

    private final ZonedDateTime updated_at;

    public static LogTableEntity of(String keyword, ZonedDateTime now) {
        return new LogTableEntity(keyword, now, now);
    }

}
