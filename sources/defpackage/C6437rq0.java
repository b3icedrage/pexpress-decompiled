package defpackage;

import java.util.Objects;

/* JADX INFO: renamed from: rq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6437rq0 extends RuntimeException {
    public final int d;
    public final String e;
    public final transient C0935Et1<?> g;

    public C6437rq0(C0935Et1<?> c0935Et1) {
        Objects.requireNonNull(c0935Et1, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        C0857Dt1 c0857Dt1 = c0935Et1.a;
        sb.append(c0857Dt1.h);
        sb.append(" ");
        sb.append(c0857Dt1.g);
        super(sb.toString());
        this.d = c0857Dt1.h;
        this.e = c0857Dt1.g;
        this.g = c0935Et1;
    }
}
