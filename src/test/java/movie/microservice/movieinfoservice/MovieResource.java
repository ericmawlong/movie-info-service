package movie.microservice.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/movie")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo (@PathVariable ("movieId") String movieId)
    {
        return new Movie(movieId, "Test name");
    }
}
