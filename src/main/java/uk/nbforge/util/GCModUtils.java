package uk.nbforge.util;

import net.minecraft.resources.Identifier;
import uk.nbforge.GCMod;

public class GCModUtils {
    public static Identifier modIdentifier(String name) {
        return Identifier.fromNamespaceAndPath(GCMod.MOD_ID, name);
    }
}
