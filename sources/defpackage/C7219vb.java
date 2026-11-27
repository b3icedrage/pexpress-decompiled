package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7219vb {

    @NotNull
    public final Context a;

    @NotNull
    public final DS0 b;

    @Nullable
    public C7009ub.b c;

    /* JADX INFO: renamed from: vb$a */
    public final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C7009ub.b bVar = C7219vb.this.c;
            if (bVar != null) {
                C3595ea c3595ea = bVar.a;
                c3595ea.l.a("AndroidNetworkListener, onNetworkAvailable.");
                c3595ea.a.q = Boolean.FALSE;
                c3595ea.b();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            C7009ub.b bVar = C7219vb.this.c;
            if (bVar != null) {
                C3595ea c3595ea = bVar.a;
                c3595ea.l.a("AndroidNetworkListener, onNetworkUnavailable.");
                c3595ea.a.q = Boolean.TRUE;
            }
        }
    }

    public C7219vb(@NotNull Context context, @NotNull DS0 logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = context;
        this.b = logger;
    }
}
