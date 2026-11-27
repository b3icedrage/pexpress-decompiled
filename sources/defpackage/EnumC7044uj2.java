package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: uj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class EnumC7044uj2 {
    public static final EnumC7044uj2 g;
    public static final a h;
    public static final b i;
    public static final /* synthetic */ EnumC7044uj2[] j;
    public final EnumC7465wj2 d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7044uj2 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7044uj2 EF11;

    /* JADX INFO: renamed from: uj2$a */
    public static enum a extends EnumC7044uj2 {
    }

    /* JADX INFO: renamed from: uj2$b */
    public static enum b extends EnumC7044uj2 {
    }

    /* JADX INFO: renamed from: uj2$c */
    public static enum c extends EnumC7044uj2 {
    }

    /* JADX INFO: renamed from: uj2$d */
    public static enum d extends EnumC7044uj2 {
    }

    static {
        EnumC7044uj2 enumC7044uj2 = new EnumC7044uj2("DOUBLE", 0, EnumC7465wj2.DOUBLE, 1);
        EnumC7044uj2 enumC7044uj3 = new EnumC7044uj2("FLOAT", 1, EnumC7465wj2.FLOAT, 5);
        EnumC7465wj2 enumC7465wj2 = EnumC7465wj2.LONG;
        EnumC7044uj2 enumC7044uj4 = new EnumC7044uj2("INT64", 2, enumC7465wj2, 0);
        g = enumC7044uj4;
        EnumC7044uj2 enumC7044uj5 = new EnumC7044uj2("UINT64", 3, enumC7465wj2, 0);
        EnumC7465wj2 enumC7465wj3 = EnumC7465wj2.INT;
        EnumC7044uj2 enumC7044uj6 = new EnumC7044uj2("INT32", 4, enumC7465wj3, 0);
        EnumC7044uj2 enumC7044uj7 = new EnumC7044uj2("FIXED64", 5, enumC7465wj2, 1);
        EnumC7044uj2 enumC7044uj8 = new EnumC7044uj2("FIXED32", 6, enumC7465wj3, 5);
        EnumC7044uj2 enumC7044uj9 = new EnumC7044uj2("BOOL", 7, EnumC7465wj2.BOOLEAN, 0);
        a aVar = new a("STRING", 8, EnumC7465wj2.STRING, 2);
        h = aVar;
        EnumC7465wj2 enumC7465wj4 = EnumC7465wj2.MESSAGE;
        b bVar = new b("GROUP", 9, enumC7465wj4, 3);
        i = bVar;
        j = new EnumC7044uj2[]{enumC7044uj2, enumC7044uj3, enumC7044uj4, enumC7044uj5, enumC7044uj6, enumC7044uj7, enumC7044uj8, enumC7044uj9, aVar, bVar, new c("MESSAGE", 10, enumC7465wj4, 2), new d("BYTES", 11, EnumC7465wj2.BYTE_STRING, 2), new EnumC7044uj2("UINT32", 12, enumC7465wj3, 0), new EnumC7044uj2("ENUM", 13, EnumC7465wj2.ENUM, 0), new EnumC7044uj2("SFIXED32", 14, enumC7465wj3, 5), new EnumC7044uj2("SFIXED64", 15, enumC7465wj2, 1), new EnumC7044uj2("SINT32", 16, enumC7465wj3, 0), new EnumC7044uj2("SINT64", 17, enumC7465wj2, 0)};
    }

    public EnumC7044uj2(String str, int i2, EnumC7465wj2 enumC7465wj2, int i3) {
        super(str, i2);
        this.d = enumC7465wj2;
        this.e = i3;
    }

    public static EnumC7044uj2 valueOf(String str) {
        return (EnumC7044uj2) Enum.valueOf(EnumC7044uj2.class, str);
    }

    public static EnumC7044uj2[] values() {
        return (EnumC7044uj2[]) j.clone();
    }
}
