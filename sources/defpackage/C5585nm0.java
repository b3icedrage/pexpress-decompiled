package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5585nm0 extends g {

    @NotNull
    public static final C5585nm0 c = new C5585nm0();
    public static final a b = a.d;

    /* JADX INFO: renamed from: nm0$a */
    public static final class a implements FP0 {
        public static final a d = new a();

        @Override // defpackage.FP0
        @NotNull
        public final g getLifecycle() {
            return C5585nm0.c;
        }
    }

    @Override // androidx.lifecycle.g
    public final void a(@NotNull EP0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!(observer instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) observer;
        a aVar = b;
        defaultLifecycleObserver.onCreate(aVar);
        defaultLifecycleObserver.onStart(aVar);
        defaultLifecycleObserver.onResume(aVar);
    }

    @Override // androidx.lifecycle.g
    @NotNull
    public final g.b b() {
        return g.b.i;
    }

    @Override // androidx.lifecycle.g
    public final void c(@NotNull EP0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
    }

    @NotNull
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
