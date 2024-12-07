package org.example.album_service.DTO;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class SongDTO {
    private Long id;
    private String name;
    private Integer duration;

    public SongDTO(Long id, String name, Integer duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }
}

