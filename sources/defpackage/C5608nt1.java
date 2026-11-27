package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: nt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5608nt1 {
    public final ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: nt1$a */
    public static final class a<T> {
        public final Class<T> a;
        public final InterfaceC5398mt1<T> b;

        public a(@NonNull Class<T> cls, @NonNull InterfaceC5398mt1<T> interfaceC5398mt1) {
            this.a = cls;
            this.b = interfaceC5398mt1;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized <Z> InterfaceC5398mt1<Z> a(@NonNull Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.a.get(i);
            if (aVar.a.isAssignableFrom((Class<?>) cls)) {
                return aVar.b;
            }
        }
        return null;
    }
}
