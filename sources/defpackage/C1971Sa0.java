package defpackage;

/* JADX INFO: renamed from: Sa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1971Sa0 {
    public static final C1815Qa0 a = new C1815Qa0();
    public static final AbstractC1659Oa0<?> b;

    static {
        AbstractC1659Oa0<?> abstractC1659Oa0;
        try {
            abstractC1659Oa0 = (AbstractC1659Oa0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC1659Oa0 = null;
        }
        b = abstractC1659Oa0;
    }
}
