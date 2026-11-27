package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.AbstractC6155qW0;
import defpackage.BX;
import defpackage.C0823Di0;
import defpackage.C0903Ej;
import defpackage.C1995Si0;
import defpackage.C5345me2;
import defpackage.C6419rl;
import defpackage.Cd2;
import defpackage.FP0;
import defpackage.HT0;
import defpackage.RunnableC0901Ei0;
import defpackage.SP1;
import defpackage.U0;
import defpackage.ViewOnLayoutChangeListenerC0745Ci0;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.e<C1995Si0> implements SP1 {
    public final g d;
    public final FragmentManager e;
    public final HT0<Fragment> f;
    public final HT0<Fragment.m> g;
    public final HT0<Integer> h;
    public b i;
    public boolean j;
    public boolean k;

    public static abstract class a extends RecyclerView.g {
        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(Object obj, int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i, int i2) {
            a();
        }
    }

    public class b {
        public androidx.viewpager2.adapter.a a;
        public androidx.viewpager2.adapter.b b;
        public k c;
        public ViewPager2 d;
        public long e = -1;

        public b() {
        }

        @NonNull
        public static ViewPager2 a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z) {
            int currentItem;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (!fragmentStateAdapter.e.K() && this.d.getScrollState() == 0) {
                HT0<Fragment> ht0 = fragmentStateAdapter.f;
                if (ht0.i() == 0 || fragmentStateAdapter.c() == 0 || (currentItem = this.d.getCurrentItem()) >= fragmentStateAdapter.c()) {
                    return;
                }
                long j = currentItem;
                if (j != this.e || z) {
                    Fragment fragment = null;
                    Fragment fragment2 = (Fragment) ht0.d(j, null);
                    if (fragment2 == null || !fragment2.isAdded()) {
                        return;
                    }
                    this.e = j;
                    FragmentManager fragmentManager = fragmentStateAdapter.e;
                    fragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                    for (int i = 0; i < ht0.i(); i++) {
                        long jE = ht0.e(i);
                        Fragment fragmentJ = ht0.j(i);
                        if (fragmentJ.isAdded()) {
                            if (jE != this.e) {
                                aVar.j(fragmentJ, g.b.h);
                            } else {
                                fragment = fragmentJ;
                            }
                            fragmentJ.setMenuVisibility(jE == this.e);
                        }
                    }
                    if (fragment != null) {
                        aVar.j(fragment, g.b.i);
                    }
                    if (aVar.a.isEmpty()) {
                        return;
                    }
                    aVar.f();
                }
            }
        }
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        g lifecycle = fragment.getLifecycle();
        this.f = new HT0<>();
        this.g = new HT0<>();
        this.h = new HT0<>();
        this.j = false;
        this.k = false;
        this.e = childFragmentManager;
        this.d = lifecycle;
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    public static void o(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // defpackage.SP1
    @NonNull
    public final Bundle a() {
        HT0<Fragment> ht0 = this.f;
        int i = ht0.i();
        HT0<Fragment.m> ht1 = this.g;
        Bundle bundle = new Bundle(ht1.i() + i);
        for (int i2 = 0; i2 < ht0.i(); i2++) {
            long jE = ht0.e(i2);
            Fragment fragment = (Fragment) ht0.d(jE, null);
            if (fragment != null && fragment.isAdded()) {
                this.e.Q(bundle, C6419rl.a("f#", jE), fragment);
            }
        }
        for (int i3 = 0; i3 < ht1.i(); i3++) {
            long jE2 = ht1.e(i3);
            if (p(jE2)) {
                bundle.putParcelable(C6419rl.a("s#", jE2), (Parcelable) ht1.d(jE2, null));
            }
        }
        return bundle;
    }

    @Override // defpackage.SP1
    public final void b(@NonNull Parcelable parcelable) {
        HT0<Fragment.m> ht0 = this.g;
        if (ht0.i() == 0) {
            HT0<Fragment> ht1 = this.f;
            if (ht1.i() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (ht1.i() == 0) {
                            return;
                        }
                        this.k = true;
                        this.j = true;
                        r();
                        final Handler handler = new Handler(Looper.getMainLooper());
                        final RunnableC0901Ei0 runnableC0901Ei0 = new RunnableC0901Ei0(this);
                        this.d.a(new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                            @Override // androidx.lifecycle.k
                            public final void b(@NonNull FP0 fp0, @NonNull g.a aVar) {
                                if (aVar == g.a.ON_DESTROY) {
                                    handler.removeCallbacks(runnableC0901Ei0);
                                    fp0.getLifecycle().c(this);
                                }
                            }
                        });
                        handler.postDelayed(runnableC0901Ei0, 10000L);
                        return;
                    }
                    String next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        long j = Long.parseLong(next.substring(2));
                        FragmentManager fragmentManager = this.e;
                        fragmentManager.getClass();
                        String string = bundle.getString(next);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment fragmentB = fragmentManager.c.b(string);
                            if (fragmentB == null) {
                                fragmentManager.c0(new IllegalStateException(BX.c("Fragment no longer exists for key ", next, ": unique id ", string)));
                                throw null;
                            }
                            fragment = fragmentB;
                        }
                        ht1.g(j, fragment);
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
                        }
                        long j2 = Long.parseLong(next.substring(2));
                        Fragment.m mVar = (Fragment.m) bundle.getParcelable(next);
                        if (p(j2)) {
                            ht0.g(j2, mVar);
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long d(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void f(@NonNull RecyclerView recyclerView) {
        if (this.i != null) {
            throw new IllegalArgumentException();
        }
        final b bVar = new b();
        this.i = bVar;
        bVar.d = b.a(recyclerView);
        androidx.viewpager2.adapter.a aVar = new androidx.viewpager2.adapter.a(bVar);
        bVar.a = aVar;
        bVar.d.a(aVar);
        androidx.viewpager2.adapter.b bVar2 = new androidx.viewpager2.adapter.b(bVar);
        bVar.b = bVar2;
        n(bVar2);
        k kVar = new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            @Override // androidx.lifecycle.k
            public final void b(@NonNull FP0 fp0, @NonNull g.a aVar2) {
                bVar.b(false);
            }
        };
        bVar.c = kVar;
        this.d.a(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(@NonNull RecyclerView.C c, int i) {
        C1995Si0 c1995Si0 = (C1995Si0) c;
        long j = c1995Si0.e;
        FrameLayout frameLayout = (FrameLayout) c1995Si0.a;
        int id = frameLayout.getId();
        Long lS = s(id);
        HT0<Integer> ht0 = this.h;
        if (lS != null && lS.longValue() != j) {
            u(lS.longValue());
            ht0.h(lS.longValue());
        }
        ht0.g(j, Integer.valueOf(id));
        long j2 = i;
        HT0<Fragment> ht1 = this.f;
        if (ht1.d) {
            ht1.b();
        }
        if (U0.c(ht1.e, ht1.h, j2) < 0) {
            Fragment fragmentQ = q(i);
            fragmentQ.setInitialSavedState((Fragment.m) this.g.d(j2, null));
            ht1.g(j2, fragmentQ);
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (frameLayout.isAttachedToWindow()) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0745Ci0(this, frameLayout, c1995Si0));
        }
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    @NonNull
    public final RecyclerView.C i(@NonNull ViewGroup viewGroup, int i) {
        int i2 = C1995Si0.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new C1995Si0(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void j(@NonNull RecyclerView recyclerView) {
        b bVar = this.i;
        bVar.getClass();
        ViewPager2 viewPager2A = b.a(recyclerView);
        viewPager2A.g.a.remove(bVar.a);
        androidx.viewpager2.adapter.b bVar2 = bVar.b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.a.unregisterObserver(bVar2);
        fragmentStateAdapter.d.c(bVar.c);
        bVar.d = null;
        this.i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final /* bridge */ /* synthetic */ boolean k(@NonNull RecyclerView.C c) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void l(@NonNull RecyclerView.C c) {
        t((C1995Si0) c);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void m(@NonNull RecyclerView.C c) {
        Long lS = s(((FrameLayout) ((C1995Si0) c).a).getId());
        if (lS != null) {
            u(lS.longValue());
            this.h.h(lS.longValue());
        }
    }

    public final boolean p(long j) {
        return j >= 0 && j < ((long) c());
    }

    @NonNull
    public abstract Fragment q(int i);

    public final void r() {
        HT0<Fragment> ht0;
        HT0<Integer> ht1;
        Fragment fragment;
        View view;
        if (!this.k || this.e.K()) {
            return;
        }
        C0903Ej c0903Ej = new C0903Ej();
        int i = 0;
        while (true) {
            ht0 = this.f;
            int i2 = ht0.i();
            ht1 = this.h;
            if (i >= i2) {
                break;
            }
            long jE = ht0.e(i);
            if (!p(jE)) {
                c0903Ej.add(Long.valueOf(jE));
                ht1.h(jE);
            }
            i++;
        }
        if (!this.j) {
            this.k = false;
            for (int i3 = 0; i3 < ht0.i(); i3++) {
                long jE2 = ht0.e(i3);
                if (ht1.d) {
                    ht1.b();
                }
                if (U0.c(ht1.e, ht1.h, jE2) < 0 && ((fragment = (Fragment) ht0.d(jE2, null)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    c0903Ej.add(Long.valueOf(jE2));
                }
            }
        }
        Iterator it = c0903Ej.iterator();
        while (true) {
            AbstractC6155qW0.a aVar = (AbstractC6155qW0.a) it;
            if (!aVar.hasNext()) {
                return;
            } else {
                u(((Long) aVar.next()).longValue());
            }
        }
    }

    public final Long s(int i) {
        Long lValueOf = null;
        int i2 = 0;
        while (true) {
            HT0<Integer> ht0 = this.h;
            if (i2 >= ht0.i()) {
                return lValueOf;
            }
            if (ht0.j(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(ht0.e(i2));
            }
            i2++;
        }
    }

    public final void t(@NonNull final C1995Si0 c1995Si0) {
        Fragment fragment = (Fragment) this.f.d(c1995Si0.e, null);
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) c1995Si0.a;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zIsAdded = fragment.isAdded();
        FragmentManager fragmentManager = this.e;
        if (zIsAdded && view == null) {
            fragmentManager.R(new C0823Di0(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                o(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            o(view, frameLayout);
            return;
        }
        if (fragmentManager.K()) {
            if (fragmentManager.I) {
                return;
            }
            this.d.a(new k() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.k
                public final void b(@NonNull FP0 fp0, @NonNull g.a aVar) {
                    FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                    if (fragmentStateAdapter.e.K()) {
                        return;
                    }
                    fp0.getLifecycle().c(this);
                    C1995Si0 c1995Si1 = c1995Si0;
                    FrameLayout frameLayout2 = (FrameLayout) c1995Si1.a;
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    if (frameLayout2.isAttachedToWindow()) {
                        fragmentStateAdapter.t(c1995Si1);
                    }
                }
            });
            return;
        }
        fragmentManager.R(new C0823Di0(this, fragment, frameLayout), false);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.c(0, fragment, "f" + c1995Si0.e, 1);
        aVar.j(fragment, g.b.h);
        aVar.f();
        this.i.b(false);
    }

    public final void u(long j) {
        ViewParent parent;
        HT0<Fragment> ht0 = this.f;
        Fragment fragment = (Fragment) ht0.d(j, null);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zP = p(j);
        HT0<Fragment.m> ht1 = this.g;
        if (!zP) {
            ht1.h(j);
        }
        if (!fragment.isAdded()) {
            ht0.h(j);
            return;
        }
        FragmentManager fragmentManager = this.e;
        if (fragmentManager.K()) {
            this.k = true;
            return;
        }
        if (fragment.isAdded() && p(j)) {
            ht1.g(j, fragmentManager.W(fragment));
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.i(fragment);
        aVar.f();
        ht0.h(j);
    }
}
