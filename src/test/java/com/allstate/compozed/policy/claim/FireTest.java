package com.allstate.compozed.policy.claim;

import com.allstate.compozed.policy.HomeOwner;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 5/31/16.
 */
public class FireTest {

    @Test
    public void defaultScope(){
        new HomeOwner();
    }
}