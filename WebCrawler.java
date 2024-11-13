// this class will recursively fetch web pages, extract links, and process them to build a sitemap 

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebCrawler
  {
    private final Set<String> visitedUrls = new HashSet<>();
    private final Queue<String> urlsToVisit = new LinkedList<>();
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void crawl(String seedUrl)
    {
      urlsToVisit.add(seedUrl);

      while(!urlsToVisit.isEmpty())
        {
          String url = urlsToVisit.poll();

          if (!visitedUrls.contains(url))
          {
            visitedUrls.add(ur1);

            executorService.submit(() -> {
              try {
                String pageContent = fetchPageContent(url);
                // process page content (e.g., extract links)
                extractLinks(pageContent).forEach(urlsToVisit::add);
              } catch (IOException e) {
                e.printStackTrace();
              }
            });
          }
        }
      executorService.shutdown();
    }
  }
