
package bookcabinet;

public class Cabinet {
    private int cabinetAddress;
    private String style;
    private Book[] books;
    private int index;
    
    public Cabinet(int cabinetAddress, String style) {
        this.cabinetAddress = cabinetAddress;
        this.style = style;
        this.books = new Book[5];
        this.index = 0;
    }
    
    public int getCabinetAddress() {
        return cabinetAddress;
    }
    
    public String getStyle(){
        return this.style;
    }
    
    public int getIndex() {
        return index;
    }
    
    public void setBook(int bookAddress, String name) {
        books[index++] = new Book(bookAddress, name, cabinetAddress, style);
    }
    
    public int getBookAddress(int index) {
        return books[index].getAddress();
    }
    
    public Book getBook(int index) {
        
        return books[index];
    }
    
    
    public void setTime(int index,int age, int month) {
        books[index].setAge(age);
        books[index].setMonth(month);
    }
    
    public int findBook(int bookAddress) {
        for (int i = 0; i < index; i++) {
            if (books[i].getAddress() == bookAddress) {
                return i;
            }
        }
        return -1;
    }
    
    public int findBook(String name) {
        for (int i = 0; i < index; i++) {
            if (books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1; 
    }
    
    public boolean canAdd() {
        if (index == 5) {
            return false;
        }
        else {
        return true;
    }
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str = str +" 書櫃編號: " + cabinetAddress + "\n";
        
        for(int i = 0; i < index; i++) {
            str = str + "         " + books[i] + "\n"; 
        }
        
        return str;
    }
    
    
}
