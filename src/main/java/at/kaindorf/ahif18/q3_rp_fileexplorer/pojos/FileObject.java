package at.kaindorf.ahif18.q3_rp_fileexplorer.pojos;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class FileObject {
    @Id
    private Long id;
    private String name;
    private LocalDateTime lastModified;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @ToString.Exclude
    private Directory parent;
}
