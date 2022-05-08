package me.zmario.enchantedgangs.api.objects;

import lombok.Data;
import me.zmario.enchantedgangs.api.GangsAPI;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.Inventory;

import java.util.List;
import java.util.UUID;

@Data
public class IGang {

    private final String name;

    private UUID owner;
    private List<OfflinePlayer> members;
    private Inventory chest;

    public void addMember(UUID uuid) {
        members.add(Bukkit.getOfflinePlayer(uuid));
    }

    public void removeMember(UUID uuid) {
        members.remove(Bukkit.getOfflinePlayer(uuid));
    }

    public boolean isMember(UUID uuid) {
        return members.contains(Bukkit.getOfflinePlayer(uuid));
    }
}
