package com.bignerdranch.android.beatbox;

import androidx.databinding.BaseObservable;

public class PlaybackViewModel extends BaseObservable {

    private BeatBox mBeatBox;

    public PlaybackViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public int getBarPercentage(){
        return (int) (mBeatBox.getRate() * 100 / 2.0f);
    }

    public void setBarProportion(float proportion) {
        setRate(proportion*2); // Bar at 50% = 1.0 speed
    }

    public void setRate(float rate){
        mBeatBox.setRate(rate);
        notifyChange(); // Notify only for 0.1 change (5%)
    }

}
