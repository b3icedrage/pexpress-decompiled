package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: no1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5593no1 {

    @NotNull
    public final C3233co1 a;

    @NotNull
    public final ArrayList b;
    public final int c;

    @Nullable
    public final K90 d;

    @NotNull
    public final C4543is1 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public C5593no1(@NotNull C3233co1 call, @NotNull ArrayList interceptors, int i, @Nullable K90 k90, @NotNull C4543is1 request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.a = call;
        this.b = interceptors;
        this.c = i;
        this.d = k90;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static C5593no1 a(C5593no1 c5593no1, int i, K90 k90, C4543is1 c4543is1, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = c5593no1.c;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            k90 = c5593no1.d;
        }
        K90 k91 = k90;
        if ((i5 & 4) != 0) {
            c4543is1 = c5593no1.e;
        }
        C4543is1 request = c4543is1;
        if ((i5 & 8) != 0) {
            i2 = c5593no1.f;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = c5593no1.g;
        }
        int i8 = i3;
        int i9 = (i5 & 32) != 0 ? c5593no1.h : i4;
        c5593no1.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new C5593no1(c5593no1.a, c5593no1.b, i6, k91, request, i7, i8, i9);
    }

    @NotNull
    public final C0857Dt1 b(@NotNull C4543is1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        K90 k90 = this.d;
        if (k90 != null) {
            if (!k90.c.b(request.a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        C5593no1 c5593no1A = a(this, i2, null, request, 0, 0, 0, 58);
        UB0 ub0 = (UB0) arrayList.get(i);
        C0857Dt1 c0857Dt1A = ub0.a(c5593no1A);
        if (c0857Dt1A == null) {
            throw new NullPointerException("interceptor " + ub0 + " returned null");
        }
        if (k90 != null && i2 < arrayList.size() && c5593no1A.i != 1) {
            throw new IllegalStateException(("network interceptor " + ub0 + " must call proceed() exactly once").toString());
        }
        if (c0857Dt1A.k != null) {
            return c0857Dt1A;
        }
        throw new IllegalStateException(("interceptor " + ub0 + " returned a response with no body").toString());
    }
}
