# RecyclerView-Pagination
Simple and easy way to Paginating a RecyclerView

## Including in your project
[![](https://jitpack.io/v/shamimcse1/RecyclerViewPagination.svg)](https://jitpack.io/#shamimcse1/RecyclerViewPagination)

### Gradle
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
	      implementation 'com.github.shamimcse1:RecyclerViewPagination:1.0.0'
	}
```

## Basic Usage
Add in you Activity file.

This is how you can add the custom recycler view

    <com.codercamp.recyclerview_pagination.PaginationRecyclerView
        android:id="@+id/custom_recycler_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>


While scrolling we need to add page chnage listener so that we can detect the ending of list and can work as per our needs

    recyclerView.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageChange(page: Int) {
                //Page change listener for recycler view
                
                //TODO Add own code here to fetch data
            }
        })

Now you can initialize the Recyclerview like below

     val recyclerView: PaginationRecyclerView = findViewById(R.id.custom_recycler_view)

        recyclerView.adapter = //TODO Add your adapter here
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageChange(page: Int) {
                //Page change listener for recycler view
              
                //TODO Add own code here to fetch data
            }
        })

**Note**: You need to create your own Recyclerview's adapter as per your need, a sample is already added in code base

Happy Coding !!
