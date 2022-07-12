package com.alvesariel.soccer_news.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alvesariel.soccer_news.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News("Flamengo avança ", "Flamengo avança no campeonato brasileiro0 "));
        news.add(new News("Flamengo avança ", "Flamengo avança no campeonato brasileiro1 "));
        news.add(new News("Flamengo avança ", "Flamengo avança no campeonato brasileiro2 "));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getText() {

        return this.news;
    }
}