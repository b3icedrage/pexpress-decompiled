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
/* JADX INFO: renamed from: vj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class EnumC7254vj2 {
    public static final EnumC7254vj2 g;
    public static final EnumC7254vj2 h;
    public static final b i;
    public static final c j;
    public static final EnumC7254vj2 k;
    public static final /* synthetic */ EnumC7254vj2[] l;
    public final EnumC7675xj2 d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7254vj2 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7254vj2 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7254vj2 EF12;

    /* JADX INFO: renamed from: vj2$a */
    public static enum a extends EnumC7254vj2 {
    }

    /* JADX INFO: renamed from: vj2$b */
    public static enum b extends EnumC7254vj2 {
        @Override // defpackage.EnumC7254vj2
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: renamed from: vj2$c */
    public static enum c extends EnumC7254vj2 {
        @Override // defpackage.EnumC7254vj2
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: renamed from: vj2$d */
    public static enum d extends EnumC7254vj2 {
        @Override // defpackage.EnumC7254vj2
        public final boolean b() {
            return false;
        }
    }

    static {
        EnumC7254vj2 enumC7254vj2 = new EnumC7254vj2("DOUBLE", 0, EnumC7675xj2.DOUBLE, 1);
        EnumC7254vj2 enumC7254vj3 = new EnumC7254vj2("FLOAT", 1, EnumC7675xj2.FLOAT, 5);
        EnumC7675xj2 enumC7675xj2 = EnumC7675xj2.LONG;
        EnumC7254vj2 enumC7254vj4 = new EnumC7254vj2("INT64", 2, enumC7675xj2, 0);
        EnumC7254vj2 enumC7254vj5 = new EnumC7254vj2("UINT64", 3, enumC7675xj2, 0);
        EnumC7675xj2 enumC7675xj3 = EnumC7675xj2.INT;
        EnumC7254vj2 enumC7254vj6 = new EnumC7254vj2("INT32", 4, enumC7675xj3, 0);
        g = enumC7254vj6;
        EnumC7254vj2 enumC7254vj7 = new EnumC7254vj2("FIXED64", 5, enumC7675xj2, 1);
        EnumC7254vj2 enumC7254vj8 = new EnumC7254vj2("FIXED32", 6, enumC7675xj3, 5);
        EnumC7254vj2 enumC7254vj9 = new EnumC7254vj2("BOOL", 7, EnumC7675xj2.BOOLEAN, 0);
        h = enumC7254vj9;
        a aVar = new a("STRING", 8, EnumC7675xj2.STRING, 2);
        EnumC7675xj2 enumC7675xj4 = EnumC7675xj2.MESSAGE;
        b bVar = new b("GROUP", 9, enumC7675xj4, 3);
        i = bVar;
        c cVar = new c("MESSAGE", 10, enumC7675xj4, 2);
        j = cVar;
        d dVar = new d("BYTES", 11, EnumC7675xj2.BYTE_STRING, 2);
        EnumC7254vj2 enumC7254vj10 = new EnumC7254vj2("UINT32", 12, enumC7675xj3, 0);
        EnumC7254vj2 enumC7254vj11 = new EnumC7254vj2("ENUM", 13, EnumC7675xj2.ENUM, 0);
        k = enumC7254vj11;
        l = new EnumC7254vj2[]{enumC7254vj2, enumC7254vj3, enumC7254vj4, enumC7254vj5, enumC7254vj6, enumC7254vj7, enumC7254vj8, enumC7254vj9, aVar, bVar, cVar, dVar, enumC7254vj10, enumC7254vj11, new EnumC7254vj2("SFIXED32", 14, enumC7675xj3, 5), new EnumC7254vj2("SFIXED64", 15, enumC7675xj2, 1), new EnumC7254vj2("SINT32", 16, enumC7675xj3, 0), new EnumC7254vj2("SINT64", 17, enumC7675xj2, 0)};
    }

    public EnumC7254vj2(String str, int i2, EnumC7675xj2 enumC7675xj2, int i3) {
        super(str, i2);
        this.d = enumC7675xj2;
        this.e = i3;
    }

    public static EnumC7254vj2 valueOf(String str) {
        return (EnumC7254vj2) Enum.valueOf(EnumC7254vj2.class, str);
    }

    public static EnumC7254vj2[] values() {
        return (EnumC7254vj2[]) l.clone();
    }

    public boolean b() {
        return !(this instanceof a);
    }
}
