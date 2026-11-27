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
/* JADX INFO: renamed from: Hc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1117Hc0 {
    public static final EnumC1117Hc0 e;
    public static final EnumC1117Hc0 g;
    public static final EnumC1117Hc0[] h;
    public static final /* synthetic */ EnumC1117Hc0[] i;
    public final int d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1117Hc0 EF0;

    static {
        SE0 se0 = SE0.DOUBLE;
        EnumC1117Hc0 enumC1117Hc0 = new EnumC1117Hc0("DOUBLE", 0, 0, 1, se0);
        SE0 se1 = SE0.FLOAT;
        EnumC1117Hc0 enumC1117Hc1 = new EnumC1117Hc0("FLOAT", 1, 1, 1, se1);
        SE0 se2 = SE0.LONG;
        EnumC1117Hc0 enumC1117Hc2 = new EnumC1117Hc0("INT64", 2, 2, 1, se2);
        EnumC1117Hc0 enumC1117Hc3 = new EnumC1117Hc0("UINT64", 3, 3, 1, se2);
        SE0 se3 = SE0.INT;
        EnumC1117Hc0 enumC1117Hc4 = new EnumC1117Hc0("INT32", 4, 4, 1, se3);
        EnumC1117Hc0 enumC1117Hc5 = new EnumC1117Hc0("FIXED64", 5, 5, 1, se2);
        EnumC1117Hc0 enumC1117Hc6 = new EnumC1117Hc0("FIXED32", 6, 6, 1, se3);
        SE0 se4 = SE0.BOOLEAN;
        EnumC1117Hc0 enumC1117Hc7 = new EnumC1117Hc0("BOOL", 7, 7, 1, se4);
        SE0 se5 = SE0.STRING;
        EnumC1117Hc0 enumC1117Hc8 = new EnumC1117Hc0("STRING", 8, 8, 1, se5);
        SE0 se6 = SE0.MESSAGE;
        EnumC1117Hc0 enumC1117Hc9 = new EnumC1117Hc0("MESSAGE", 9, 9, 1, se6);
        SE0 se7 = SE0.BYTE_STRING;
        EnumC1117Hc0 enumC1117Hc10 = new EnumC1117Hc0("BYTES", 10, 10, 1, se7);
        EnumC1117Hc0 enumC1117Hc11 = new EnumC1117Hc0("UINT32", 11, 11, 1, se3);
        SE0 se8 = SE0.ENUM;
        EnumC1117Hc0 enumC1117Hc12 = new EnumC1117Hc0("ENUM", 12, 12, 1, se8);
        EnumC1117Hc0 enumC1117Hc13 = new EnumC1117Hc0("SFIXED32", 13, 13, 1, se3);
        EnumC1117Hc0 enumC1117Hc14 = new EnumC1117Hc0("SFIXED64", 14, 14, 1, se2);
        EnumC1117Hc0 enumC1117Hc15 = new EnumC1117Hc0("SINT32", 15, 15, 1, se3);
        EnumC1117Hc0 enumC1117Hc16 = new EnumC1117Hc0("SINT64", 16, 16, 1, se2);
        EnumC1117Hc0 enumC1117Hc17 = new EnumC1117Hc0("GROUP", 17, 17, 1, se6);
        EnumC1117Hc0 enumC1117Hc18 = new EnumC1117Hc0("DOUBLE_LIST", 18, 18, 2, se0);
        EnumC1117Hc0 enumC1117Hc19 = new EnumC1117Hc0("FLOAT_LIST", 19, 19, 2, se1);
        EnumC1117Hc0 enumC1117Hc20 = new EnumC1117Hc0("INT64_LIST", 20, 20, 2, se2);
        EnumC1117Hc0 enumC1117Hc21 = new EnumC1117Hc0("UINT64_LIST", 21, 21, 2, se2);
        EnumC1117Hc0 enumC1117Hc22 = new EnumC1117Hc0("INT32_LIST", 22, 22, 2, se3);
        EnumC1117Hc0 enumC1117Hc23 = new EnumC1117Hc0("FIXED64_LIST", 23, 23, 2, se2);
        EnumC1117Hc0 enumC1117Hc24 = new EnumC1117Hc0("FIXED32_LIST", 24, 24, 2, se3);
        EnumC1117Hc0 enumC1117Hc25 = new EnumC1117Hc0("BOOL_LIST", 25, 25, 2, se4);
        EnumC1117Hc0 enumC1117Hc26 = new EnumC1117Hc0("STRING_LIST", 26, 26, 2, se5);
        EnumC1117Hc0 enumC1117Hc27 = new EnumC1117Hc0("MESSAGE_LIST", 27, 27, 2, se6);
        EnumC1117Hc0 enumC1117Hc28 = new EnumC1117Hc0("BYTES_LIST", 28, 28, 2, se7);
        EnumC1117Hc0 enumC1117Hc29 = new EnumC1117Hc0("UINT32_LIST", 29, 29, 2, se3);
        EnumC1117Hc0 enumC1117Hc30 = new EnumC1117Hc0("ENUM_LIST", 30, 30, 2, se8);
        EnumC1117Hc0 enumC1117Hc31 = new EnumC1117Hc0("SFIXED32_LIST", 31, 31, 2, se3);
        EnumC1117Hc0 enumC1117Hc32 = new EnumC1117Hc0("SFIXED64_LIST", 32, 32, 2, se2);
        EnumC1117Hc0 enumC1117Hc33 = new EnumC1117Hc0("SINT32_LIST", 33, 33, 2, se3);
        EnumC1117Hc0 enumC1117Hc34 = new EnumC1117Hc0("SINT64_LIST", 34, 34, 2, se2);
        EnumC1117Hc0 enumC1117Hc35 = new EnumC1117Hc0("DOUBLE_LIST_PACKED", 35, 35, 3, se0);
        e = enumC1117Hc35;
        EnumC1117Hc0 enumC1117Hc36 = new EnumC1117Hc0("FLOAT_LIST_PACKED", 36, 36, 3, se1);
        EnumC1117Hc0 enumC1117Hc37 = new EnumC1117Hc0("INT64_LIST_PACKED", 37, 37, 3, se2);
        EnumC1117Hc0 enumC1117Hc38 = new EnumC1117Hc0("UINT64_LIST_PACKED", 38, 38, 3, se2);
        EnumC1117Hc0 enumC1117Hc39 = new EnumC1117Hc0("INT32_LIST_PACKED", 39, 39, 3, se3);
        EnumC1117Hc0 enumC1117Hc40 = new EnumC1117Hc0("FIXED64_LIST_PACKED", 40, 40, 3, se2);
        EnumC1117Hc0 enumC1117Hc41 = new EnumC1117Hc0("FIXED32_LIST_PACKED", 41, 41, 3, se3);
        EnumC1117Hc0 enumC1117Hc42 = new EnumC1117Hc0("BOOL_LIST_PACKED", 42, 42, 3, se4);
        EnumC1117Hc0 enumC1117Hc43 = new EnumC1117Hc0("UINT32_LIST_PACKED", 43, 43, 3, se3);
        EnumC1117Hc0 enumC1117Hc44 = new EnumC1117Hc0("ENUM_LIST_PACKED", 44, 44, 3, se8);
        EnumC1117Hc0 enumC1117Hc45 = new EnumC1117Hc0("SFIXED32_LIST_PACKED", 45, 45, 3, se3);
        EnumC1117Hc0 enumC1117Hc46 = new EnumC1117Hc0("SFIXED64_LIST_PACKED", 46, 46, 3, se2);
        EnumC1117Hc0 enumC1117Hc47 = new EnumC1117Hc0("SINT32_LIST_PACKED", 47, 47, 3, se3);
        EnumC1117Hc0 enumC1117Hc48 = new EnumC1117Hc0("SINT64_LIST_PACKED", 48, 48, 3, se2);
        g = enumC1117Hc48;
        i = new EnumC1117Hc0[]{enumC1117Hc0, enumC1117Hc1, enumC1117Hc2, enumC1117Hc3, enumC1117Hc4, enumC1117Hc5, enumC1117Hc6, enumC1117Hc7, enumC1117Hc8, enumC1117Hc9, enumC1117Hc10, enumC1117Hc11, enumC1117Hc12, enumC1117Hc13, enumC1117Hc14, enumC1117Hc15, enumC1117Hc16, enumC1117Hc17, enumC1117Hc18, enumC1117Hc19, enumC1117Hc20, enumC1117Hc21, enumC1117Hc22, enumC1117Hc23, enumC1117Hc24, enumC1117Hc25, enumC1117Hc26, enumC1117Hc27, enumC1117Hc28, enumC1117Hc29, enumC1117Hc30, enumC1117Hc31, enumC1117Hc32, enumC1117Hc33, enumC1117Hc34, enumC1117Hc35, enumC1117Hc36, enumC1117Hc37, enumC1117Hc38, enumC1117Hc39, enumC1117Hc40, enumC1117Hc41, enumC1117Hc42, enumC1117Hc43, enumC1117Hc44, enumC1117Hc45, enumC1117Hc46, enumC1117Hc47, enumC1117Hc48, new EnumC1117Hc0("GROUP_LIST", 49, 49, 2, se6), new EnumC1117Hc0("MAP", 50, 50, 4, SE0.VOID)};
        EnumC1117Hc0[] enumC1117Hc0ArrValues = values();
        h = new EnumC1117Hc0[enumC1117Hc0ArrValues.length];
        for (EnumC1117Hc0 enumC1117Hc49 : enumC1117Hc0ArrValues) {
            h[enumC1117Hc49.d] = enumC1117Hc49;
        }
    }

    public EnumC1117Hc0(String str, int i2, int i3, int i4, SE0 se0) {
        super(str, i2);
        this.d = i3;
        int iG = C1039Gc0.g(i4);
        if (iG == 1 || iG == 3) {
            se0.getClass();
        }
        if (i4 == 1) {
            se0.ordinal();
        }
    }

    public static EnumC1117Hc0 valueOf(String str) {
        return (EnumC1117Hc0) Enum.valueOf(EnumC1117Hc0.class, str);
    }

    public static EnumC1117Hc0[] values() {
        return (EnumC1117Hc0[]) i.clone();
    }
}
