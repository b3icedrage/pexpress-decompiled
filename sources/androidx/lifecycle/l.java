package androidx.lifecycle;

import android.annotation.SuppressLint;
import defpackage.C1039Gc0;
import defpackage.C1662Ob0;
import defpackage.C1742Pc;
import defpackage.C3841fj;
import defpackage.C3945gC1;
import defpackage.EP0;
import defpackage.FP0;
import defpackage.NP0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends g {
    public final boolean b;

    @NotNull
    public C1662Ob0<EP0, a> c;

    @NotNull
    public g.b d;

    @NotNull
    public final WeakReference<FP0> e;
    public int f;
    public boolean g;
    public boolean h;

    @NotNull
    public final ArrayList<g.b> i;

    public static final class a {

        @NotNull
        public g.b a;

        @NotNull
        public k b;

        public final void a(@Nullable FP0 fp0, @NotNull g.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            g.b bVarB = event.b();
            g.b state1 = this.a;
            Intrinsics.checkNotNullParameter(state1, "state1");
            if (bVarB.compareTo(state1) < 0) {
                state1 = bVarB;
            }
            this.a = state1;
            Intrinsics.checkNotNull(fp0);
            this.b.b(fp0, event);
            this.a = bVarB;
        }
    }

    public l(@NotNull FP0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.b = true;
        this.c = new C1662Ob0<>();
        this.d = g.b.e;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(provider);
    }

    @Override // androidx.lifecycle.g
    public final void a(@NotNull EP0 object) {
        k reflectiveGenericLifecycleObserver;
        FP0 fp0;
        g.a aVar;
        ArrayList<g.b> arrayList = this.i;
        Intrinsics.checkNotNullParameter(object, "observer");
        e("addObserver");
        g.b bVar = this.d;
        g.b initialState = g.b.d;
        if (bVar != initialState) {
            initialState = g.b.e;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        a aVar2 = new a();
        Intrinsics.checkNotNull(object);
        HashMap map = NP0.a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof k;
        boolean z2 = object instanceof DefaultLifecycleObserver;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (k) object);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (k) object;
        } else {
            Class<?> cls = object.getClass();
            if (NP0.c(cls) == 2) {
                Object obj = NP0.b.get(cls);
                Intrinsics.checkNotNull(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(NP0.a((Constructor) list.get(0), object));
                } else {
                    int size = list.size();
                    d[] dVarArr = new d[size];
                    for (int i = 0; i < size; i++) {
                        dVarArr[i] = NP0.a((Constructor) list.get(i), object);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(dVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(object);
            }
        }
        aVar2.b = reflectiveGenericLifecycleObserver;
        aVar2.a = initialState;
        if (this.c.b(object, aVar2) == null && (fp0 = this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            g.b bVarD = d(object);
            this.f++;
            while (aVar2.a.compareTo(bVarD) < 0 && this.c.i.containsKey(object)) {
                arrayList.add(aVar2.a);
                g.a.C0236a c0236a = g.a.Companion;
                g.b state = aVar2.a;
                c0236a.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 1) {
                    aVar = g.a.ON_CREATE;
                } else if (iOrdinal != 2) {
                    aVar = iOrdinal != 3 ? null : g.a.ON_RESUME;
                } else {
                    aVar = g.a.ON_START;
                }
                if (aVar == null) {
                    throw new IllegalStateException("no event up from " + aVar2.a);
                }
                aVar2.a(fp0, aVar);
                arrayList.remove(arrayList.size() - 1);
                bVarD = d(object);
            }
            if (!z3) {
                i();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.g
    @NotNull
    public final g.b b() {
        return this.d;
    }

    @Override // androidx.lifecycle.g
    public final void c(@NotNull EP0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        e("removeObserver");
        this.c.c(observer);
    }

    public final g.b d(EP0 ep0) {
        a aVar;
        HashMap<EP0, C3945gC1.c<EP0, a>> map = this.c.i;
        C3945gC1.c<EP0, a> cVar = map.containsKey(ep0) ? map.get(ep0).h : null;
        g.b state1 = (cVar == null || (aVar = cVar.e) == null) ? null : aVar.a;
        ArrayList<g.b> arrayList = this.i;
        g.b bVar = arrayList.isEmpty() ? null : (g.b) C1742Pc.c(1, arrayList);
        g.b state2 = this.d;
        Intrinsics.checkNotNullParameter(state2, "state1");
        if (state1 == null || state1.compareTo(state2) >= 0) {
            state1 = state2;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.b && !C3841fj.w().x()) {
            throw new IllegalStateException(C1039Gc0.d("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(@NotNull g.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e("handleLifecycleEvent");
        g(event.b());
    }

    public final void g(g.b bVar) {
        g.b bVar2 = this.d;
        if (bVar2 == bVar) {
            return;
        }
        g.b bVar3 = g.b.e;
        g.b bVar4 = g.b.d;
        if (bVar2 == bVar3 && bVar == bVar4) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        i();
        this.g = false;
        if (this.d == bVar4) {
            this.c = new C1662Ob0<>();
        }
    }

    public final void h(@NotNull g.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        e("setCurrentState");
        g(state);
    }

    public final void i() {
        g.a aVar;
        FP0 fp0 = this.e.get();
        if (fp0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1662Ob0<EP0, a> c1662Ob0 = this.c;
            if (c1662Ob0.h != 0) {
                C3945gC1.c<EP0, a> cVar = c1662Ob0.d;
                Intrinsics.checkNotNull(cVar);
                g.b bVar = cVar.e.a;
                C3945gC1.c<EP0, a> cVar2 = this.c.e;
                Intrinsics.checkNotNull(cVar2);
                g.b bVar2 = cVar2.e.a;
                if (bVar == bVar2 && this.d == bVar2) {
                    break;
                }
                this.h = false;
                g.b bVar3 = this.d;
                C3945gC1.c<EP0, a> cVar3 = this.c.d;
                Intrinsics.checkNotNull(cVar3);
                if (bVar3.compareTo(cVar3.e.a) < 0) {
                    C1662Ob0<EP0, a> c1662Ob1 = this.c;
                    C3945gC1.b bVar4 = new C3945gC1.b(c1662Ob1.e, c1662Ob1.d);
                    c1662Ob1.g.put(bVar4, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVar4, "observerMap.descendingIterator()");
                    while (bVar4.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar4.next();
                        Intrinsics.checkNotNullExpressionValue(entry, "next()");
                        EP0 ep0 = (EP0) entry.getKey();
                        a aVar2 = (a) entry.getValue();
                        while (aVar2.a.compareTo(this.d) > 0 && !this.h && this.c.i.containsKey(ep0)) {
                            g.a.C0236a c0236a = g.a.Companion;
                            g.b bVar5 = aVar2.a;
                            c0236a.getClass();
                            g.a aVarA = g.a.C0236a.a(bVar5);
                            if (aVarA == null) {
                                throw new IllegalStateException("no event down from " + aVar2.a);
                            }
                            this.i.add(aVarA.b());
                            aVar2.a(fp0, aVarA);
                            ArrayList<g.b> arrayList = this.i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C3945gC1.c<EP0, a> cVar4 = this.c.e;
                if (!this.h && cVar4 != null && this.d.compareTo(cVar4.e.a) > 0) {
                    C1662Ob0<EP0, a> c1662Ob2 = this.c;
                    c1662Ob2.getClass();
                    C3945gC1.d dVar = new C3945gC1.d();
                    c1662Ob2.g.put(dVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(dVar, "observerMap.iteratorWithAdditions()");
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        EP0 ep1 = (EP0) entry2.getKey();
                        a aVar3 = (a) entry2.getValue();
                        while (aVar3.a.compareTo(this.d) < 0 && !this.h && this.c.i.containsKey(ep1)) {
                            this.i.add(aVar3.a);
                            g.a.C0236a c0236a2 = g.a.Companion;
                            g.b state = aVar3.a;
                            c0236a2.getClass();
                            Intrinsics.checkNotNullParameter(state, "state");
                            int iOrdinal = state.ordinal();
                            if (iOrdinal == 1) {
                                aVar = g.a.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                aVar = iOrdinal != 3 ? null : g.a.ON_RESUME;
                            } else {
                                aVar = g.a.ON_START;
                            }
                            if (aVar == null) {
                                throw new IllegalStateException("no event up from " + aVar3.a);
                            }
                            aVar3.a(fp0, aVar);
                            ArrayList<g.b> arrayList2 = this.i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
    }
}
