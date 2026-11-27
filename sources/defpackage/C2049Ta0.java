package defpackage;

/* JADX INFO: renamed from: Ta0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2049Ta0 {
    public static final C1893Ra0 a = new C1893Ra0();
    public static final AbstractC1737Pa0<?> b;

    static {
        AbstractC1737Pa0<?> abstractC1737Pa0;
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        try {
            abstractC1737Pa0 = (AbstractC1737Pa0) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC1737Pa0 = null;
        }
        b = abstractC1737Pa0;
    }
}
