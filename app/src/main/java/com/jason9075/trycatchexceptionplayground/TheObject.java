package com.jason9075.trycatchexceptionplayground;

import com.jason9075.trycatchexceptionplayground.exceptions.CheckedException;
import com.jason9075.trycatchexceptionplayground.exceptions.UncheckedException;

/**
 * Created by jason9075 on 2016/4/25.
 */
public class TheObject {
    public TheObject() {
    }

    public void throwUncheckedException(){
        throw new UncheckedException(">>>Unchecked Exception");
    }

    public void throwCheckedException() throws CheckedException {
        throw new CheckedException(">>>Checked Exception");
    }

}
