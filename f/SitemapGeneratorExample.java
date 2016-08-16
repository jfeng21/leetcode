import java.io.File;
import java.net.MalformedURLException;
import java.util.Date;

import com.redfin.sitemapgenerator.ChangeFreq;
import com.redfin.sitemapgenerator.WebSitemapGenerator;
import com.redfin.sitemapgenerator.WebSitemapUrl;

// Java Code To Generate Sitemap

public class SitemapGeneratorExample {

  public static void main(String[] args) throws MalformedURLException {
    // If you need gzipped output
    WebSitemapGenerator sitemapGenerator = WebSitemapGenerator
        .builder("http://www.javatips.net", new File("C:\\sitemap"))
        .gzip(true).build();

    WebSitemapUrl sitemapUrl = new WebSitemapUrl.Options(
        "http://www.javatips.net/blog/2011/08/findbugs-in-eclipse-java-tutorial")
        .lastMod(new Date()).priority(1.0)
        .changeFreq(ChangeFreq.HOURLY).build();
    // this will configure the URL with lastmod=now, priority=1.0,
    // changefreq=hourly

    // You can add any number of urls here
    sitemapGenerator.addUrl(sitemapUrl);
    sitemapGenerator
        .addUrl("http://www.javatips.net/blog/2011/09/create-sitemap-using-java");
    sitemapGenerator.write();
  }
}
