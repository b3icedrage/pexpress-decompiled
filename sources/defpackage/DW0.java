package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class DW0 {
    public static final InterfaceC7835yW0 a;
    public static final BW0 b;

    static {
        InterfaceC7835yW0 interfaceC7835yW0;
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        try {
            interfaceC7835yW0 = (InterfaceC7835yW0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            interfaceC7835yW0 = null;
        }
        a = interfaceC7835yW0;
        b = new BW0();
    }
}
