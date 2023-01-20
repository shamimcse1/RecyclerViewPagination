# Pagination-RecyclerView
Simple and easy way to Paginating a RecyclerView

Android library/module to make Recyclerview paginate 

While scrolling we need to add page chnage listener so that we can detect the ending of list and can work as per our needs

    recyclerView.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageChange(page: Int) {
                //Page change listener for recycler view
                
                //TODO Add own code here to fetch data
            }
        })


This is how you can add the custom recycler view (chnage the tag as per your package name)

    <com.codercamp.recyclerview_pagination.PaginationRecyclerView
        android:id="@+id/custom_recycler_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

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
