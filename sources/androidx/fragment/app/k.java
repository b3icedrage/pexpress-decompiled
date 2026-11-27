package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    @NonNull
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();

    @NonNull
    public final FragmentManager b;

    public static final class a {

        @NonNull
        public final FragmentManager.FragmentLifecycleCallbacks a;
        public final boolean b;

        public a(@NonNull FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.a = fragmentLifecycleCallbacks;
            this.b = z;
        }
    }

    public k(@NonNull FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public final void a(@NonNull Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.a(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void b(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        g gVar = fragmentManager.u.e;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.b(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentAttached(fragmentManager, fragment, gVar);
            }
        }
    }

    public final void c(@NonNull Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.c(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void d(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.d(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void e(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.e(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentDetached(fragmentManager, fragment);
            }
        }
    }

    public final void f(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.f(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    public final void g(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        g gVar = fragmentManager.u.e;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.g(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentPreAttached(fragmentManager, fragment, gVar);
            }
        }
    }

    public final void h(@NonNull Fragment fragment, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.h(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void i(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.i(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentResumed(fragmentManager, fragment);
            }
        }
    }

    public final void j(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.j(fragment, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void k(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.k(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentStarted(fragmentManager, fragment);
            }
        }
    }

    public final void l(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.l(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentStopped(fragmentManager, fragment);
            }
        }
    }

    public final void m(@NonNull Fragment fragment, @NonNull View view, Bundle bundle, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.m(fragment, view, bundle, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    }

    public final void n(@NonNull Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Fragment fragment2 = fragmentManager.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.n(fragment, true);
        }
        for (a aVar : this.a) {
            if (!z || aVar.b) {
                aVar.a.onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }
    }
}
