package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7893yl2 {
    public final long a;
    public final long b;

    @NotNull
    public final C4596j50 c;

    @Nullable
    public String d;
    public int e;

    @Nullable
    public TimeMark f;

    public C7893yl2() {
        b.a aVar = b.e;
        R40 r40 = R40.SECONDS;
        long jG = c.g(2, r40);
        long jG2 = c.g(30, r40);
        C4596j50 timeSource = new C4596j50(0);
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.a = jG;
        this.b = jG2;
        this.c = timeSource;
    }
}
