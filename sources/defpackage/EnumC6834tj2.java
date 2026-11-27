package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: tj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class EnumC6834tj2 {
    public static final a g;
    public static final b h;
    public static final c i;
    public static final /* synthetic */ EnumC6834tj2[] j;
    public final EnumC7885yj2 d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6834tj2 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6834tj2 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6834tj2 EF12;

    /* JADX INFO: renamed from: tj2$a */
    public final enum a extends EnumC6834tj2 {
    }

    /* JADX INFO: renamed from: tj2$b */
    public final enum b extends EnumC6834tj2 {
    }

    /* JADX INFO: renamed from: tj2$c */
    public final enum c extends EnumC6834tj2 {
    }

    /* JADX INFO: renamed from: tj2$d */
    public final enum d extends EnumC6834tj2 {
    }

    static {
        EnumC6834tj2 enumC6834tj2 = new EnumC6834tj2("DOUBLE", 0, EnumC7885yj2.DOUBLE, 1);
        EnumC6834tj2 enumC6834tj3 = new EnumC6834tj2("FLOAT", 1, EnumC7885yj2.FLOAT, 5);
        EnumC7885yj2 enumC7885yj2 = EnumC7885yj2.LONG;
        EnumC6834tj2 enumC6834tj4 = new EnumC6834tj2("INT64", 2, enumC7885yj2, 0);
        EnumC6834tj2 enumC6834tj5 = new EnumC6834tj2("UINT64", 3, enumC7885yj2, 0);
        EnumC7885yj2 enumC7885yj3 = EnumC7885yj2.INT;
        EnumC6834tj2 enumC6834tj6 = new EnumC6834tj2("INT32", 4, enumC7885yj3, 0);
        EnumC6834tj2 enumC6834tj7 = new EnumC6834tj2("FIXED64", 5, enumC7885yj2, 1);
        EnumC6834tj2 enumC6834tj8 = new EnumC6834tj2("FIXED32", 6, enumC7885yj3, 5);
        EnumC6834tj2 enumC6834tj9 = new EnumC6834tj2("BOOL", 7, EnumC7885yj2.BOOLEAN, 0);
        a aVar = new a("STRING", 8, EnumC7885yj2.STRING, 2);
        g = aVar;
        EnumC7885yj2 enumC7885yj4 = EnumC7885yj2.MESSAGE;
        b bVar = new b("GROUP", 9, enumC7885yj4, 3);
        h = bVar;
        c cVar = new c("MESSAGE", 10, enumC7885yj4, 2);
        i = cVar;
        j = new EnumC6834tj2[]{enumC6834tj2, enumC6834tj3, enumC6834tj4, enumC6834tj5, enumC6834tj6, enumC6834tj7, enumC6834tj8, enumC6834tj9, aVar, bVar, cVar, new d("BYTES", 11, EnumC7885yj2.BYTE_STRING, 2), new EnumC6834tj2("UINT32", 12, enumC7885yj3, 0), new EnumC6834tj2("ENUM", 13, EnumC7885yj2.ENUM, 0), new EnumC6834tj2("SFIXED32", 14, enumC7885yj3, 5), new EnumC6834tj2("SFIXED64", 15, enumC7885yj2, 1), new EnumC6834tj2("SINT32", 16, enumC7885yj3, 0), new EnumC6834tj2("SINT64", 17, enumC7885yj2, 0)};
    }

    public EnumC6834tj2(String str, int i2, EnumC7885yj2 enumC7885yj2, int i3) {
        super(str, i2);
        this.d = enumC7885yj2;
        this.e = i3;
    }

    public static EnumC6834tj2 valueOf(String str) {
        return (EnumC6834tj2) Enum.valueOf(EnumC6834tj2.class, str);
    }

    public static EnumC6834tj2[] values() {
        return (EnumC6834tj2[]) j.clone();
    }
}
