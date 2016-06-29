class CompareVersion_165{
  public int compareVersion(String version1, String version2){
     String[] level1s = version1.split("\\.");
     String[] level2s = version2.split("\\.");
     int len = Math.max(level1s.length, level2s.length);
     
     for(int i = 0; i < len; i++){
       Integer v1 = i < level1s.length ? Integer.parseInt(level1s[i]) : 0;
        Integer v2 = i < level2s.length ? Integer.parseInt(level2s[i]) : 0;
        int compare = v1.compareTo(v2);
        if(compare != 0)
          return compare;
     }
  return 0;
  }

}
