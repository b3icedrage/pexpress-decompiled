package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class HQ0 {
    public static final FQ0 a;
    public static final GQ0 b;

    static {
        FQ0 fq0;
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        try {
            fq0 = (FQ0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            fq0 = null;
        }
        a = fq0;
        b = new GQ0();
    }
}
