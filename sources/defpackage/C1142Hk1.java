package defpackage;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: Hk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142Hk1 {
    public final HashMap a;
    public final HashMap b;
    public final C1064Gk1 c;

    /* JADX INFO: renamed from: Hk1$a */
    public static final class a implements F60<a> {
        public static final C1064Gk1 a = new C1064Gk1();
    }

    public C1142Hk1(HashMap map, HashMap map2, C1064Gk1 c1064Gk1) {
        this.a = map;
        this.b = map2;
        this.c = c1064Gk1;
    }

    public final void a(@NonNull Object obj, @NonNull ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.b;
        HashMap map2 = this.a;
        C0986Fk1 c0986Fk1 = new C0986Fk1(byteArrayOutputStream, map2, map, this.c);
        if (obj == null) {
            return;
        }
        K71 k71 = (K71) map2.get(obj.getClass());
        if (k71 != null) {
            k71.a(obj, c0986Fk1);
        } else {
            throw new I60("No encoder for " + obj.getClass());
        }
    }
}
