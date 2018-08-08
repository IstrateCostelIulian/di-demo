package guru.springframework.didemo.services;


/*
@Service
@Primary
@Profile("de")
*/
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreetings() {
        return greetingRepository.getGermanGreeting();
    }
}
