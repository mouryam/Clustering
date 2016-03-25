My implementation of Clustering uses 3 classes:

1) Cluster: Which holds ArrayList<Point>, Point centroid, and its cohesion value

2) Point: Holds the data set in a ArrayList<Double> for the quantitative attributes, and a String type for the class. It also has the Euclidean distance function.

3) MAIN: Reads in command line arguments, runs the kMeans, and outputs the Clusters and the the data of the program to a text file.


To run the program, first compile the 3 classes, then run Main like so when in the src directory,
Make sure the data is in src directory:

        $ javac Cluster.java
        $ javac Point.java
        $ javac Main.java
        $ java Main [data_file] [k] [output_filename]


Works with iris.data file that is included!
