package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2316Wk {

    @NotNull
    public final String a;

    @NotNull
    public final InterfaceC3220cl b;

    @NotNull
    public final InterfaceC5790ol c;
    public int d;
    public int e;

    public C2316Wk(@NotNull String flow, @NotNull InterfaceC3220cl attempt) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(attempt, "attempt");
        this.a = flow;
        this.b = attempt;
        this.c = attempt.d("captcha");
        attempt.b("captcha.outcome", "shown");
    }

    public final void a(String str, String str2) {
        InterfaceC3220cl attempt = this.b;
        attempt.b("captcha.outcome", str);
        this.c.a(false);
        ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap = C3430dl.a;
        String flow = this.a;
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(attempt, "attempt");
        C3430dl.a.remove(flow, attempt);
        InterfaceC3220cl.a.a(attempt, EnumC4737jl.g, "captcha", null, 4);
        C1730Oy.a(str2, EnumC0936Eu.d, PW0.e(new Pair("flow", flow), new Pair("outcome", str)));
    }
}
