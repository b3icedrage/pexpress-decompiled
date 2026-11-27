package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: Ic0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1195Ic0 {
    public static final EnumC1195Ic0 e;
    public static final EnumC1195Ic0 g;
    public static final EnumC1195Ic0[] h;
    public static final /* synthetic */ EnumC1195Ic0[] i;
    public final int d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1195Ic0 EF0;

    static {
        UE0 ue0 = UE0.DOUBLE;
        EnumC1195Ic0 enumC1195Ic0 = new EnumC1195Ic0("DOUBLE", 0, 0, 1, ue0);
        UE0 ue1 = UE0.FLOAT;
        EnumC1195Ic0 enumC1195Ic1 = new EnumC1195Ic0("FLOAT", 1, 1, 1, ue1);
        UE0 ue2 = UE0.LONG;
        EnumC1195Ic0 enumC1195Ic2 = new EnumC1195Ic0("INT64", 2, 2, 1, ue2);
        EnumC1195Ic0 enumC1195Ic3 = new EnumC1195Ic0("UINT64", 3, 3, 1, ue2);
        UE0 ue3 = UE0.INT;
        EnumC1195Ic0 enumC1195Ic4 = new EnumC1195Ic0("INT32", 4, 4, 1, ue3);
        EnumC1195Ic0 enumC1195Ic5 = new EnumC1195Ic0("FIXED64", 5, 5, 1, ue2);
        EnumC1195Ic0 enumC1195Ic6 = new EnumC1195Ic0("FIXED32", 6, 6, 1, ue3);
        UE0 ue4 = UE0.BOOLEAN;
        EnumC1195Ic0 enumC1195Ic7 = new EnumC1195Ic0("BOOL", 7, 7, 1, ue4);
        UE0 ue5 = UE0.STRING;
        EnumC1195Ic0 enumC1195Ic8 = new EnumC1195Ic0("STRING", 8, 8, 1, ue5);
        UE0 ue6 = UE0.MESSAGE;
        EnumC1195Ic0 enumC1195Ic9 = new EnumC1195Ic0("MESSAGE", 9, 9, 1, ue6);
        UE0 ue7 = UE0.BYTE_STRING;
        EnumC1195Ic0 enumC1195Ic10 = new EnumC1195Ic0("BYTES", 10, 10, 1, ue7);
        EnumC1195Ic0 enumC1195Ic11 = new EnumC1195Ic0("UINT32", 11, 11, 1, ue3);
        UE0 ue8 = UE0.ENUM;
        EnumC1195Ic0 enumC1195Ic12 = new EnumC1195Ic0("ENUM", 12, 12, 1, ue8);
        EnumC1195Ic0 enumC1195Ic13 = new EnumC1195Ic0("SFIXED32", 13, 13, 1, ue3);
        EnumC1195Ic0 enumC1195Ic14 = new EnumC1195Ic0("SFIXED64", 14, 14, 1, ue2);
        EnumC1195Ic0 enumC1195Ic15 = new EnumC1195Ic0("SINT32", 15, 15, 1, ue3);
        EnumC1195Ic0 enumC1195Ic16 = new EnumC1195Ic0("SINT64", 16, 16, 1, ue2);
        EnumC1195Ic0 enumC1195Ic17 = new EnumC1195Ic0("GROUP", 17, 17, 1, ue6);
        EnumC1195Ic0 enumC1195Ic18 = new EnumC1195Ic0("DOUBLE_LIST", 18, 18, 2, ue0);
        EnumC1195Ic0 enumC1195Ic19 = new EnumC1195Ic0("FLOAT_LIST", 19, 19, 2, ue1);
        EnumC1195Ic0 enumC1195Ic20 = new EnumC1195Ic0("INT64_LIST", 20, 20, 2, ue2);
        EnumC1195Ic0 enumC1195Ic21 = new EnumC1195Ic0("UINT64_LIST", 21, 21, 2, ue2);
        EnumC1195Ic0 enumC1195Ic22 = new EnumC1195Ic0("INT32_LIST", 22, 22, 2, ue3);
        EnumC1195Ic0 enumC1195Ic23 = new EnumC1195Ic0("FIXED64_LIST", 23, 23, 2, ue2);
        EnumC1195Ic0 enumC1195Ic24 = new EnumC1195Ic0("FIXED32_LIST", 24, 24, 2, ue3);
        EnumC1195Ic0 enumC1195Ic25 = new EnumC1195Ic0("BOOL_LIST", 25, 25, 2, ue4);
        EnumC1195Ic0 enumC1195Ic26 = new EnumC1195Ic0("STRING_LIST", 26, 26, 2, ue5);
        EnumC1195Ic0 enumC1195Ic27 = new EnumC1195Ic0("MESSAGE_LIST", 27, 27, 2, ue6);
        EnumC1195Ic0 enumC1195Ic28 = new EnumC1195Ic0("BYTES_LIST", 28, 28, 2, ue7);
        EnumC1195Ic0 enumC1195Ic29 = new EnumC1195Ic0("UINT32_LIST", 29, 29, 2, ue3);
        EnumC1195Ic0 enumC1195Ic30 = new EnumC1195Ic0("ENUM_LIST", 30, 30, 2, ue8);
        EnumC1195Ic0 enumC1195Ic31 = new EnumC1195Ic0("SFIXED32_LIST", 31, 31, 2, ue3);
        EnumC1195Ic0 enumC1195Ic32 = new EnumC1195Ic0("SFIXED64_LIST", 32, 32, 2, ue2);
        EnumC1195Ic0 enumC1195Ic33 = new EnumC1195Ic0("SINT32_LIST", 33, 33, 2, ue3);
        EnumC1195Ic0 enumC1195Ic34 = new EnumC1195Ic0("SINT64_LIST", 34, 34, 2, ue2);
        EnumC1195Ic0 enumC1195Ic35 = new EnumC1195Ic0("DOUBLE_LIST_PACKED", 35, 35, 3, ue0);
        e = enumC1195Ic35;
        EnumC1195Ic0 enumC1195Ic36 = new EnumC1195Ic0("FLOAT_LIST_PACKED", 36, 36, 3, ue1);
        EnumC1195Ic0 enumC1195Ic37 = new EnumC1195Ic0("INT64_LIST_PACKED", 37, 37, 3, ue2);
        EnumC1195Ic0 enumC1195Ic38 = new EnumC1195Ic0("UINT64_LIST_PACKED", 38, 38, 3, ue2);
        EnumC1195Ic0 enumC1195Ic39 = new EnumC1195Ic0("INT32_LIST_PACKED", 39, 39, 3, ue3);
        EnumC1195Ic0 enumC1195Ic40 = new EnumC1195Ic0("FIXED64_LIST_PACKED", 40, 40, 3, ue2);
        EnumC1195Ic0 enumC1195Ic41 = new EnumC1195Ic0("FIXED32_LIST_PACKED", 41, 41, 3, ue3);
        EnumC1195Ic0 enumC1195Ic42 = new EnumC1195Ic0("BOOL_LIST_PACKED", 42, 42, 3, ue4);
        EnumC1195Ic0 enumC1195Ic43 = new EnumC1195Ic0("UINT32_LIST_PACKED", 43, 43, 3, ue3);
        EnumC1195Ic0 enumC1195Ic44 = new EnumC1195Ic0("ENUM_LIST_PACKED", 44, 44, 3, ue8);
        EnumC1195Ic0 enumC1195Ic45 = new EnumC1195Ic0("SFIXED32_LIST_PACKED", 45, 45, 3, ue3);
        EnumC1195Ic0 enumC1195Ic46 = new EnumC1195Ic0("SFIXED64_LIST_PACKED", 46, 46, 3, ue2);
        EnumC1195Ic0 enumC1195Ic47 = new EnumC1195Ic0("SINT32_LIST_PACKED", 47, 47, 3, ue3);
        EnumC1195Ic0 enumC1195Ic48 = new EnumC1195Ic0("SINT64_LIST_PACKED", 48, 48, 3, ue2);
        g = enumC1195Ic48;
        i = new EnumC1195Ic0[]{enumC1195Ic0, enumC1195Ic1, enumC1195Ic2, enumC1195Ic3, enumC1195Ic4, enumC1195Ic5, enumC1195Ic6, enumC1195Ic7, enumC1195Ic8, enumC1195Ic9, enumC1195Ic10, enumC1195Ic11, enumC1195Ic12, enumC1195Ic13, enumC1195Ic14, enumC1195Ic15, enumC1195Ic16, enumC1195Ic17, enumC1195Ic18, enumC1195Ic19, enumC1195Ic20, enumC1195Ic21, enumC1195Ic22, enumC1195Ic23, enumC1195Ic24, enumC1195Ic25, enumC1195Ic26, enumC1195Ic27, enumC1195Ic28, enumC1195Ic29, enumC1195Ic30, enumC1195Ic31, enumC1195Ic32, enumC1195Ic33, enumC1195Ic34, enumC1195Ic35, enumC1195Ic36, enumC1195Ic37, enumC1195Ic38, enumC1195Ic39, enumC1195Ic40, enumC1195Ic41, enumC1195Ic42, enumC1195Ic43, enumC1195Ic44, enumC1195Ic45, enumC1195Ic46, enumC1195Ic47, enumC1195Ic48, new EnumC1195Ic0("GROUP_LIST", 49, 49, 2, ue6), new EnumC1195Ic0("MAP", 50, 50, 4, UE0.VOID)};
        EnumC1195Ic0[] enumC1195Ic0ArrValues = values();
        h = new EnumC1195Ic0[enumC1195Ic0ArrValues.length];
        for (EnumC1195Ic0 enumC1195Ic49 : enumC1195Ic0ArrValues) {
            h[enumC1195Ic49.d] = enumC1195Ic49;
        }
    }

    public EnumC1195Ic0(String str, int i2, int i3, int i4, UE0 ue0) {
        super(str, i2);
        this.d = i3;
        int iG = C1039Gc0.g(i4);
        if (iG == 1 || iG == 3) {
            ue0.getClass();
        }
        if (i4 == 1) {
            ue0.ordinal();
        }
    }

    public static EnumC1195Ic0 valueOf(String str) {
        return (EnumC1195Ic0) Enum.valueOf(EnumC1195Ic0.class, str);
    }

    public static EnumC1195Ic0[] values() {
        return (EnumC1195Ic0[]) i.clone();
    }
}
