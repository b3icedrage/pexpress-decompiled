package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: a00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2626a00 extends SZ {

    @NotNull
    public final InterfaceC2392Xa1 g;

    @NotNull
    public final String h;

    @NotNull
    public final C1758Ph0 i;

    public C2626a00(@NotNull InterfaceC2392Xa1 packageDescriptor, @NotNull C3218ck1 proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull AbstractC5393ms metadataVersion, @Nullable BI0 bi0, @NotNull C6163qZ components, @NotNull String debugName, @NotNull Function0 classNames) {
        Intrinsics.checkNotNullParameter(packageDescriptor, "packageDescriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        C4945kk1 c4945kk1 = proto.k;
        Intrinsics.checkNotNullExpressionValue(c4945kk1, "getTypeTable(...)");
        C2656a72 c2656a72 = new C2656a72(c4945kk1);
        C5761od2 c5761od2 = C5761od2.b;
        C5578nk1 c5578nk1 = proto.l;
        Intrinsics.checkNotNullExpressionValue(c5578nk1, "getVersionRequirementTable(...)");
        C6582sZ c6582sZA = components.a(packageDescriptor, nameResolver, c2656a72, C5761od2.a.a(c5578nk1), metadataVersion, bi0);
        List<C2575Zj1> list = proto.h;
        Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
        List<C3637ek1> list2 = proto.i;
        Intrinsics.checkNotNullExpressionValue(list2, "getPropertyList(...)");
        List<C4476ik1> list3 = proto.j;
        Intrinsics.checkNotNullExpressionValue(list3, "getTypeAliasList(...)");
        super(c6582sZA, list, list2, list3, classNames);
        this.g = packageDescriptor;
        this.h = debugName;
        this.i = packageDescriptor.c();
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    public final Collection e(LY kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        S41 s41 = S41.d;
        List listI = i(kindFilter, nameFilter);
        Iterable<HC> iterable = this.b.a.k;
        ArrayList arrayList = new ArrayList();
        Iterator<HC> it = iterable.iterator();
        while (it.hasNext()) {
            C2904bF.o(arrayList, it.next().b(this.i));
        }
        return CollectionsKt.Q(listI, arrayList);
    }

    @Override // defpackage.SZ, defpackage.RY0, defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        C5208m0.n(this.b.a.i, location, this.g, name);
        return super.f(name, location);
    }

    @Override // defpackage.SZ
    public final void h(@NotNull ArrayList result, @NotNull Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
    }

    @Override // defpackage.SZ
    @NotNull
    public final QC l(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new QC(this.i, name);
    }

    @Override // defpackage.SZ
    @Nullable
    public final Set<C5638o21> n() {
        return C6702t60.d;
    }

    @Override // defpackage.SZ
    @NotNull
    public final Set<C5638o21> o() {
        return C6702t60.d;
    }

    @Override // defpackage.SZ
    @NotNull
    public final Set<C5638o21> p() {
        return C6702t60.d;
    }

    @Override // defpackage.SZ
    public final boolean q(@NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (super.q(name)) {
            return true;
        }
        Iterable<HC> iterable = this.b.a.k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<HC> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next().c(this.i, name)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return this.h;
    }
}
