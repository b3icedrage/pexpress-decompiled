package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MU1 implements QY0 {

    @NotNull
    public final QY0 b;

    @NotNull
    public final X62 c;

    @Nullable
    public HashMap d;

    @NotNull
    public final KW1 e;

    public MU1(@NotNull QY0 workerScope, @NotNull X62 givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.b = workerScope;
        XO0.b(new C7843yZ(givenSubstitutor, 4));
        T62 t62G = givenSubstitutor.g();
        Intrinsics.checkNotNullExpressionValue(t62G, "getSubstitution(...)");
        this.c = LE.m(t62G).c();
        this.e = XO0.b(new C8053zZ(this, 5));
    }

    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        return this.b.a();
    }

    @Override // defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i(this.b.b(name, location));
    }

    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        return this.b.c();
    }

    @Override // defpackage.QY0
    @NotNull
    public final Collection<? extends InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return i(this.b.d(name, location));
    }

    @Override // defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.e.getValue();
    }

    @Override // defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC5044lD interfaceC5044lDF = this.b.f(name, location);
        if (interfaceC5044lDF != null) {
            return (InterfaceC5044lD) h(interfaceC5044lDF);
        }
        return null;
    }

    @Override // defpackage.QY0
    @Nullable
    public final Set<C5638o21> g() {
        return this.b.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends InterfaceC4675jU> D h(D d) {
        X62 x62 = this.c;
        if (x62.a.f()) {
            return d;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap map = this.d;
        Intrinsics.checkNotNull(map);
        Object objB = map.get(d);
        if (objB == null) {
            if (!(d instanceof IU1)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
            objB = ((IU1) d).b(x62);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
            }
            map.put(d, objB);
        }
        return (D) objB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends InterfaceC4675jU> Collection<D> i(Collection<? extends D> collection) {
        if (this.c.a.f() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((InterfaceC4675jU) it.next()));
        }
        return linkedHashSet;
    }
}
