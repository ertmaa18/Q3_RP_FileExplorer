package at.kaindorf.ahif18.q3_rp_fileexplorer.database;

import at.kaindorf.ahif18.q3_rp_fileexplorer.pojos.Directory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DirectoryRepository extends JpaRepository<Directory, Long> {
    Optional<Directory> getDirectoryByName(String name);
}
