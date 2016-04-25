package com.jason9075.trycatchexceptionplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jason9075.trycatchexceptionplayground.exceptions.CheckedException;
import com.jason9075.trycatchexceptionplayground.exceptions.UncheckedException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TheObject theObject = new TheObject();

        /* Checked 的Exception 一定要用 try-catch 包起來或者再丟給外面處理 */
        try {
            theObject.throwCheckedException();
        } catch (CheckedException e) {
            System.out.println(e.toString());
        }

        /* Unchecked 的Exception 不一定要用 try-catch 包起來，可以直接讓程式crash */
//        theObject.throwUncheckedException();

        /* Unchecked 的Exception 如果用try-catch 包起來 用途和Checked一樣，但是就失去Unchecked的意義 不建議下列用法 */
        try {
            theObject.throwUncheckedException();
        } catch (UncheckedException e) {
            System.out.println(e.toString());
        }


        /*
        * 總結：
        *  Checked 的Exception 會讓編譯器檢查有使用的地方如果發生意外，你有做意外處理，像是readFile讀不到時，
        *  跳出Toast 告知使用者，但是不讓程式crash。
        *
        *  Unchecked 的Exception 編譯器不會檢查，通常都是Runtime 時發生的Exception ，是一種不該發生的錯誤
        *  這代表工程師你一定用了有問題的寫法，像是你在某個地方讓1 除於0 ，導致錯誤，這時候讓程式直接crash 才是比
        *  較好的做法，催促你把錯誤的邏輯修正。如果你用try-catch 包起來，只是在逃避問題，讓程式碼未來很難維護。
        *
        * */


    }
}
