package houserent.view;

import houserent.domain.house;
import houserent.service.houseService;
import houserent.utils.Utility;

public class houseview {
    private boolean loop = true;
    private char key = ' ';
    private houseService houseService = new houseService(10);

    public void addHouse(){
        System.out.println("新增房源");
        System.out.println("姓名");
        String name = Utility.readString(8);
        System.out.println("电话");
        String phone = Utility.readString(12);
        System.out.println("地址");
        String address = Utility.readString(16);
        System.out.println("月租");
        int rent = Utility.readInt();
        System.out.println("状态");
        String state = Utility.readString(4);
        house newHouse = new house(0, phone, name, rent, address,  state);
        if(houseService.add(newHouse) == true){
            System.out.println("done!");
        }else{
            System.out.println("failure!");
        }
        
        
        
        
    }
    public void mainMenu(){
        do{
            System.out.println("===houserentmainMenu===");
            System.out.println("\t\t1新增房源");
            System.out.println("\t\t2查找房源");
            System.out.println("\t\t3删除房源");
            System.out.println("\t\t4修改房源");
            System.out.println("\t\t5房源列表");
            System.out.println("\t\t6推    出");
            System.out.println("请输入你数字1-6");
            key = Utility.readChar();
            switch (key){
                case '1':
                this.addHouse();
                break;
                case '2':
                System.out.println("\t\t2查找房源");
                break;
                case '3':
                System.out.println("\t\t3删除房源");
                break;
                case '4':
                System.out.println("\t\t4修改房源");
                break;
                case '5':
                this.listHouses();
                break;
                case '6':
                System.out.println("\t\t退出了houserent");
                loop = false;
                break;
            }


        }while(loop);
    }
    public void listHouses(){
        System.out.println("房源列表");
        System.out.println("id"+"\t"+"name"+"\t"+"phone"+"\t"+"address"+"\t"+"rent"+"\t"+"state");
        house[] houses = houseService.list();
        for(int i = 0;i < houses.length;i++){
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("done!");
    }
    
}
