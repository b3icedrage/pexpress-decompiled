package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import defpackage.C7219vb.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7009ub implements InterfaceC5978pf1 {
    public C6799tb d;
    public C7219vb e;

    /* JADX INFO: renamed from: ub$a */
    @InterfaceC3368dU(c = "com.amplitude.android.plugins.AndroidNetworkConnectivityCheckerPlugin$setup$1", f = "AndroidNetworkConnectivityCheckerPlugin.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ C3595ea d;
        public final /* synthetic */ C7009ub e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3595ea c3595ea, C7009ub c7009ub, JM<? super a> jm) {
            super(2, jm);
            this.d = c3595ea;
            this.e = c7009ub;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.d, this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3595ea c3595ea = this.d;
            C6799tb c6799tb = this.e.d;
            if (c6799tb == null) {
                Intrinsics.l("networkConnectivityChecker");
                throw null;
            }
            DS0 ds0 = c6799tb.b;
            if (c6799tb.c) {
                try {
                    Object systemService = c6799tb.a.getSystemService("connectivity");
                    if (systemService instanceof ConnectivityManager) {
                        Network activeNetwork = ((ConnectivityManager) systemService).getActiveNetwork();
                        z = false;
                        if (activeNetwork != null) {
                            NetworkCapabilities networkCapabilities = ((ConnectivityManager) systemService).getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null) {
                                if (!networkCapabilities.hasTransport(1)) {
                                    if (networkCapabilities.hasTransport(0)) {
                                    }
                                }
                            }
                        }
                    } else {
                        ds0.a("Service is not an instance of ConnectivityManager. Offline mode is not supported");
                    }
                } catch (Throwable th) {
                    ds0.warn("Error checking network connectivity: " + th.getMessage());
                    ds0.warn(J90.b(th));
                }
                z = true;
            } else {
                z = true;
            }
            c3595ea.a.q = Boolean.valueOf(!z);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: ub$b */
    public static final class b {
        public final /* synthetic */ C3595ea a;

        public b(C3595ea c3595ea) {
            this.a = c3595ea;
        }
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void a(@NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        e(amplitude);
        DS0 ds0 = amplitude.l;
        ds0.a("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        MI mi = amplitude.a;
        Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        Context context = mi.a;
        C6799tb c6799tb = new C6799tb(context, ds0);
        Intrinsics.checkNotNullParameter(c6799tb, "<set-?>");
        this.d = c6799tb;
        C5189lv.k(amplitude.c, amplitude.f, new a(amplitude, this, null), 2);
        b callback = new b(amplitude);
        C7219vb c7219vb = new C7219vb(context, ds0);
        Intrinsics.checkNotNullParameter(c7219vb, "<set-?>");
        this.e = c7219vb;
        Intrinsics.checkNotNullParameter(callback, "callback");
        c7219vb.c = callback;
        C7219vb c7219vb2 = this.e;
        if (c7219vb2 == null) {
            Intrinsics.l("networkListener");
            throw null;
        }
        try {
            Object systemService = c7219vb2.a.getSystemService("connectivity");
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            C7219vb.a aVar = c7219vb2.new a();
            Intrinsics.checkNotNull(aVar);
            ((ConnectivityManager) systemService).registerNetworkCallback(networkRequestBuild, aVar);
        } catch (Throwable th) {
            c7219vb2.b.warn("Error starting network listener: " + th.getMessage());
        }
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void e(@NotNull C3595ea c3595ea) {
        Intrinsics.checkNotNullParameter(c3595ea, "<set-?>");
    }

    @Override // defpackage.InterfaceC5978pf1
    @NotNull
    public final InterfaceC5978pf1.a getType() {
        return InterfaceC5978pf1.a.d;
    }
}
