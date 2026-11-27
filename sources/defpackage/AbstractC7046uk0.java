package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7046uk0 {

    @NotNull
    public final Handler a;

    @NotNull
    public final Executor b;

    @NotNull
    public final Executor c;

    public AbstractC7046uk0(@NotNull InterfaceC5889pD1 schedulers, @NotNull String name) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = new Handler(Looper.getMainLooper());
        this.b = schedulers.d(name);
        this.c = schedulers.b();
    }
}
