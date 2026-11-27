package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6739tH0 {

    @NotNull
    public Object[] a;

    @NotNull
    public int[] b;
    public int c;

    /* JADX INFO: renamed from: tH0$a */
    public static final class a {

        @NotNull
        public static final a a = new a();
    }

    @NotNull
    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.a[i2];
            if (obj instanceof MH1) {
                MH1 mh1 = (MH1) obj;
                if (!Intrinsics.a(mh1.h(), RS1.b.a)) {
                    int i3 = this.b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(mh1.f(i3));
                    }
                } else if (this.b[i2] != -1) {
                    sb.append("[");
                    sb.append(this.b[i2]);
                    sb.append("]");
                }
            } else if (obj != a.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String toString() {
        return a();
    }
}
