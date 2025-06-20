public class FactoryMethodPatternExample {

    // Step 1: Define the Document Interface
    interface Document {
        void open();
    }

    // Step 2: Concrete Document Classes
    static class WordDocument implements Document {
        public void open() {
            System.out.println("Opening Word Document.");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Opening PDF Document.");
        }
    }

    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Opening Excel Document.");
        }
    }

    // Step 3: Define the Abstract Factory
    abstract static class DocumentFactory {
        public abstract Document createDocument();
    }

    // Step 4: Concrete Factories
    static class WordDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    static class PdfDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    static class ExcelDocumentFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    // Step 5: Test Class (main method)
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
