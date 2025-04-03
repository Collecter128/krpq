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

    public static final DeferredItem<Item> KUUGA_LAUNDRY = ITEMS.register("kuuga_laundry",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_laundry","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.WEAKNESS, 40, 2,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_RISING_GROWING = ITEMS.register("kuuga_rising_growing",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_growing","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.WEAKNESS, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_SUPER_RISING_GROWING = ITEMS.register("kuuga_super_rising_growing",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_super_rising_growing","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.WEAKNESS, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    static final DeferredItem<Item> KUUGA_SUPER_RISING_MIGHTY = ITEMS.register("kuuga_super_rising_mighty",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_super_rising_mighty","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
                    new MobEffectInstance(Effect_core.PUNCH, 40, 3,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_SUPER_RISING_DRAGON = ITEMS.register("kuuga_super_rising_dragon",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_super_rising_dragon","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_SUPER_RISING_PEGASUS = ITEMS.register("kuuga_super_rising_pegasus",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_super_rising_pegasus","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_SUPER_RISING_TITAN = ITEMS.register("kuuga_super_rising_titan",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_super_rising_titan","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_AMAZING_GROWING = ITEMS.register("kuuga_amazing_growing",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_growing","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
                    .has_basic_model()
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_AMAZING_DRAGON = ITEMS.register("kuuga_amazing_dragon",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_dragon","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 6,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false))
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_AMAZING_PEGASUS = ITEMS.register("kuuga_amazing_pegasus",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_pegasus","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_AMAZING_TITAN = ITEMS.register("kuuga_amazing_titan",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_titan","kuuga","arcle_belt_r",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 6,true,false))
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));

    public static final DeferredItem<Item> KUUGA_AMAZING_ULTIMATE = ITEMS.register("kuuga_amazing_ultimate",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_ultimate","kuuga","arcle_belt_ru",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 7,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(Effect_core.PUNCH, 40, 6,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false))
                    .AddToList(RiderTabs.KUUGA_TAB_ITEM));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
