package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NA implements JA {

    @NotNull
    public final GP1 a = C1589Ne.i(-1L);

    @Override // defpackage.JA
    public final void a(long j) {
        Long lValueOf = Long.valueOf(j);
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, lValueOf);
    }

    @Override // defpackage.JA
    @NotNull
    public final C1929Rm0 b() {
        return new C1929Rm0(this.a);
    }

    @Override // defpackage.JA
    public final long c(@NotNull JQ bet) {
        Intrinsics.checkNotNullParameter(bet, "bet");
        return bet.b - ((Number) this.a.getValue()).longValue();
    }

    @Override // defpackage.JA
    public final long d(@NotNull JQ bet) {
        Intrinsics.checkNotNullParameter(bet, "bet");
        return bet.a - ((Number) this.a.getValue()).longValue();
    }

    @Override // defpackage.JA
    public final float e(long j) {
        return j - ((Number) this.a.getValue()).longValue();
    }

    @Override // defpackage.JA
    @NotNull
    public final List f(@NotNull ArrayList entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        C7439wd0 c7439wd0H = JH1.h(JH1.m(CollectionsKt.y(entries), new KA(this, 0)), new LA(0));
        C1829Qf selector = new C1829Qf(1);
        Intrinsics.checkNotNullParameter(c7439wd0H, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return JH1.p(JH1.m(new H20(c7439wd0H, selector), new MA(0)));
    }

    @Override // defpackage.JA
    public final void g(@NotNull C2202Uz0 function) {
        GP1 gp1;
        Object value;
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            gp1 = this.a;
            value = gp1.getValue();
        } while (!gp1.d(value, function.invoke(value)));
    }
}
