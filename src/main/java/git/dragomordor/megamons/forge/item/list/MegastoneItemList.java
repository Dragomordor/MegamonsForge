package git.dragomordor.megamons.forge.item.list;


import git.dragomordor.megamons.forge.item.MegamonsItems;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class MegastoneItemList {

    public List<Item> getMegastonesItemList() {
        List<Item> cutMegastoneItemList = new ArrayList<>();

        // add new megastones here!
        cutMegastoneItemList.add(MegamonsItems.CUT_ALAKAZITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_AERODACTYLITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_BEEDRILLITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_BLASTOISINITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_CHARIZARDITEX.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_CHARIZARDITEY.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_GENGARITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_GYARADOSITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_KANGASKHANITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_MEWTWONITEX.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_MEWTWONITEY.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_PIDGEOTITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_PINSIRITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_SLOWBRONITE.get());
        cutMegastoneItemList.add(MegamonsItems.CUT_VENUSAURITE.get());

        return cutMegastoneItemList;

    }


}
