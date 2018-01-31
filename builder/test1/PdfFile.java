package designpatterns.builder.test1;

public class PdfFile {
	private String fileName;
	private String path;
	private String title;
	private String ownerId;
	private String groupId;
	private String creationDate;
	private String modifyDate;
	private int numberPages;

	// Constructor with all the data we need
	/*public PdfFile(
				String fileName,
				String path,
				String title,
				String ownerId,
				String groupId,
				String creationDate,
				String modifyDate,
				int numberPages
			){
		this.fileName = fileName;
		this.path = path;
		this.title = title;
		this.ownerId = ownerId;
		this.groupId = groupId;
		this.creationDate = creationDate;
		this.modifyDate = modifyDate;
		this.numberPages = numberPages;
	}*/

	private PdfFile(Builder builder){
		this.fileName = builder.fileName;
		this.path = builder.path;
		this.title = builder.title;
		this.ownerId = builder.ownerId;
		this.groupId = builder.groupId;
		this.creationDate = builder.creationDate;
		this.modifyDate = builder.modifyDate;
		this.numberPages = builder.numberPages;
	}

	// A getter to check functionality
	public String getFileName() {
		return fileName;
	}

	static class Builder{
		private String fileName;
		private String path;
		private String title;
		private String ownerId;
		private String groupId;
		private String creationDate;
		private String modifyDate;
		private int numberPages;

		public Builder(){
			//We can use this constructor to force the user to introduce whatever parameters we need
		}

		public PdfFile build(){
			return new PdfFile( this );
		}

		public Builder withFileName(String fileName){
			this.fileName = fileName;
			return this;
		}
		public Builder withPath(String path){
			this.path = path;
			return this;
		}
		public Builder withTitle(String title){
			this.title = title;
			return this;
		}
		public Builder withOwnerId(String ownerId){
			this.ownerId = ownerId;
			return this;
		}
		public Builder withGroupId(String groupId){
			this.groupId = groupId;
			return this;
		}
		public Builder withCreationDate(String creationDate){
			this.creationDate = creationDate;
			return this;
		}
		public Builder withModifyDate(String modifyDate){
			this.modifyDate = modifyDate;
			return this;
		}
		public Builder withNumberPages(int numberPages){
			this.numberPages = numberPages;
			return this;
		}
	}
}
