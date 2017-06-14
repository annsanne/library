package library;

import java.util.ArrayList;

import org.junit.Test;

public class libraryTest {
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Book book1 = new Book("b01", "ISBN-1", "book1");
		Book book2 = new Book("b02", "ISBN-1", "book2");
		Book book3 = new Book("b03", "ISBN-1", "book3");

		Member loanmember = member1;
		Book loanbook = book1;
		ArrayList<Loan> Loans = new ArrayList<Loan>();

		public libraryTest() {
			member1.setId("01");
			member1.setName("张三");
			member2.setId("02");
			member2.setName("李四");
			member3.setId("03");
			member3.setName("王五");		
			Loan loan1 = new Loan();
			loan1.setMember(loanmember);
			loan1.setBook(book3);
			Loans.add(loan1);				
			loanmember.setLoans(Loans);
		}

		@Test
		public void Loan() {
			 Loan loan=loanmember.Loan(loanbook);
			 if(!(loan==null)){
			 System.out.println(
			 " 借书成功"+'\r'+
			 " 借书日期: " +loan.getLoanDate()+'\r'+
			 " 还书日期: " + loan.getDateForReuturn()+'\r'+
			 " 会员名 :" + loanmember.getName()+'\r'+
			 " 书名: " + loanbook.getTitle());
			 }
			 else{
			 System.out.println("借书失败");
			 }
		}		
}
