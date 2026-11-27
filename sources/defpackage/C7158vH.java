package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.b0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: vH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7158vH implements InterfaceC3958gH, InterfaceC5269mH {
    public static final C6109qH g = new C6109qH();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final C4350i80 d;
    public final AtomicReference<Boolean> e;
    public final C5689oH f;

    public C7158vH(ArrayList arrayList, ArrayList arrayList2, C5689oH c5689oH) {
        EnumC5663o82 enumC5663o82 = EnumC5663o82.d;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new AtomicReference<>();
        C4350i80 c4350i80 = new C4350i80();
        this.d = c4350i80;
        this.f = c5689oH;
        ArrayList<UG> arrayList3 = new ArrayList();
        arrayList3.add(UG.b(c4350i80, C4350i80.class, InterfaceC6569sU1.class, InterfaceC2318Wk1.class));
        arrayList3.add(UG.b(this, InterfaceC5269mH.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            UG ug = (UG) it.next();
            if (ug != null) {
                arrayList3.add(ug);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC1612Nk1) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (C7354wC0 e) {
                    it3.remove();
                    b0.f("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.a.isEmpty()) {
                XR.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                XR.a(arrayList6);
            }
            for (final UG ug2 : arrayList3) {
                this.a.put(ug2, new C3980gO0(new InterfaceC1612Nk1() { // from class: rH
                    @Override // defpackage.InterfaceC1612Nk1
                    public final Object get() {
                        C7158vH c7158vH = this.a;
                        c7158vH.getClass();
                        UG ug3 = ug2;
                        return ug3.f.c(new C1480Lt1(ug3, c7158vH));
                    }
                }));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.e.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.InterfaceC3958gH
    public final synchronized <T> InterfaceC1612Nk1<Set<T>> d(C7892yl1<T> c7892yl1) {
        C2711aP0 c2711aP0 = (C2711aP0) this.c.get(c7892yl1);
        if (c2711aP0 != null) {
            return c2711aP0;
        }
        return g;
    }

    @Override // defpackage.InterfaceC3958gH
    public final <T> InterfaceC7203vW<T> e(C7892yl1<T> c7892yl1) {
        InterfaceC1612Nk1<T> interfaceC1612Nk1F = f(c7892yl1);
        if (interfaceC1612Nk1F == null) {
            return new C4017ga1(C4017ga1.c, C4017ga1.d);
        }
        return interfaceC1612Nk1F instanceof C4017ga1 ? (C4017ga1) interfaceC1612Nk1F : new C4017ga1(null, interfaceC1612Nk1F);
    }

    @Override // defpackage.InterfaceC3958gH
    public final synchronized <T> InterfaceC1612Nk1<T> f(C7892yl1<T> c7892yl1) {
        C5208m0.f(c7892yl1, "Null interface requested.");
        return (InterfaceC1612Nk1) this.b.get(c7892yl1);
    }

    public final void h(HashMap map, boolean z) {
        ArrayDeque<Y70> arrayDeque;
        Set<Map.Entry> setEntrySet;
        for (Map.Entry entry : map.entrySet()) {
            UG ug = (UG) entry.getKey();
            InterfaceC1612Nk1 interfaceC1612Nk1 = (InterfaceC1612Nk1) entry.getValue();
            int i = ug.d;
            if (i == 1 || (i == 2 && z)) {
                interfaceC1612Nk1.get();
            }
        }
        C4350i80 c4350i80 = this.d;
        synchronized (c4350i80) {
            arrayDeque = c4350i80.b;
            if (arrayDeque != null) {
                c4350i80.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            for (Y70 y70 : arrayDeque) {
                y70.getClass();
                synchronized (c4350i80) {
                    try {
                        ArrayDeque arrayDeque2 = c4350i80.b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(y70);
                        } else {
                            synchronized (c4350i80) {
                                try {
                                    Map map2 = (Map) c4350i80.a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            for (Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new RunnableC4140h80(0, entry2, y70));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void i() {
        for (UG ug : this.a.keySet()) {
            for (C6996uX c6996uX : ug.c) {
                boolean z = c6996uX.b == 2;
                C7892yl1<?> c7892yl1 = c6996uX.a;
                if (z) {
                    HashMap map = this.c;
                    if (!map.containsKey(c7892yl1)) {
                        Set set = Collections.EMPTY_SET;
                        C2711aP0 c2711aP0 = new C2711aP0();
                        c2711aP0.b = null;
                        c2711aP0.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        c2711aP0.a.addAll(set);
                        map.put(c7892yl1, c2711aP0);
                    }
                }
                HashMap map2 = this.b;
                if (map2.containsKey(c7892yl1)) {
                    continue;
                } else {
                    int i = c6996uX.b;
                    if (i == 1) {
                        throw new A01("Unsatisfied dependency for component " + ug + ": " + c7892yl1);
                    }
                    if (i != 2) {
                        map2.put(c7892yl1, new C4017ga1(C4017ga1.c, C4017ga1.d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UG ug = (UG) it.next();
            if (ug.e == 0) {
                InterfaceC1612Nk1 interfaceC1612Nk1 = (InterfaceC1612Nk1) this.a.get(ug);
                Iterator it2 = ug.b.iterator();
                while (it2.hasNext()) {
                    C7892yl1 c7892yl1 = (C7892yl1) it2.next();
                    HashMap map = this.b;
                    if (map.containsKey(c7892yl1)) {
                        arrayList2.add(new RunnableC6528sH(0, (C4017ga1) ((InterfaceC1612Nk1) map.get(c7892yl1)), interfaceC1612Nk1));
                    } else {
                        map.put(c7892yl1, interfaceC1612Nk1);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            UG ug = (UG) entry.getKey();
            if (ug.e != 0) {
                InterfaceC1612Nk1 interfaceC1612Nk1 = (InterfaceC1612Nk1) entry.getValue();
                Iterator it = ug.b.iterator();
                while (it.hasNext()) {
                    C7892yl1 c7892yl1 = (C7892yl1) it.next();
                    if (!map.containsKey(c7892yl1)) {
                        map.put(c7892yl1, new HashSet());
                    }
                    ((Set) map.get(c7892yl1)).add(interfaceC1612Nk1);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.c;
            if (map2.containsKey(key)) {
                C2711aP0 c2711aP0 = (C2711aP0) map2.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new RunnableC6738tH(0, c2711aP0, (InterfaceC1612Nk1) it2.next()));
                }
            } else {
                C7892yl1 c7892yl2 = (C7892yl1) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C2711aP0 c2711aP1 = new C2711aP0();
                c2711aP1.b = null;
                c2711aP1.a = Collections.newSetFromMap(new ConcurrentHashMap());
                c2711aP1.a.addAll(set);
                map2.put(c7892yl2, c2711aP1);
            }
        }
        return arrayList;
    }
}
