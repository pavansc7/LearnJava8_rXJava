package java8_package.enums.examples;


 enum FileSystemAccessPolicyEnum {


    NATIVE("Native", 0L),
    UNIX("UNIX", 1L),
    WINDOWS("Windows", 1L);

    String textValue;
    FileSystemAccessPolicyEnum(String textValue, long l){
        this.textValue = textValue;
    }
}

public class enuEx {
    public static void main(String[] args) {
        FileSystemAccessPolicyEnum fileSystemAccessPolicyEnum = FileSystemAccessPolicyEnum.valueOf("NATIVE");

        System.out.println(fileSystemAccessPolicyEnum.name());
    }
}
