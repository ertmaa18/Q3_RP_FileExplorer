package at.kaindorf.ahif18.q3_rp_fileexplorer.database;

import at.kaindorf.ahif18.q3_rp_fileexplorer.pojos.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
