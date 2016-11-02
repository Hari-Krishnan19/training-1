package com.htcinc.repository;

import com.htcinc.TrainingApplicationTests;
import com.htcinc.entity.Bib;
import com.htcinc.entity.Holdings;
import com.htcinc.entity.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 1/11/16.
 */
public class BibRepositoryTest extends TrainingApplicationTests {


    @Autowired
    BibRepository bibRepository;

    @Test
    public void checkSaveSingleBib() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setContent("Test");
        bib = bibRepository.save(bib);
        System.out.println(bib);

    }

    @Test
    public void checkDelete() throws Exception {
        bibRepository.delete(1);

    }

    @Test
    public void checkUpdate() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setId(1);
        bib.setContent("Test1");
        bib=bibRepository.save(bib);
        System.out.println(bib);
    }

<<<<<<< HEAD
    @Test
    public void saveBibWithHoldingsAndItems() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        Holdings holdings = new Holdings();
        assertNotNull(holdings);
        Item items = new Item();
        assertNotNull(items);

        bib.setContent("Bib_Test");
        holdings.setContent("Holdings_Test");
        items.setContent("Item_Test");

        holdings.setItem(Arrays.asList(items));
        bib.setHoldings(Arrays.asList(holdings));

        Bib bibRep = bibRepository.save(bib);
        assertNotNull(bibRep);
    }

    @Test
    public void saveBibWithSingleHoldingsAndMultipleItems() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        Holdings holdings = new Holdings();
        assertNotNull(holdings);
        Item item1 = new Item();
        assertNotNull(item1);
        Item item2 = new Item();
        assertNotNull(item2);

        bib.setContent("Bib_Test");
        holdings.setContent("Holdings_Test");
        item1.setContent("Item1_Test");
        item2.setContent("Item2_Test");

        holdings.setItem(Arrays.asList(item1,item2));
        bib.setHoldings(Arrays.asList(holdings));

        Bib bibRep = bibRepository.save(bib);
        assertNotNull(bibRep);
    }

    @Test
    public void saveBibWithMultipleHoldingsAndMultipleItems() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        Holdings holding1 = new Holdings();
        assertNotNull(holding1);
        Holdings holding2 = new Holdings();
        assertNotNull(holding2);
        Item item1 = new Item();
        assertNotNull(item1);
        Item item2 = new Item();
        assertNotNull(item2);
        Item item3 = new Item();
        assertNotNull(item3);
        Item item4 = new Item();
        assertNotNull(item4);


        bib.setContent("Bib_Test");
        holding1.setContent("Holding1_Test");
        holding2.setContent("Holding2_Test");
        item1.setContent("Item1_Test");
        item2.setContent("Item2_Test");
        item3.setContent("Item3_Test");
        item4.setContent("Item4_Test");

        holding1.setItem(Arrays.asList(item1,item2));
        holding2.setItem(Arrays.asList(item3,item4));
        bib.setHoldings(Arrays.asList(holding1,holding2));

        Bib bibRep = bibRepository.save(bib);
        assertNotNull(bibRep);
    }


=======

    @Test
    public void saveSingleBibHoldingItem() throws Exception {

        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setContent("sample bib");

        Holdings holdings = new Holdings();
        assertNotNull(holdings);
        holdings.setContent("sample holding");

        Item item = new Item();
        assertNotNull(item);
        item.setContent("sample item");

        holdings.setItem(Arrays.asList(item));

        bib.setHoldings(Arrays.asList(holdings));

        assertNotNull(bibRepository);
        Bib bib1 = bibRepository.save(bib);
        assertNotNull(bib1);

    }

    @Test
    public void saveSingleBibMultipleHoldingsItems() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setContent("bib content1");

        Holdings holdings = new Holdings();
        holdings.setContent("holding content1");

        Holdings holdings1 = new Holdings();
        holdings1.setContent("holding content2");

        Item item = new Item();
        item.setContent("item content1");

        Item item1 = new Item();
        item1.setContent("item content2");

        holdings.setItem(Arrays.asList(item,item1));
        bib.setHoldings(Arrays.asList(holdings,holdings1));

        Bib bib1 = bibRepository.save(bib);
        assertNotNull(bib1);

    }
>>>>>>> b50f285b6bbe8051cc3f670a14b90f751d4055db
}
