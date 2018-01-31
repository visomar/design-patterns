package designpatterns.builder.test1;

public class Test1 {

	public static void main(String[] args) {
		// In this case, we have an application that creates pdf files for our system.
		// The pdf files themselves are stored with all their information in the system, so we need to gather
		// all the data needed, and it involves a lot of data

		PdfFile.Builder builder1 = new PdfFile.Builder()
				.withCreationDate("31/01/2018")
				.withOwnerId("Vifrost")
				.withPath("/tmp/example")
				.withFileName("doc1.pdf")
				.withNumberPages(10);
		PdfFile pdf1 = builder1.build();

		PdfFile pdf2 = new PdfFile.Builder()
						.withFileName("doc2.pdf")
						.withOwnerId("Yepe")
						.build();

		// It doesn't matter the order of the parameters, as well as letting some of them without value:
		System.out.println( pdf1.getFileName() );
		System.out.println( pdf2.getFileName() );
	}

}
