package net.mjorn.warcraftracechooser.fragments;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.mjorn.warcraftracechooser.Article;
import net.mjorn.warcraftracechooser.ArticlesCardAdapter;
import net.mjorn.warcraftracechooser.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class MiscFragment extends RaceFragment {

    private ArrayList<Article> articles;
    private Context context;
    private RecyclerView recycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        new NoobClubTask().execute();

        context = getLayoutInflater().getContext();
        recycler = (RecyclerView)
                inflater.inflate(R.layout.fragment_classes, container, false);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recycler.setLayoutManager(layoutManager);
        return recycler;
    }

    private class NoobClubTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document doc = Jsoup.connect("http://www.noob-club.ru/").get();
                Elements allEntries = doc.getElementsByAttributeValue("class", "entry first");
                articles = new ArrayList<>(10);
                for(int i=0; i<10; i++) {

                    //GET THE TITLE OF THE ARTICLE
                    Element entryHeader = allEntries.get(i).child(0);
                    String title = entryHeader.child(0).child(0).text();


                    //GET CONTENT
                    Elements content = allEntries.get(i).child(2).children();

                    //GET IMAGE (IF EXISTS)
                    boolean hasImage = false;
                    String imageURL = null;
                    for(Element childOfContent: content) {
                        if(childOfContent.children().size()>0) {
                            Element img = childOfContent.child(0);
                            if(img.hasClass("bbc_img resized")) {
                                imageURL = childOfContent.child(0).attr("src");
                                hasImage = true;
                                //System.out.println(":::src:::" + imageURL);
                            } else if(img.hasClass("fancy_group")) {
                                imageURL = childOfContent.child(0).attr("href");
                                hasImage = true;
                                //System.out.println(":::href:::" + imageURL);
                            }
                        }
                    }
                    //GET TEXT
                    Element entry = allEntries.get(i);
                    //removing header, author, and date text from the top
                    entry.child(0).remove();
                    //removing more, comments, and write comment text from the bottom
                    entry.child(entry.children().size()-1).remove();
                    String text = entry.text();

                    articles.add(new Article(title, hasImage,imageURL, text));
                }
            } catch (IOException e) {}
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            ArticlesCardAdapter adapter = new ArticlesCardAdapter(context, articles);
            recycler.setAdapter(adapter);
        }
    }
}
