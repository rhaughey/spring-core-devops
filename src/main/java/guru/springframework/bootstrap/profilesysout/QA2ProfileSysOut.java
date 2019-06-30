package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by rfh on 6/29/2019
 */
@Component
@Profile("qa2")
public class QA2ProfileSysOut {

    @Autowired
    public QA2ProfileSysOut(@Value("${guru.springframework.profile.message}") String msg) {
        System.out.println("###########################");
        System.out.println("###########################");
        System.out.println("##         QA2           ##");
        System.out.println(msg);
        System.out.println("###########################");
        System.out.println("###########################");
    }
}
