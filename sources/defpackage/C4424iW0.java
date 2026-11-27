package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: iW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4424iW0 {
    public static final a b = new a();
    public final b a;

    /* JADX INFO: renamed from: iW0$a */
    public static class a implements CZ0 {
        @Override // defpackage.CZ0
        public final AZ0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.CZ0
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: iW0$b */
    public static class b implements CZ0 {
        public CZ0[] a;

        @Override // defpackage.CZ0
        public final AZ0 a(Class<?> cls) {
            for (CZ0 cz0 : this.a) {
                if (cz0.b(cls)) {
                    return cz0.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // defpackage.CZ0
        public final boolean b(Class<?> cls) {
            for (CZ0 cz0 : this.a) {
                if (cz0.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C4424iW0() {
        CZ0 cz0;
        try {
            cz0 = (CZ0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            cz0 = b;
        }
        CZ0[] cz0Arr = {C7677xk0.a, cz0};
        b bVar = new b();
        bVar.a = cz0Arr;
        Charset charset = XB0.a;
        this.a = bVar;
    }
}
