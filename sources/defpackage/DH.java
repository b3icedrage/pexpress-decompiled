package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DH implements InterfaceC2396Xc {

    @NotNull
    public final List<InterfaceC2396Xc> d;

    /* JADX WARN: Multi-variable type inference failed */
    public DH(@NotNull List<? extends InterfaceC2396Xc> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.d = delegates;
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean P(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = ((Iterable) CollectionsKt.y(this.d).b).iterator();
        while (it.hasNext()) {
            if (((InterfaceC2396Xc) it.next()).P(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean isEmpty() {
        List<InterfaceC2396Xc> list = this.d;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC2396Xc) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC1583Nc> iterator() {
        return new C2139Ue0.a(JH1.k(CollectionsKt.y(this.d), CH.e));
    }

    @Override // defpackage.InterfaceC2396Xc
    @Nullable
    public final InterfaceC1583Nc p(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (InterfaceC1583Nc) JH1.j(JH1.n(CollectionsKt.y(this.d), new BH(fqName, 0)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DH(@NotNull InterfaceC2396Xc... delegates) {
        this((List<? extends InterfaceC2396Xc>) C1526Mj.F(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
