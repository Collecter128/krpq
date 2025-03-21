package com.collecter128.kamenriderpixelquest.Item;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.effect.Effect_core;
import com.kelco.kamenridercraft.item.BaseItems.RiderFormChangeItem;
import com.kelco.kamenridercraft.item.Kuuga_Rider_Items;
import com.kelco.kamenridercraft.item.tabs.RiderTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Kuuga_Rider_Items_PixelQuest {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KamenRiderCraftCore.MOD_ID);

    public static final DeferredItem<Item> KUUGA_RISING_GROWING = ITEMS.register("kuuga_rising_growing",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_growing","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.WEAKNESS, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_SUPER_RISING_GROWING = ITEMS.register("kuuga_super_rising_growing",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_super_rising_growing","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.WEAKNESS, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_AMAZING_GROWING = ITEMS.register("kuuga_amazing_growing",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_growing","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
