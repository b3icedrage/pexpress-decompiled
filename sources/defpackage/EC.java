package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class EC implements InterfaceC6148qU {

    @NotNull
    public final InterfaceC2902bE0 a;

    @NotNull
    public final Function1<InterfaceC7571xE0, Boolean> b;

    @NotNull
    public final DC c;

    @NotNull
    public final LinkedHashMap d;

    @NotNull
    public final LinkedHashMap e;

    @NotNull
    public final LinkedHashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    public EC(@NotNull InterfaceC2902bE0 jClass, @NotNull Function1<? super InterfaceC7571xE0, Boolean> memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.a = jClass;
        this.b = memberFilter;
        DC dc = new DC(this, 0);
        this.c = dc;
        C7439wd0 c7439wd0H = JH1.h(CollectionsKt.y(jClass.y()), dc);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7439wd0.a aVar = new C7439wd0.a(c7439wd0H);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            C5638o21 name = ((InterfaceC7991zE0) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        C7439wd0 c7439wd0H2 = JH1.h(CollectionsKt.y(this.a.u()), this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C7439wd0.a aVar2 = new C7439wd0.a(c7439wd0H2);
        while (aVar2.hasNext()) {
            Object next2 = aVar2.next();
            linkedHashMap2.put(((InterfaceC6520sE0) next2).getName(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListN = this.a.n();
        Function1<InterfaceC7571xE0, Boolean> function1 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListN) {
            if (function1.invoke((InterfaceC7571xE0) obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iA = OW0.a(XE.m(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((IE0) obj2).getName(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // defpackage.InterfaceC6148qU
    @NotNull
    public final Set<C5638o21> a() {
        C7439wd0 c7439wd0H = JH1.h(CollectionsKt.y(this.a.y()), this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7439wd0.a aVar = new C7439wd0.a(c7439wd0H);
        while (aVar.hasNext()) {
            linkedHashSet.add(((InterfaceC7991zE0) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC6148qU
    @Nullable
    public final IE0 b(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (IE0) this.f.get(name);
    }

    @Override // defpackage.InterfaceC6148qU
    @NotNull
    public final Collection<InterfaceC7991zE0> c(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.d.get(name);
        return list != null ? list : C5653o60.d;
    }

    @Override // defpackage.InterfaceC6148qU
    @Nullable
    public final InterfaceC6520sE0 d(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (InterfaceC6520sE0) this.e.get(name);
    }

    @Override // defpackage.InterfaceC6148qU
    @NotNull
    public final Set<C5638o21> e() {
        return this.f.keySet();
    }

    @Override // defpackage.InterfaceC6148qU
    @NotNull
    public final Set<C5638o21> f() {
        C7439wd0 c7439wd0H = JH1.h(CollectionsKt.y(this.a.u()), this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7439wd0.a aVar = new C7439wd0.a(c7439wd0H);
        while (aVar.hasNext()) {
            linkedHashSet.add(((InterfaceC6520sE0) aVar.next()).getName());
        }
        return linkedHashSet;
    }
}
