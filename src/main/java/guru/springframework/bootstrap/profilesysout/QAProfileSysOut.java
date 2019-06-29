package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by rfh on 6/24/2019
 */
@Component
@Profile("qa")
public class QAProfileSysOut {

    @Autowired
    public QAProfileSysOut(@Value("${guru.springframework.profile.message}") String msg) {
        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("##          QA           ##");
        System.out.println(msg);
        System.out.println("###########################");
        System.out.println("###########################");
    }
}
