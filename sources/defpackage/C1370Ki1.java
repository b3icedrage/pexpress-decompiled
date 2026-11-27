package defpackage;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ki1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1370Ki1 implements InterfaceC1292Ji1 {

    @Nullable
    public C1100Gw1 a;

    @Override // defpackage.InterfaceC1292Ji1
    public final void a(@NotNull InterfaceC7441wd2 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = binding instanceof C1100Gw1 ? (C1100Gw1) binding : null;
    }

    @Override // defpackage.InterfaceC1292Ji1
    @NotNull
    public final List<View> b() {
        C1100Gw1 c1100Gw1 = this.a;
        if (c1100Gw1 != null) {
            List<View> listF = WE.f(c1100Gw1.o, c1100Gw1.n, c1100Gw1.p, c1100Gw1.u, c1100Gw1.m);
            if (listF != null) {
                return listF;
            }
        }
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC1292Ji1
    @NotNull
    public final List<ShimmerFrameLayout> c() {
        List<ShimmerFrameLayout> listF;
        C1100Gw1 c1100Gw1 = this.a;
        return (c1100Gw1 == null || (listF = WE.f(c1100Gw1.t, c1100Gw1.s)) == null) ? C5653o60.d : listF;
    }
}
