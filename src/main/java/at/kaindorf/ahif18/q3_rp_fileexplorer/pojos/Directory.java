package at.kaindorf.ahif18.q3_rp_fileexplorer.pojos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@DiscriminatorValue("DIR")
@Getter
@Setter
public class Directory extends FileObject {
    @OneToMany(mappedBy = "parent", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<FileObject> content;
}
