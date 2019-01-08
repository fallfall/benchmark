package com.alibaba.benchmark.bean;

import java.util.HashMap;
import java.util.Map;

public class ComplexDO {

    private int pint;
    private long plong;
    private float pfloat;
    private long[] plongArray;
    private String[] pstringArray;
    private Map<String, BaseDO> baseDOMap;
    private Map<String, String> stringMap;
    private BaseDO pBaseDO;
    private BaseDO[] BaseDOArray;
    private String ip;


    public int getPint() {
        return pint;
    }

    public void setPint(int pint) {
        this.pint = pint;
    }

    public long getPlong() {
        return plong;
    }

    public void setPlong(long plong) {
        this.plong = plong;
    }

    public float getPfloat() {
        return pfloat;
    }

    public void setPfloat(float pfloat) {
        this.pfloat = pfloat;
    }

    public long[] getPlongArray() {
        return plongArray;
    }

    public void setPlongArray(long[] plongArray) {
        this.plongArray = plongArray;
    }

    public String[] getPstringArray() {
        return pstringArray;
    }

    public void setPstringArray(String[] pstringArray) {
        this.pstringArray = pstringArray;
    }

    public Map<String, BaseDO> getBaseDOMap() {
        return baseDOMap;
    }

    public void setBaseDOMap(Map<String, BaseDO> baseDOMap) {
        this.baseDOMap = baseDOMap;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public BaseDO getpBaseDO() {
        return pBaseDO;
    }

    public void setpBaseDO(BaseDO pBaseDO) {
        this.pBaseDO = pBaseDO;
    }

    public BaseDO[] getBaseDOArray() {
        return BaseDOArray;
    }

    public void setBaseDOArray(BaseDO[] baseDOArray) {
        BaseDOArray = baseDOArray;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public static ComplexDO getComplexDO() {
        ComplexDO vdo = new ComplexDO();

        String string1 = "A man was going to the house of some rich person. As he went along the road, he saw a box of good apples at the side of the road. He said, I do not want to eat those apples; for the rich man will give me much food; he will give me very nice food to eat. Then he took the apples and threw them away into the dust.";
        String string2 = "An old woman had a cat. The cat was very old; she could not run quickly, and she could not bite, because she was so old. One day the old cat saw a mouse; she jumped and caught the mouse. But she could not bite it; so the mouse got out of her mouth and ran away, because the cat could not bite it";
        String string3 = "Then the old woman became very angry because the cat had not killed the mouse. She began to hit the cat. The cat said, Do not hit your old servant. I have worked for you for many years, and I would work for you still, but I am too old. Do not be unkind to the old, but remember what good work the old did when they were young.";
        BaseDO bdo = new BaseDO();
        bdo.setId(45);
        bdo.setName("In the Orient young bulls are tested for the fight arena in a certain manner. Each is brought to the ring and allowed to attack a picador who pricks them with a lance. The bravery of each bull is then rated with care according to the number of times he demonstrates his willingness to charge in spite of the sting of the blade. Henceforth will I recognize that each day I am tested by life in like manner. If I persist, if I continue to try, if I continue to charge forward, I will succeed.");

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("me", string1);
        stringMap.put("love", string2);
        stringMap.put("test", string3);

        Map<String, BaseDO> bmap = new HashMap<>();
        bmap.put("bdoOne", bdo);
        bmap.put("bdoTwo", bdo);
        bmap.put("bdoThree", bdo);


        vdo.setpBaseDO(bdo);
        vdo.setStringMap(stringMap);
        vdo.setBaseDOMap(bmap);
        vdo.setPfloat(1.2f);
        vdo.setPint(69);
        vdo.setPlong(56);
        vdo.setPlongArray(new long[]{1, 2, 3, 4, 5, 6});
        vdo.setPstringArray(new String[]{string1, string2, string3});
        vdo.setBaseDOArray(new BaseDO[]{bdo, bdo, bdo});
        vdo.setIp("127.0.0.1");
        return vdo;
    }
}
