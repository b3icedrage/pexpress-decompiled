package androidx.lifecycle;

import android.os.Handler;
import defpackage.KP0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    @NotNull
    public final l a;

    @NotNull
    public final Handler b;

    @Nullable
    public a c;

    public static final class a implements Runnable {

        @NotNull
        public final l d;

        @NotNull
        public final g.a e;
        public boolean g;

        public a(@NotNull l registry, @NotNull g.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.d = registry;
            this.e = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.g) {
                return;
            }
            this.d.f(this.e);
            this.g = true;
        }
    }

    public u(@NotNull KP0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.a = new l(provider);
        this.b = new Handler();
    }

    public final void a(g.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        Handler handler = this.b;
        Intrinsics.checkNotNull(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
