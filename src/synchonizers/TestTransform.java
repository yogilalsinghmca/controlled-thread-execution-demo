package synchonizers;

public class TestTransform {

    private static final String OUTPUT_XML = "C:/temp/output.xml";
    private static final String INPUT_XML = "C:/temp/input.xml";
    private static final String XSL = "C:/temp/my.xsl";

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {

        Runtime.getRuntime();
        // 1. Instantiate a TransformerFactory.
        javax.xml.transform.TransformerFactory tFactory = javax.xml.transform.TransformerFactory.newInstance();

        // 2. Use the TransformerFactory to process the stylesheet Source and
        // generate a Transformer.
        javax.xml.transform.Transformer transformer = tFactory.newTransformer(new javax.xml.transform.stream.StreamSource(XSL));

        // transformer.setParameter("mapping", "");
        // 3. Use the Transformer to transform an XML Source and send the
        // output to a Result object.
        transformer.transform(new javax.xml.transform.stream.StreamSource(INPUT_XML), new javax.xml.transform.stream.StreamResult(new java.io.FileOutputStream(OUTPUT_XML)));
        System.out.println("Done!");
    }

}
