package defpackage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Fi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979Fi0 extends FragmentManager.FragmentLifecycleCallbacks {
    public static final C6170qb f = C6170qb.d();
    public final WeakHashMap<Fragment, Trace> a = new WeakHashMap<>();
    public final C5207m b;
    public final C2872b52 c;
    public final C2567Zh d;
    public final C2571Zi0 e;

    public C0979Fi0(C5207m c5207m, C2872b52 c2872b52, C2567Zh c2567Zh, C2571Zi0 c2571Zi0) {
        this.b = c5207m;
        this.c = c2872b52;
        this.d = c2567Zh;
        this.e = c2571Zi0;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        C2745aa1 c2745aa1;
        super.onFragmentPaused(fragmentManager, fragment);
        Object[] objArr = {fragment.getClass().getSimpleName()};
        C6170qb c6170qb = f;
        c6170qb.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<Fragment, Trace> weakHashMap = this.a;
        if (!weakHashMap.containsKey(fragment)) {
            c6170qb.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        C2571Zi0 c2571Zi0 = this.e;
        boolean z = c2571Zi0.d;
        C6170qb c6170qb2 = C2571Zi0.e;
        if (z) {
            HashMap map = c2571Zi0.c;
            if (map.containsKey(fragment)) {
                C2493Yi0 c2493Yi0 = (C2493Yi0) map.remove(fragment);
                C2745aa1<C2493Yi0> c2745aa1A = c2571Zi0.a();
                if (c2745aa1A.b()) {
                    C2493Yi0 c2493Yi0A = c2745aa1A.a();
                    c2493Yi0A.getClass();
                    c2745aa1 = new C2745aa1(new C2493Yi0(c2493Yi0A.a - c2493Yi0.a, c2493Yi0A.b - c2493Yi0.b, c2493Yi0A.c - c2493Yi0.c));
                } else {
                    c6170qb2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                    c2745aa1 = new C2745aa1();
                }
            } else {
                c6170qb2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
                c2745aa1 = new C2745aa1();
            }
        } else {
            c6170qb2.a();
            c2745aa1 = new C2745aa1();
        }
        if (!c2745aa1.b()) {
            c6170qb.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            C3531eE1.a(trace, (C2493Yi0) c2745aa1.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.a.put(fragment, trace);
        C2571Zi0 c2571Zi0 = this.e;
        boolean z = c2571Zi0.d;
        C6170qb c6170qb = C2571Zi0.e;
        if (!z) {
            c6170qb.a();
            return;
        }
        HashMap map = c2571Zi0.c;
        if (map.containsKey(fragment)) {
            c6170qb.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        C2745aa1<C2493Yi0> c2745aa1A = c2571Zi0.a();
        if (c2745aa1A.b()) {
            map.put(fragment, c2745aa1A.a());
        } else {
            c6170qb.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
