package defpackage;

import io.sentry.protocol.E;
import io.sentry.protocol.u;
import io.sentry.util.A;
import io.sentry.util.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4804k42 extends C3561eO1 {

    @NotNull
    public static final E w = E.CUSTOM;

    @NotNull
    public String t;

    @NotNull
    public E u;

    @Nullable
    public L02 v;

    public C4804k42(@NotNull String str, @NotNull String str2) {
        this(str, E.CUSTOM, str2, null);
    }

    public static C4804k42 b(@NotNull C5364mj1 c5364mj1) {
        c5364mj1.getClass();
        C2171Up c2171Up = c5364mj1.c;
        Double d = c2171Up.c;
        C4804k42 c4804k42 = new C4804k42(c5364mj1.a, c5364mj1.b, "default", (C4401iO1) null);
        c4804k42.t = "<unlabeled transaction>";
        c4804k42.v = null;
        c4804k42.u = w;
        c4804k42.q = A.a(c2171Up, null, null, null);
        return c4804k42;
    }

    public C4804k42(@NotNull String str, @NotNull E e, @NotNull String str2, @Nullable L02 l02) {
        super(new u(), new C4401iO1(), str2, null);
        p.b(str, "name is required");
        this.t = str;
        this.u = e;
        a(l02);
        this.q = A.a(null, l02 == null ? null : l02.a, l02 == null ? null : l02.b, l02 == null ? null : l02.c);
    }
}
