package at.kaindorf.ahif18.q3_rp_fileexplorer.pojos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue("FILE")
public class FileItem extends FileObject{
    private Long size;
}
