package at.kaindorf.ahif18.q3_rp_fileexplorer.database;

import at.kaindorf.ahif18.q3_rp_fileexplorer.pojos.FileItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileItemRepository extends JpaRepository<FileItem, Long> {
}
