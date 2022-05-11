package dto;

public class Chatting {
   
   private int cnum;
   private String nickname;
   private String chatting;
   private String cdate;
   
   public Chatting() {
      // TODO Auto-generated constructor stub
   }

   public Chatting(int cnum, String nickname, String chatting, String cdate) {
      super();
      this.cnum = cnum;
      this.nickname = nickname;
      this.chatting = chatting;
      this.cdate = cdate;
   }

   public int getCnum() {
      return cnum;
   }

   public void setCnum(int cnum) {
      this.cnum = cnum;
   }

   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }

   public String getChatting() {
      return chatting;
   }

   public void setChatting(String chatting) {
      this.chatting = chatting;
   }

   public String getCdate() {
      return cdate;
   }

   public void setCdate(String cdate) {
      this.cdate = cdate;
   }

@Override
public String toString() {
	return "Chatting [cnum=" + cnum + ", nickname=" + nickname + ", chatting=" + chatting + ", cdate=" + cdate + "]";
}
   
   

}