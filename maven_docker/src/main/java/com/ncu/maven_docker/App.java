package com.ncu.maven_docker;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws IOException
    {
       if(args.length<1)
       {
    	   System.out.println("please provide valid url");
       }
    	   String url = args[0];
       
    	   for(String link  : getUrls(url))
    	   {
    		   System.out.println(link);
    	   }
      
    }
    public static Set<String> getUrls(String url) throws IOException
    {
    	Document doc = Jsoup.connect(url).data("query","Docker").userAgent("Mozilla").cookie("auth", "token").timeout(3000).get();
    	Set<String> links = new HashSet<String>();
    	Elements e = doc.select("a[href]");
    	for(Element element : e)
    	{
    		links.add(element.attr("ahref"));
    	}
    	
    	return links;
    }
}
