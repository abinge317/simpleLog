package cn.codecrazy.logging;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = Logger.getLogger();
    public static void main( String[] args )
    {
        logger.trace("Hello, SimpleLog!");
        logger.debug("Hello, SimpleLog!");
        logger.info("Hello, SimpleLog!");
        logger.warn("Hello, SimpleLog!");
        logger.error("Hello, SimpleLog!");
    }
}
