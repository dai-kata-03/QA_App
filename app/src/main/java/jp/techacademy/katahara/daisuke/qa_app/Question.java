package jp.techacademy.katahara.daisuke.qa_app;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Daisuke on 2017/05/03.
 */

public class Question implements Serializable {
    private String mTitle;
    private String mBody;
    private String mName;
    private String mUid;
    private String mQuestionUid;
    private int mGenre;
    private byte[] mBitmapArray;
    private ArrayList<Answer> mAnswerArrayList;
    private String mFavor; // 課題用の追加

    public String getTitle() {
        return mTitle;
    }

    public String getBody() {
        return mBody;
    }

    public String getName() {
        return mName;
    }

    public String getUid() {
        return mUid;
    }

    public String getQuestionUid() {
        return mQuestionUid;
    }
    public int getGenre() {
        return mGenre;
    }

    public byte[] getImageBytes() {
        return mBitmapArray;
    }

    public ArrayList<Answer> getAnswers() {
        return mAnswerArrayList;
    }

    // 課題用の追加 Start
    public String getFavor() {
        return mFavor;
    }
    // 課題用の追加 End

    public Question(String title, String body, String name, String uid, String questionUid, int genre, byte[] bytes, ArrayList<Answer> answers, String favor) {
        mTitle = title;
        mBody = body;
        mName = name;
        mUid = uid;
        mQuestionUid = questionUid;
        mGenre = genre;
        mBitmapArray = bytes.clone();
        mAnswerArrayList = answers;
        mFavor = favor; // 課題用の追加
    }

}
