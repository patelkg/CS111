/*
*
* This class implements a library of songs
*
* @author CS111 - Rutgers University
*
*/
public class SongApp {

  private Song[] items;      // keep Songs in an unsorted array
  private int numberOfItems; // number of Songs in the array

  /*
  * Default constructor creates array with capacity for 5 Songs
  */
  SongApp () {
      // ADD YOUR CODE HERE
      this.items = new Song[5];
      this.numberOfItems=0;
  }

  /*
  * One argument constructor creates array with user defines capacity
  *
  * @param capacity defines the capacity of the Song library
  */
  SongApp (int capacity) {
      // ADD YOUR CODE HERE
      this.items=new Song[capacity];
      this.numberOfItems=0;
  }

  /*
  * Add a Song into the library (unsorted array)
  *
  * If the library is full (there is not enough space to add another Song)
  *   - create a new array with double the size of the current array.
  *   - copy all current Songs into new array
  *   - add new Song
  *
  * @param m The Song to be added to the libary
  */
  public void addSong (Song m) {
      // ADD YOUR CODE HERE
      if (numberOfItems<items.length){
        items[numberOfItems]=m;
        this.numberOfItems++;
      } else if (numberOfItems>=items.length){
Song [] temp = items;
numberOfItems++;
items= new Song [items.length*2];
for(int i=0; i<temp.length;i++){
  items[i]=temp[i];
}
items[temp.length]=m;
      }

}

  /*
  * Removes a Song from the library. Returns true if Song is removed, false
  * otherwise.
  * The array should not become sparse after a remove, that is, all Songs
  * should be in consecutive indexes in the array.
  *
  * @param m The Song to be removed
  *
  */
  public boolean removeSong (Song m) {
      // ADD YOUR CODE HERE
      int count =0;
for (int i =0;i<numberOfItems;i++){
  if (items[i].equals(m)){
    items[i]=null;
    count++;
    break;
  }
}

if (count ==1){
Song [] temp = items;
    numberOfItems--;
    int index=0;
items=new Song[numberOfItems];
for (int j=0; j<temp.length;j++){
  if(temp[j]!=null){
  items[index]=temp[j];
  index++;
   }
}
return true;
}



return false;
  }

  /*
  * Returns the library of songs
  *
  * @return The array of Songs
  */
  public Song[] getSongs () {
      // ADD YOUR CODE HERE
      return this.items;
  }

  /*
  * Returns the current number of Songs in the library
  *
  * @return The number of items in the array
  */
  public int getNumberOfItems () {
      // ADD YOUR CODE HERE
      return this.numberOfItems;
  }

  /*
  * Update the rating of Song @m to @rating
  *
  * @param @m The Song to have its ratings updated
  * @param @rating The new rating of @m
  * @return tue if update is successfull, false otherwise
  *
  */
  public boolean updateRating (Song m, int rating) {
      // ADD YOUR CODE HERE

      for (int i =0; i<numberOfItems;i++){
        if (items[i].equals(m)){
          items[i].setRating(rating);
          return true;
        }
      }
      return false ;
  }

  /*
  * Prints all Songs
  */
  public void print () {
      // ADD YOUR CODE HERE
      for(int i=0;i<numberOfItems;i++){
        System.out.println(items[i]);
      }
  }

  /*
  * Return all the Songs by @songwriter. The array size should be the
  * number of Songs by @songwriter.
  *
  * @param songwriter The songwriter's name
  * @param An array of all the Songs by @songwriter
  *
  */
  public Song[] getSongsBySongwriter (String songwriter) {
      // ADD YOUR CODE HERE
      Song [] songWrite;
      int size=0;
      for(int i =0;i<numberOfItems;i++){
        for (int j=0; j<items[i].getNumberOfWriters();j++){
          if (items[i]==null){
            break;
          }
         if (items[i].getWriterAtIndex(j).equals(songwriter)){
         size++;
       }
        }
      }
      songWrite= new Song[size];
      int index =0;
      for(int i =0;i<numberOfItems;i++){
        for (int j=0; j<items[i].getNumberOfWriters();j++){
         if (items[i].getWriterAtIndex(j).equals(songwriter)){
           songWrite[index] =items[i];
           index++;
         }

        }
      }
      return songWrite;
  }

  /*
  * Return all the Songs released in @year. The array size should be the
  * number of Songs made in @year.
  *
  * @param year The year the Songs were made
  * @return An array of all the Songs made in @year
  *
  */
  public Song[] getSongsByYear (int year) {
      // ADD YOUR CODE HERE
      Song [] songYear;
      int size=0;
      for (int i=0; i<numberOfItems;i++){
        if (items[i]==null){
          break;
        }
        if(items[i].getYear()==year)
        size++;
      }
       songYear  = new Song [size];
       int index=0;
      for (int j=0; j<numberOfItems;j++){
        if(items[j].getYear()==year){
        songYear[index]=items[j];
        index++;
      }
      }

      return songYear;
  }

  /*
  * Return all the Songs with ratings greater then @rating
  *
  * @param rating
  * @return An array of all Songs with rating greater than @rating
  *
  */
  public Song[] getSongsWithRatingsGreaterThan (int rating) {
      // ADD YOUR CODE HERE
      Song [] songBig;
      int size =0;
      for (int i=0; i<numberOfItems;i++){
        if (items[i]==null){
          break;
        }
        if (items[i].getRating()>rating){
        size++;
      }
      }
   songBig = new Song [size];
   int index=0;
   for (int j=0;j<numberOfItems;j++){
     if (items[j]!=null && items[j].getRating()>rating){
       songBig[index]=items[j];
       index++;
     }
   }
      return songBig;
  }

  /*
  * Search for Song name @name using binary search algorithm.
  * Assumes items is sorted
  */
  public Song searchSongByName (String name) {
      // ADD YOUR CODE HERE
    this.sortByName();
      int left= 0;
      int right= numberOfItems-1;


while (left<=right){
int mid = left +((right-left)/2);
if (items[mid]==null){
  break;
}

if (items[mid].getName().compareTo(name)==0){
  return items[mid];
} else if (items[mid].getName().compareTo(name)>0){
  right = mid-1;
} else if (items[mid].getName().compareTo(name)<0){
    left =mid+1;
}

}
  return null;

  }

 /*
  * Sorts Songs by year using insertion sort
  */
  public void sortByYear () {
      // ADD YOUR CODE HERE
      for (int i=1;i<getNumberOfItems();i++){
      int j=i;
      Song temp = items[i];
         while (j>0 && items[j-1].getYear()>temp.getYear()){
           items[j]=items[j-1];
           j=j-1;
         }
      items[j]=temp;
      }
  }

 /*
  * Sorts array of Songs by name using selection sort
  */
  public void sortByName () {
      // ADD YOUR CODE HERE
      for(int i=0 ;i<getNumberOfItems();i++){
          int min =i;
          for (int j=i+1;j<getNumberOfItems();j++){
            if(items[j].getName()!=null && items[min].getName().compareTo(items[j].getName())>0){
              min = j;
            }
          }
          if (min!=i){
            Song temp = items[min];
            items[min]=items[i];
            items[i]=temp;
          }
      }

  }

 /*
  * Search for Song name using recursive linear search
  * @param name The name of the song to search
  * @param Songs The array containing all songs
  * @param l The left index
  * @param r The right index
  * @return The song with name @name or null if song is not found
  */
  public static Song searchSongByName (String name, Song[] Songs, int l, int r) {
      // ADD YOUR CODE HERE
      if (l<0 && r<0){
        return null;
      }

  if (l>r){
    return null;
  }
    if (l>Songs.length || r>Songs.length){
      return null;
    }

   if(Songs[l].getName().equals(name)){
     return Songs[l];
   } else {
     return searchSongByName(name,Songs,l+1,r);
   }
 }

}
