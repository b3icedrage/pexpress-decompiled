package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: hW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4214hW0 {
    public static final a b = new a();
    public final b a;

    /* JADX INFO: renamed from: hW0$a */
    public class a implements DZ0 {
        @Override // defpackage.DZ0
        public final BZ0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // defpackage.DZ0
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: hW0$b */
    public static class b implements DZ0 {
        public DZ0[] a;

        @Override // defpackage.DZ0
        public final BZ0 a(Class<?> cls) {
            for (DZ0 dz0 : this.a) {
                if (dz0.b(cls)) {
                    return dz0.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // defpackage.DZ0
        public final boolean b(Class<?> cls) {
            for (DZ0 dz0 : this.a) {
                if (dz0.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C4214hW0() {
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        DZ0 dz0 = b;
        try {
            dz0 = (DZ0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        DZ0[] dz0Arr = {C7887yk0.a, dz0};
        b bVar = new b();
        bVar.a = dz0Arr;
        Charset charset = VB0.a;
        this.a = bVar;
    }
}
