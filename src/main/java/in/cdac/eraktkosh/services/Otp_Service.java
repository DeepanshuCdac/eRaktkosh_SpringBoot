package in.cdac.eraktkosh.services;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Otp_Service {

    private final HazelcastInstance hazelcastInstance;

    @Autowired
    public Otp_Service(HazelcastInstance hazelcastInstance) {
        this.hazelcastInstance = hazelcastInstance;
    }

    public void yourMethod() {
        Map<String, String> captchaCache = hazelcastInstance.getMap("captchaCache");
        // Perform operations on captchaCache
    }
}
