
package ciftyonlubagliliste;


    class eleman{
       public int icerik;
       public eleman ileri;
       public eleman geri;
        
        public eleman(int icerik){
            this.icerik=icerik;
            ileri=null;
            geri=null; 
    }}
     class liste{
        eleman bas;
        eleman son;
        public liste(){
            bas=null;
            son=null; 
        }
       
    public boolean bosMu(){
            return bas==null;
    }
    public void basaEkle(int yeni){
        eleman yenidugum = new eleman(yeni);
        if(bosMu())
            son=yenidugum;
       else
            bas.geri=yenidugum;
        yenidugum.ileri=bas;
        bas=yenidugum;
        } 
    public void sonaEkle(int yeni){
        eleman yenidugum=new eleman(yeni);
        if(bosMu()){
            bas=yenidugum;
            son=yenidugum;
            
        }else{
            son.ileri=yenidugum;
            yenidugum.geri=son;
            son=yenidugum;
        }
    }
    public boolean arayaEkle(int anahtar, int yeni){
        eleman temp=bas;
        while(temp.icerik!=anahtar){
            // temp!=null  temp=temp.ileri; 
            temp=temp.ileri;
            if(temp==null){
                return false;
            }}
        eleman yenidugum= new eleman(yeni);
        if(temp==son){
            yenidugum.ileri=null;
            temp.ileri=yenidugum;
            yenidugum.geri=temp;
            son=yenidugum;
  }else{
           temp.ileri.geri=yenidugum;
           yenidugum.geri=temp;
           yenidugum.ileri=temp.ileri;
           temp.ileri=yenidugum;
        }
            return true;
    }
    eleman ara(int anahtar){
        eleman temp=bas;
        while(temp!=null){
            if(temp.icerik==anahtar)
                return temp;
                temp=temp.ileri;
        }
        return null;
    }
    void bastanSil(){
       if(bas==null){
            System.out.print("silinecek eleman yok");   
       } else{
         bas=bas.ileri;
         bas.geri=null;
         
     }
     }
    void sondanSil(){
        if(son==null){ 
            System.out.print("silinecek eleman yok");   
       }else{
            son=son.geri;
            son.ileri=null;
        }
    }
    void aradanSil(int anahtar){
        eleman temp=bas;
        while(temp!=null){
            temp=temp.ileri;
            if(temp==bas){
                bas=temp.ileri;
            } else if(temp.icerik==anahtar){
                temp.ileri.geri=temp.geri;
                temp.geri.ileri=temp.ileri;
            }
            else if(temp==son){
                son=temp.geri;
                
            }
        }
    }
    
    void maxvalue(){
        eleman temp=bas;
        eleman max=null;
        while(temp.ileri!=null){
            if(temp.icerik>temp.ileri.icerik){
                max=temp;}
            
                temp=temp.ileri;
                System.out.println(max.icerik);
            }
        }
            
    }
    
    
    
    
     
public class NewClass {
    
}
