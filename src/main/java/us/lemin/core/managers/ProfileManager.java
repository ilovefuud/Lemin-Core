package us.lemin.core.managers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import us.lemin.core.player.CoreProfile;

public class ProfileManager {
    private final Map<UUID, CoreProfile> profiles = new HashMap<>();

    public CoreProfile createProfile(String name, UUID id, String address) {
        CoreProfile profile = new CoreProfile(name, id, address);
        profiles.put(id, profile);
        return profile;
    }

    public CoreProfile getProfile(UUID id) {
        return profiles.get(id);
    }

    public void removeProfile(UUID id) {
        profiles.remove(id);
    }

    public void saveProfiles() {
        for (CoreProfile profile : profiles.values()) {
            profile.save(false);
        }
    }
}
