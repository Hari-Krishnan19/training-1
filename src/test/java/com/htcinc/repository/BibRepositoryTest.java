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
}
