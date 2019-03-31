package org.peimari.starttimeselector.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Competition extends AbstractEntity {
    
    private String name;
    private LocalDateTime start;
    private LocalDateTime end;
    private boolean open;
    private int startIntervalSeconds = 60;
    
    @OneToMany(mappedBy="competition", cascade = CascadeType.ALL)
    private List<SeriesGroup> seriesGroups;
}
