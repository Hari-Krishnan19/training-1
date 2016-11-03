package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 24/10/16.
 */
public class RecordsTest {

    @Test
    public void newObject() throws Exception {
        Records records = new Records();
        assertNotNull(records);
    }

    @Test
    public void checkLeader() throws Exception {
        Records records = new Records();
        records.setLeader("Name");
        String recordsLeader = records.getLeader();
        assertNotNull(recordsLeader);
    }

    @Test
    public void checkControlfield() throws Exception {
        Records records = new Records();
        List<Controlfield> controlfields = new ArrayList();
        records.setControlfields(controlfields);
        List<Controlfield> recordsControlfields = records.getControlfields();
        assertNotNull(recordsControlfields);
    }

    @Test
    public void checkDatafield() throws Exception {
        Records records = new Records();
        List<Datafield> datafields = new ArrayList();
        records.setDatafields(datafields);
        List<Datafield> recordsDatafields = records.getDatafields();
        assertNotNull(recordsDatafields);
    }
}
