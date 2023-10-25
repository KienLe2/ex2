public class Lego {
    public static void main(String[] args) {
        //declearing random number int
        int amountOfBricks = 69;
        int containerCapacity = 2;
        int containers;
        int blockContainers;

        //Calculating the container we have;
        containers = amountOfBricks / containerCapacity;
        System.out.println("The amount of full containers: " + containers);

        //Calculating blocks are in the container that is not completely full
        blockContainers = amountOfBricks % containerCapacity;
        System.out.println("The amount of block not full: " + blockContainers);

        if (blockContainers != 0) //compair slot of Blocks and Containers
        {
            containers++;
            containerCapacity = blockContainers;
        }
        System.out.println("Total containers not fully: " + containers);
        System.out.println("Total blocks not fully: " + containerCapacity);
    }
}
