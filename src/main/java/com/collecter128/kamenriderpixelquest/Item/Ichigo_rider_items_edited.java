package com.collecter128.kamenriderpixelquest.Item;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.item.BaseItems.RiderFormChangeItem;
import com.kelco.kamenridercraft.item.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.item.tabs.RiderTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
//extends Ichigo_Rider_Items
public class Ichigo_rider_items_edited  {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(KamenRiderCraftCore.MOD_ID);

    public static String[] Can_use_sakurajima_typhoon = new String[] {"ichigo","nigo","sango","yongo"};

    public static final DeferredItem<Item> ALTERNATIVE_ORIGINAL_TYPHOON_CORE = ITEMS.register("alternative_original_typhoon_core",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_alternative_original","ichigo","typhoon_belt_original",
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
                    ,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
                    .AddCompatibilityList(new String[] {"ichigo","yongo"}).AddToList(RiderTabs.ICHIGO_TAB_ITEM));

//    public static final DeferredItem<Item> SAKURAJIMA_TYPHOON_CORE = ITEMS.register("sakurajima_typhoon_core",
//            () -> new RiderFormChangeItem(new Item.Properties(),0,"_sakurajima","ichigo","typhoon_belt_original",
//                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
//                    ,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
//                    .AddCompatibilityList(new String[] {"ichigo","nigo","sango","yongo"}).AddToList(RiderTabs.ICHIGO_TAB_ITEM));

    public static void register(IEventBus eventBus) {
        //eventBus.unregister(Ichigo_Rider_Items.SAKURAJIMA_TYPHOON_CORE);
        //NeoForge.EVENT_BUS.unregister(Ichigo_Rider_Items.SAKURAJIMA_TYPHOON_CORE.get());
        ITEMS.register(eventBus);
    }

//    public static void Unregister(){
//        NeoForge.EVENT_BUS.unregister(Ichigo_Rider_Items.SAKURAJIMA_TYPHOON_CORE.get());
//    }

}
