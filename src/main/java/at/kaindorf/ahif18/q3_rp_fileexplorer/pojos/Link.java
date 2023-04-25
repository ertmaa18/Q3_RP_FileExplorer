package at.kaindorf.ahif18.q3_rp_fileexplorer.pojos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LINK")
public class Link extends FileObject {
    private String source;
}
