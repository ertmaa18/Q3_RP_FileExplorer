package at.kaindorf.ahif18.q3_rp_fileexplorer.web;

import at.kaindorf.ahif18.q3_rp_fileexplorer.database.DirectoryRepository;
import at.kaindorf.ahif18.q3_rp_fileexplorer.database.FileItemRepository;
import at.kaindorf.ahif18.q3_rp_fileexplorer.database.LinkRepository;
import at.kaindorf.ahif18.q3_rp_fileexplorer.pojos.Directory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequestMapping("/explorer")
@SessionAttributes()
public class ExplorerController {
    @Autowired
    private DirectoryRepository dirRepo;
    @Autowired
    private FileItemRepository fileRepo;
    @Autowired
    private LinkRepository linkRepo;

    @GetMapping
    public ModelAndView getDirContent(Model model, @RequestParam(name="directoryName", required = false) String directoryName) {
        String path = "";
        Directory currentDir = directoryName != null ? dirRepo.getDirectoryByName(directoryName).get() :  dirRepo.getDirectoryByName("C:").get();
        model.addAttribute("directory", currentDir);

        do {
            path = currentDir.getName() + "/" + path;
            currentDir = currentDir.getParent();
        } while (currentDir != null);

        model.addAttribute("path", path);
        return new ModelAndView("ExplorerView");
    }
}
