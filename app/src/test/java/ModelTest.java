import android.test.suitebuilder.annotation.SmallTest;

import com.example.fud.mvpexample.MergeModel;
import com.example.fud.mvpexample.MergeModelImpl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by FuD on 15/7/10.
 */
@SmallTest
public class ModelTest{
    MergeModel a = new MergeModelImpl();
    @Test
    public void mergeTest(){
        Assert.assertEquals(a.getMerge("123","456"),"123456");
    }

    @Test
    public void mergeTestFail(){
        Assert.assertEquals(a.getMerge("123","abc"),"123123");
    }
}
