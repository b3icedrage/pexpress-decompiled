package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class W80 implements InterfaceC5541nb0<U80> {

    public static final class a {
        public static final W80 a = new W80();
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C7270vo c7270vo = U80.a;
        if (c7270vo != null) {
            return c7270vo;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
