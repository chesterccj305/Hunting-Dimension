package net.darkhax.huntingdim.dimension;

import net.darkhax.huntingdim.HuntingDim;
import net.minecraft.init.Biomes;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderHunting extends WorldProvider {

    @Override
    public IChunkGenerator createChunkGenerator () {

        return super.createChunkGenerator();
    }

    @Override
    protected void init () {

        this.biomeProvider = new BiomeProviderSingle(Biomes.PLAINS);
    }

    @Override
    public DimensionType getDimensionType () {

        return HuntingDim.dimensionType;
    }

    @Override
    public int getAverageGroundLevel () {

        return 70;
    }

    @Override
    public boolean canRespawnHere () {

        return false;
    }

    @Override
    public boolean isSurfaceWorld () {

        return false;
    }

    @Override
    public float calculateCelestialAngle (long worldTime, float partialTicks) {

        return 0f;
    }
}