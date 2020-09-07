package exercise;

public enum typeEnum {
 type1(true),
 type2(true),
 type3(true),
 type4(true),
 type5(false),
 type6(false),
 type7(false);

 private boolean validatedType;
 
 typeEnum(boolean isValidatedType){
	 validatedType = isValidatedType;
 }
 
 public boolean isValidatedType() {
	 return validatedType;
 }
 
}