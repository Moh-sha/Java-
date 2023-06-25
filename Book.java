private String bookTitle;
	private String aurthorName;
	private String isbn;
	private double  price;
	private int avaialeQuantity;


	public BookInfo(String q,String w,String e,double r,int t)
	{
			bookTitle = q;
			aurthorName = w;
			isbn = e;
			price = r ;
			avaialeQuantity = t ;

	}
	

	public void setbookTitle(String title){

			bookTitle = title;
	}
	public void setaurtherName(String author){

			aurthorName = author;
	}
	public void setisbn(String ib){
			isbn = ib;

	}
	public void setbookType(double pr){

			price = pr;
	}
	public void setavaialeQuantity(int quantity){

			avaialeQuantity = quantity;
	}


	public String getbookTitle(){return bookTitle;}
	public String getaurthorName(){return aurthorName;}
	public String getisbn(){return isbn;}
	public double getprice(){return price;}
	public int getavaialeQuantity(){return avaialeQuantity;}



	public void ShowInfo(){

			System.out.println("Title : "+getbookTitle());
			System.out.println("Author 	: "+getaurthorName());
			System.out.println("Book isbn 			: "+getisbn());
			System.out.println(" Price of the Book : "+getprice());
			System.out.println("Quantity of books : "+getavaialeQuantity());

	}