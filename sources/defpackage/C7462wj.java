package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7462wj<E> extends SE<E, List<? extends E>, ArrayList<E>> {

    @NotNull
    public final C7251vj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7462wj(@NotNull RJ0<E> element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        MH1 elementDesc = element.c();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.b = new C7251vj(elementDesc);
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.b;
    }

    @Override // defpackage.Z
    public final Object e() {
        return new ArrayList();
    }

    @Override // defpackage.Z
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // defpackage.Z
    public final Object k(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // defpackage.Z
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    @Override // defpackage.RE
    public final void m(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
