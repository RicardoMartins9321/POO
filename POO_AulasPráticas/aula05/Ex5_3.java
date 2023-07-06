package aula05;

public class Ex5_3 {

    static class Property{
        private int id;
        private String location;
        private int numquartos;
        private int price;
        private boolean sold;
        private DateYMD auctionDate;

        public Property(String location, int numquartos, int price, int id){
            this.id = id;
            this.location = location;
            this.numquartos = numquartos;
            this.price = price;
            this.sold = false;
            this.auctionDate = null;
        }

        public int getId(){return this.id;}
        public String getLocation(){return this.location;}
        public int getNumquartos(){return this.numquartos;}
        public int getPrice(){return this.price;}
        public boolean getSold(){return this.sold;}
        public DateYMD getAuctionDate(){return this.auctionDate;}

        public void sell(){
            if(this.sold == false){
                this.sold = true;
                this.auctionDate = null;
            }
        }

        public void setAuction(DateYMD date, int duration){
            if(this.sold == false){
                this.auctionDate = date;
            }
        }
        
        public String toString(){
            String s = "Imóvel: "+this.id+"; ";
            s += "quartos: "+this.numquartos+"; ";
            s += "localidade: "+this.location+"; ";
            s += "preço: "+this.price+"; ";
            if (this.sold==false)
                s += "disponível: sim; ";
            else
                s += "disponível: não; ";
            if(this.auctionDate != null){
                s += "leilão " +this.auctionDate.toString() +" : "+this.auctionDate.toString();
            }
            return s;
        }

    }

    static class RealEstate{
        private Property[] properties;
        private int count;

        public RealEstate(){
            this.properties = new Property[100];
            this.count = 0;
        }

        public void newProperty(String location, int numquartos, int price){
            int id= 1000 + this.count;
            Property p = new Property(location, numquartos, price, id);
            this.properties[this.count] = p;
            this.count++;
        }

        public void sell(int id){
            for (int i = 0; i < this.count; i++) {
                if(this.properties[i].getId() == id){
                    this.properties[i].sell();
                    System.out.println("Imóvel "+id +" vendido.");
                }
            }
            System.out.println("Imóvel "+ id +" não está disponível.");
        }

        public void setAuction(int id, DateYMD date, int duration){

            for (int i = 0; i < this.count; i++) {
                if(this.properties[i].getId() == id){
                    this.properties[i].setAuction(date, duration);
                    return;
                }
            }
            System.out.println("Imóvel "+ id +" não existe.");
        }

        public String toString(){
            String s = "Propriedades: \n";
            for (int i = 0; i < this.count; i++) {
                s += this.properties[i].toString()+"\n";   }
            return s;
        }    
    }
    public static void main(String[] args) {
        RealEstate imobiliaria = new RealEstate();
        imobiliaria.newProperty("Glória", 2, 30000);
        imobiliaria.newProperty("Vera Cruz", 1, 25000);
        imobiliaria.newProperty("Santa Joana", 3, 32000);
        imobiliaria.newProperty("Aradas", 2, 24000);
        imobiliaria.newProperty("São Bernardo", 2, 20000);

        imobiliaria.sell(1001);
        imobiliaria.setAuction(1002, new DateYMD(21, 3, 2023), 4);
        imobiliaria.setAuction(1003, new DateYMD(1, 4, 2023), 3);
        imobiliaria.setAuction(1001, new DateYMD(1, 4, 2023), 4);
        imobiliaria.setAuction(1010, new DateYMD(1, 4, 2023), 4);

        System.out.println(imobiliaria);
    }
}


