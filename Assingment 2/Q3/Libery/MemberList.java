package Libery;



public class MemberList {
    class Member{
        String memberId;
        String name;
        String DOB;
        int issuedBookCount = 0;
        static final int memberBookLimit = 5;


        public Member(String memberId, String name, String DOB, int issuedBookCount) {
            this.memberId = memberId;
            this.name = name;
            this.DOB = DOB;
            this.issuedBookCount = issuedBookCount;
        }


        public void display(){
            System.out.println("Member ID: "+memberId);
            System.out.println("Member Name: "+name);
            System.out.println("Member DOB: "+DOB);
            System.out.println("Member Book Limit: "+issuedBookCount+"\n");
        }
    }

    Member[] member = new Member[100];
    int memberCount = 0;

    public void addNewMember(String memberId, String name, String DOB, int issuedBookCount){
        for(int i=0;i<memberCount;i++){
            if(member[i].memberId.equals(memberId)){
                System.out.println("Member Already Exists");
                return;
            }
        }
        member[memberCount] = new Member(memberId, name, DOB, issuedBookCount);
        memberCount++;
    }

    public void displayAllMembers(){
        for(int i=0;i<memberCount;i++){
            member[i].display();
        }
    } 

    public void displayParticularMember(String memberId){
        for(int i=0;i<memberCount;i++){
            if(member[i].memberId.equals(memberId)){
                member[i].display();
                return;
            }
        }
        System.out.println("Member Not Found");
    }

    public boolean checkMemberStatus(String memberId){
        for(int i=0;i<memberCount;i++){
            if(member[i].memberId.equals(memberId)){
                if(member[i].issuedBookCount < Member.memberBookLimit)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public void issueBook(String memberId){
        for(int i=0;i<memberCount;i++){
            if(member[i].memberId.equals(memberId)){
                member[i].issuedBookCount++;
                return;
            }
        }
    }

    public void returnBook(String memberId){
        for(int i= 0;i<memberCount;i++){
            if(member[i].memberId.equals(memberId)){
                member[i].issuedBookCount--;
                return;
            }
        }
    }

    
}


    
