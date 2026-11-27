package defpackage;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Si1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1996Si1 implements InterfaceC1918Ri1 {

    @NotNull
    public final InterfaceC0565Aa0 a;

    @Nullable
    public InterfaceC1292Ji1 b;

    public C1996Si1(@NotNull InterfaceC0565Aa0 experimentsProviderApi) {
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.a = experimentsProviderApi;
    }

    @Override // defpackage.InterfaceC1918Ri1
    @Nullable
    public final Unit a(@NotNull InterfaceC1292Ji1 interfaceC1292Ji1) {
        this.b = interfaceC1292Ji1;
        b(true);
        b(false);
        Unit unit = Unit.a;
        MN mn = MN.d;
        return unit;
    }

    public final void b(boolean z) {
        InterfaceC1292Ji1 interfaceC1292Ji1 = this.b;
        if (interfaceC1292Ji1 != null) {
            Iterator<T> it = interfaceC1292Ji1.c().iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) it.next();
                if (z) {
                    shimmerFrameLayout.b();
                } else {
                    shimmerFrameLayout.c();
                }
                if (!z) {
                    i = 8;
                }
                shimmerFrameLayout.setVisibility(i);
            }
            Iterator<T> it2 = interfaceC1292Ji1.b().iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(z ? 4 : 0);
            }
        }
    }
}
