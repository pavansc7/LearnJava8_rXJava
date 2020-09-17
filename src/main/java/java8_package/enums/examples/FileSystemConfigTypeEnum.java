package java8_package.enums.examples;

import java.util.Arrays;
import java.util.TreeMap;

enum FileSystemConfigTypeEnum {
    GENERAL("General",0),
    APPLICATION("Application",1),
    VMWARE("Vmware",2);

    private  String fileSystemConfigTypeEnum;
    private int sdnasFileSystemConfigTypeEnum;
    private static TreeMap<String,FileSystemConfigTypeEnum> triEnum;
    private static TreeMap<Integer,FileSystemConfigTypeEnum> sdnasEnum;

    static {
        triEnum = new TreeMap<>();
        Arrays.stream(FileSystemConfigTypeEnum.values()).forEach(val->{
            triEnum.put(val.fileSystemConfigTypeEnum,val);
        });

        sdnasEnum = new TreeMap<>();
        Arrays.stream(FileSystemConfigTypeEnum.values()).forEach(val->{
            sdnasEnum.put(val.sdnasFileSystemConfigTypeEnum,val);
        });
    }

    static FileSystemConfigTypeEnum getEnumFromString(String str){
      return   triEnum.get(str);
    }
    FileSystemConfigTypeEnum(String fileSystemConfigTypeEnum,int sdnasFileSystemConfigType){
        this.fileSystemConfigTypeEnum = fileSystemConfigTypeEnum;
        this.sdnasFileSystemConfigTypeEnum = sdnasFileSystemConfigType;
    }

    public static void main(String[] args) {
        FileSystemConfigTypeEnum en = FileSystemConfigTypeEnum.getEnumFromString("General2");
        System.out.println(en);
    }
}

