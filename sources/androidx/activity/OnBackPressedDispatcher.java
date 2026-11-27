package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import defpackage.C2784ak0;
import defpackage.C3238cq0;
import defpackage.C3265cz0;
import defpackage.C4751jp;
import defpackage.C6202qj;
import defpackage.C7034uh0;
import defpackage.FP0;
import defpackage.InterfaceC5831oy;
import defpackage.L81;
import defpackage.M81;
import defpackage.O81;
import defpackage.ZS;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    @Nullable
    public final Runnable a;

    @NotNull
    public final C6202qj<L81> b;

    @Nullable
    public L81 c;

    @Nullable
    public final OnBackInvokedCallback d;

    @Nullable
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/k;", "Loy;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LifecycleOnBackPressedCancellable implements k, InterfaceC5831oy {

        @NotNull
        public final g d;

        @NotNull
        public final L81 e;

        @Nullable
        public c g;
        public final /* synthetic */ OnBackPressedDispatcher h;

        public LifecycleOnBackPressedCancellable(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @NotNull g lifecycle, L81 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.h = onBackPressedDispatcher;
            this.d = lifecycle;
            this.e = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.lifecycle.k
        public final void b(@NotNull FP0 source, @NotNull g.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event != g.a.ON_START) {
                if (event != g.a.ON_STOP) {
                    if (event == g.a.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    c cVar = this.g;
                    if (cVar != null) {
                        cVar.cancel();
                        return;
                    }
                    return;
                }
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.h;
            onBackPressedDispatcher.getClass();
            L81 onBackPressedCallback = this.e;
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            onBackPressedDispatcher.b.addLast(onBackPressedCallback);
            c cancellable = new c(onBackPressedDispatcher, onBackPressedCallback);
            Intrinsics.checkNotNullParameter(cancellable, "cancellable");
            onBackPressedCallback.b.add(cancellable);
            onBackPressedDispatcher.e();
            onBackPressedCallback.c = new O81(0, onBackPressedDispatcher, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
            this.g = cancellable;
        }

        @Override // defpackage.InterfaceC5831oy
        public final void cancel() {
            this.d.c(this);
            L81 l81 = this.e;
            l81.getClass();
            Intrinsics.checkNotNullParameter(this, "cancellable");
            l81.b.remove(this);
            c cVar = this.g;
            if (cVar != null) {
                cVar.cancel();
            }
            this.g = null;
        }
    }

    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public final OnBackInvokedCallback a(@NotNull final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: N81
                public final void onBackInvoked() {
                    Function0 onBackInvoked2 = onBackInvoked;
                    Intrinsics.checkNotNullParameter(onBackInvoked2, "$onBackInvoked");
                    onBackInvoked2.invoke();
                }
            };
        }

        public final void b(@NotNull Object dispatcher, int i, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        public final void c(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class b {

        @NotNull
        public static final b a = new b();

        public static final class a implements OnBackAnimationCallback {
            public final /* synthetic */ Function1<C4751jp, Unit> a;
            public final /* synthetic */ Function1<C4751jp, Unit> b;
            public final /* synthetic */ Function0<Unit> c;
            public final /* synthetic */ Function0<Unit> d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super C4751jp, Unit> function1, Function1<? super C4751jp, Unit> function2, Function0<Unit> function0, Function0<Unit> function3) {
                this.a = function1;
                this.b = function2;
                this.c = function0;
                this.d = function3;
            }

            public final void onBackCancelled() {
                this.d.invoke();
            }

            public final void onBackInvoked() {
                this.c.invoke();
            }

            public final void onBackProgressed(@NotNull BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.b.invoke(new C4751jp(backEvent));
            }

            public final void onBackStarted(@NotNull BackEvent backEvent) {
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                this.a.invoke(new C4751jp(backEvent));
            }
        }

        @NotNull
        public final OnBackInvokedCallback a(@NotNull Function1<? super C4751jp, Unit> onBackStarted, @NotNull Function1<? super C4751jp, Unit> onBackProgressed, @NotNull Function0<Unit> onBackInvoked, @NotNull Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    public final class c implements InterfaceC5831oy {

        @NotNull
        public final L81 d;
        public final /* synthetic */ OnBackPressedDispatcher e;

        public c(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, L81 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.e = onBackPressedDispatcher;
            this.d = onBackPressedCallback;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [ak0, kotlin.jvm.functions.Function0] */
        @Override // defpackage.InterfaceC5831oy
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.e;
            C6202qj<L81> c6202qj = onBackPressedDispatcher.b;
            L81 l81 = this.d;
            c6202qj.remove(l81);
            if (Intrinsics.a(onBackPressedDispatcher.c, l81)) {
                l81.getClass();
                onBackPressedDispatcher.c = null;
            }
            l81.getClass();
            Intrinsics.checkNotNullParameter(this, "cancellable");
            l81.b.remove(this);
            ?? r0 = l81.c;
            if (r0 != 0) {
                r0.invoke();
            }
            l81.c = null;
        }
    }

    public /* synthetic */ class d extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((OnBackPressedDispatcher) this.e).e();
            return Unit.a;
        }
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.a = runnable;
        this.b = new C6202qj<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? b.a.a(new M81(this), new ZS(this, 1), new C3265cz0(this, 3), new C3238cq0(this, 3)) : a.a.a(new C7034uh0(this, 1));
        }
    }

    public final void a(@NotNull FP0 owner, @NotNull L81 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        g lifecycle = owner.getLifecycle();
        if (lifecycle.b() == g.b.d) {
            return;
        }
        LifecycleOnBackPressedCancellable cancellable = new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback);
        onBackPressedCallback.getClass();
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.b.add(cancellable);
        e();
        onBackPressedCallback.c = new d(0, this, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final void b() {
        L81 l81Previous;
        if (this.c == null) {
            C6202qj<L81> c6202qj = this.b;
            ListIterator<L81> listIterator = c6202qj.listIterator(c6202qj.size());
            do {
                if (!listIterator.hasPrevious()) {
                    l81Previous = null;
                    break;
                }
                l81Previous = listIterator.previous();
            } while (!l81Previous.a);
        }
        this.c = null;
    }

    public final void c() {
        L81 l81Previous;
        L81 l81 = this.c;
        if (l81 == null) {
            C6202qj<L81> c6202qj = this.b;
            ListIterator<L81> listIterator = c6202qj.listIterator(c6202qj.getE());
            do {
                if (!listIterator.hasPrevious()) {
                    l81Previous = null;
                    break;
                }
                l81Previous = listIterator.previous();
            } while (!l81Previous.a);
            l81 = l81Previous;
        }
        this.c = null;
        if (l81 != null) {
            l81.a();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        a aVar = a.a;
        if (z && !this.f) {
            aVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            aVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z = this.g;
        boolean z2 = false;
        C6202qj<L81> c6202qj = this.b;
        if (c6202qj == null || !c6202qj.isEmpty()) {
            Iterator<L81> it = c6202qj.iterator();
            while (it.hasNext()) {
                if (it.next().a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }

    public OnBackPressedDispatcher() {
        this(null);
    }
}
