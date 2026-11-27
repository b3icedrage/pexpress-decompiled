package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class CW0 {
    public static final InterfaceC7625xW0 a;
    public static final AW0 b;

    static {
        InterfaceC7625xW0 interfaceC7625xW0;
        try {
            interfaceC7625xW0 = (InterfaceC7625xW0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            interfaceC7625xW0 = null;
        }
        a = interfaceC7625xW0;
        b = new AW0();
    }
}
