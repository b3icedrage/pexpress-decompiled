package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K01 {
    public final J11 a;
    public final a b;

    public static class a {
        public final HashMap a = new HashMap();

        /* JADX INFO: renamed from: K01$a$a, reason: collision with other inner class name */
        public static class C0069a<Model> {
            public final List<I01<Model, ?>> a;

            public C0069a(List<I01<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public K01(@NonNull C5751ob0.c cVar) {
        J11 j11 = new J11(cVar);
        this.b = new a();
        this.a = j11;
    }
}
