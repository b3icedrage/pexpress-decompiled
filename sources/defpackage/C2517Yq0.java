package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2517Yq0 {

    @NotNull
    public static final Set<C1629Nq0> a;

    @NotNull
    public static final FS0 b;

    static {
        C1629Nq0 c1629Nq0 = C1629Nq0.b;
        C1629Nq0[] elements = {C1629Nq0.b, C1629Nq0.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
        b = C6561sS.f("io.ktor.client.plugins.HttpRedirect");
    }

    public static final boolean a(C0850Dr0 c0850Dr0) {
        int i = c0850Dr0.d;
        return i == C0850Dr0.g.d || i == C0850Dr0.h.d || i == C0850Dr0.j.d || i == C0850Dr0.k.d || i == C0850Dr0.i.d;
    }
}
