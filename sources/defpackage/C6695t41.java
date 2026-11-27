package defpackage;

/* JADX INFO: renamed from: t41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6695t41 {
    public static final InterfaceC5856p41 a;
    public static final C6275r41 b;

    static {
        InterfaceC5856p41 interfaceC5856p41;
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        try {
            interfaceC5856p41 = (InterfaceC5856p41) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            interfaceC5856p41 = null;
        }
        a = interfaceC5856p41;
        b = new C6275r41();
    }
}
