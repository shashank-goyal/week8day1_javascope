package com.allstate.compozed.policy;

import com.allstate.compozed.policy.claim.Fire;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 5/31/16.
 */
public class HomeOwnerTest {
    @Test
    public void toStringReturnsHomeOwnerPolicy(){
        HomeOwner homeOwner1 = new HomeOwner();
        Assert.assertThat(homeOwner1.getOwnerName(), is(nullValue()));
        Assert.assertThat(homeOwner1.getAddress(), is(nullValue()));
        homeOwner1.setAddress("foo");
        HomeOwner.sharedValue = "bar";
        Assert.assertThat(homeOwner1.getAddress(), is("foo"));

        HomeOwner homeOwner2 = new HomeOwner();
        Assert.assertThat(homeOwner2.getOwnerName(), is(nullValue()));
        Assert.assertThat(homeOwner2.getAddress(), is(nullValue()));

        Assert.assertThat(HomeOwner.sharedValue, is("bar"));
    }
    @Test
    public void testFire(){
        Fire fire = new Fire();
        //Assert.assertThat(homeOwner.toString(), is("Home Owner Policy"));
    }
}