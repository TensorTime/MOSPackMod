
package com.tensortime.mospm;

import net.minecraftforge.fml.common.*;

@Mod(modid = "mospm", name = "MOSPack Mod", version = "0.1", dependencies = "required-after:crafttweaker;required-after:ftbl", useMetadata = false)
public class MOSPM {
    @SidedProxy(clientSide="com.tensortime.mospm.ClientProxy", serverSide="com.tensortime.mospm.ServerProxy")
    public static CommonProxy proxy;
}