package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1281Jf {

    @NotNull
    public final GP1 a;

    @NotNull
    public final Set<InterfaceC0735Cf> b;

    @NotNull
    public final InterfaceC1777Pn1 c;
    public boolean d;

    @NotNull
    public final EM e;

    @NotNull
    public final ConcurrentHashMap<InterfaceC0735Cf, XF0> f;

    public C1281Jf(@NotNull GP1 starterObservable, @NotNull Set updaters, @NotNull InterfaceC1777Pn1 readyToStartUpdatersProvider, boolean z) {
        Intrinsics.checkNotNullParameter(starterObservable, "starterObservable");
        Intrinsics.checkNotNullParameter(updaters, "updaters");
        Intrinsics.checkNotNullParameter(readyToStartUpdatersProvider, "readyToStartUpdatersProvider");
        this.a = starterObservable;
        this.b = updaters;
        this.c = readyToStartUpdatersProvider;
        this.e = LN.a(CoroutineContext.Element.a.c(C0564Aa.a(), C6266r20.a).t(new C1047Gf(EN.a.d)));
        this.f = new ConcurrentHashMap<>();
        if (z) {
            readyToStartUpdatersProvider.a(new C0813Df(0, this, C1281Jf.class, "anyUpdaterDead", "anyUpdaterDead()Z", 0));
        }
        C5189lv.k(C3784fT.a, null, new C0891Ef(this, null), 3);
    }

    public final void a() {
        this.f.clear();
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0735Cf) it.next()).stop();
        }
        ED.e(this.e.d);
        this.d = false;
    }
}
