import { Component, OnInit, Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { map } from 'rxjs/operators';
import { Feed } from '../model/feed';

@Injectable({
  providedIn: 'root'
})

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
 
 user : any
  _url: any
  workout : any
  private feedUrl: string = 'https://www.who.int/rss-feeds/news-english.xml';
  private rssToJsonServiceBaseUrl: string = 'https://rss2json.com/api.json?rss_url='
private feed:any;
private feeds :any;
  constructor(private router : Router, private http: HttpClient) { }

  ngOnInit() {
    this._url = `http://localhost:8010/search`
    fetch(this._url,{
        method : "POST",
        headers: {
            "content-type": "application/json"
           },
        body : JSON.stringify({
            email :localStorage.getItem("email")
        })
    })
    .then(res=>res.json())
    .then(data=>{
     this.user = data
      this._url = `http://localhost:8010/workout/`
        fetch(this._url+data.category,{
            method : "GET",
            headers: {
                "content-type": "application/json"
              }
            })
        .then(res=>res.json())
        .then(result=>{
          this.workout = result;
          this.refreshFeed();          
        })
      })
     
  
  }

  signout(){
    localStorage.removeItem("email");
    this.router.navigate(['login']);

  }

  refreshFeed() {
    // Adds 1s of delay to provide user's feedback.
    this.getFeedContent(this.feedUrl)
        .subscribe(
          feed => this.feeds = feed.items,
            
            );
  }
 
  
  

  getFeedContent(url: string): Observable<Feed> {
    return this.http.get(this.rssToJsonServiceBaseUrl + url)
            .pipe(map(this.extractFeeds));
            

  }
  private extractFeeds(res: Response): Feed {
    this.feed = res;
    return this.feed;
  }

}

