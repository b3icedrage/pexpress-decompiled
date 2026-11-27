package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TO0 extends UO0 {
    public static final /* synthetic */ int p = 0;

    @NotNull
    public final InterfaceC2902bE0 n;

    @NotNull
    public final C7180vO0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TO0(@NotNull LO0 c, @NotNull InterfaceC2902bE0 jClass, @NotNull C7180vO0 ownerDescriptor) {
        super(c);
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.n = jClass;
        this.o = ownerDescriptor;
    }

    public static InterfaceC0671Bj1 v(InterfaceC0671Bj1 interfaceC0671Bj1) {
        InterfaceC1490Lx.a aVarH = interfaceC0671Bj1.h();
        aVarH.getClass();
        if (aVarH != InterfaceC1490Lx.a.e) {
            return interfaceC0671Bj1;
        }
        Collection<? extends InterfaceC1490Lx> collectionU = interfaceC0671Bj1.u();
        Intrinsics.checkNotNullExpressionValue(collectionU, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC1490Lx> collection = collectionU;
        ArrayList arrayList = new ArrayList(XE.m(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC0671Bj1 interfaceC0671Bj2 = (InterfaceC0671Bj1) it.next();
            Intrinsics.checkNotNull(interfaceC0671Bj2);
            arrayList.add(v(interfaceC0671Bj2));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return (InterfaceC0671Bj1) CollectionsKt.U(CollectionsKt.e0(CollectionsKt.g0(arrayList)));
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // defpackage.QO0
    @NotNull
    public final Set h(@NotNull LY kindFilter, @Nullable QY qy) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return C6702t60.d;
    }

    @Override // defpackage.QO0
    @NotNull
    public final Set i(@NotNull LY kindFilter, @Nullable QY qy) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetG0 = CollectionsKt.g0(this.e.invoke().a());
        C7180vO0 c7180vO0 = this.o;
        TO0 to0O = C1874Qu.o(c7180vO0);
        Set<C5638o21> setA = to0O != null ? to0O.a() : null;
        if (setA == null) {
            setA = C6702t60.d;
        }
        linkedHashSetG0.addAll(setA);
        if (this.n.C()) {
            linkedHashSetG0.addAll(WE.f(C4194hP1.c, C4194hP1.a));
        }
        LO0 lo0 = this.b;
        linkedHashSetG0.addAll(lo0.a.x.a(c7180vO0, lo0));
        return linkedHashSetG0;
    }

    @Override // defpackage.QO0
    public final void j(@NotNull C5638o21 name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LO0 lo0 = this.b;
        KE0 ke0 = lo0.a;
        ke0.x.f(this.o, name, result, lo0);
    }

    @Override // defpackage.QO0
    public final InterfaceC6148qU k() {
        return new EC(this.n, C2276Vy.h);
    }

    @Override // defpackage.QO0
    public final void m(@NotNull LinkedHashSet result, @NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        C7180vO0 c7180vO0 = this.o;
        TO0 to0O = C1874Qu.o(c7180vO0);
        Collection collectionH0 = to0O == null ? C6702t60.d : CollectionsKt.h0(to0O.d(name, S41.i));
        KE0 ke0 = this.b.a;
        LinkedHashSet linkedHashSetR = UE.r(name, collectionH0, result, this.o, ke0.f, ke0.u.e);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetR, "resolveOverridesForStaticMembers(...)");
        result.addAll(linkedHashSetR);
        if (this.n.C()) {
            if (name.equals(C4194hP1.c)) {
                C3975gM1 c3975gM1F = JY.f(c7180vO0);
                Intrinsics.checkNotNullExpressionValue(c3975gM1F, "createEnumValueOfMethod(...)");
                result.add(c3975gM1F);
            } else if (name.equals(C4194hP1.a)) {
                C3975gM1 c3975gM1G = JY.g(c7180vO0);
                Intrinsics.checkNotNullExpressionValue(c3975gM1G, "createEnumValuesMethod(...)");
                result.add(c3975gM1G);
            }
        }
    }

    @Override // defpackage.UO0, defpackage.QO0
    public final void n(@NotNull C5638o21 name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        RO0 ro0 = new RO0(name, 0);
        C7180vO0 c7180vO0 = this.o;
        C2943bS.b(VE.c(c7180vO0), LE.g, new SO0(c7180vO0, linkedHashSet, ro0));
        boolean zIsEmpty = result.isEmpty();
        LO0 lo0 = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC0671Bj1 interfaceC0671Bj1V = v((InterfaceC0671Bj1) obj);
                Object arrayList = linkedHashMap.get(interfaceC0671Bj1V);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(interfaceC0671Bj1V, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                KE0 ke0 = lo0.a;
                LinkedHashSet linkedHashSetR = UE.r(name, collection, result, this.o, ke0.f, ke0.u.e);
                Intrinsics.checkNotNullExpressionValue(linkedHashSetR, "resolveOverridesForStaticMembers(...)");
                C2904bF.o(arrayList2, linkedHashSetR);
            }
            result.addAll(arrayList2);
        } else {
            KE0 ke1 = lo0.a;
            LinkedHashSet linkedHashSetR2 = UE.r(name, linkedHashSet, result, this.o, ke1.f, ke1.u.e);
            Intrinsics.checkNotNullExpressionValue(linkedHashSetR2, "resolveOverridesForStaticMembers(...)");
            result.addAll(linkedHashSetR2);
        }
        if (this.n.C() && Intrinsics.a(name, C4194hP1.b)) {
            UE.b(result, JY.e(c7180vO0));
        }
    }

    @Override // defpackage.QO0
    @NotNull
    public final Set o(@NotNull LY kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetG0 = CollectionsKt.g0(this.e.invoke().f());
        C7508wx c7508wx = C7508wx.g;
        C7180vO0 c7180vO0 = this.o;
        C2943bS.b(VE.c(c7180vO0), LE.g, new SO0(c7180vO0, linkedHashSetG0, c7508wx));
        if (this.n.C()) {
            linkedHashSetG0.add(C4194hP1.b);
        }
        return linkedHashSetG0;
    }

    @Override // defpackage.QO0
    public final InterfaceC4675jU q() {
        return this.o;
    }
}
