package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class O60 {

    @NotNull
    public final C7121v6 a;
    public final long b;
    public final int c;

    @Nullable
    public Long d;

    @Nullable
    public String e;
    public int f;
    public boolean g;

    public O60(C7121v6 isNetworkAvailable) {
        C7242vg2.c now = C7242vg2.c.m;
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(isNetworkAvailable, "isNetworkAvailable");
        this.a = isNetworkAvailable;
        this.b = 30000L;
        this.c = 3;
    }

    public final void a(String str) {
        if (str == null || !((Boolean) this.a.invoke()).booleanValue()) {
            return;
        }
        if (!str.equals(this.e)) {
            this.e = str;
            this.f = 0;
        }
        this.f++;
    }
}
