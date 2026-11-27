package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5695oJ<T> implements InterfaceC5139lg1<T> {

    @NotNull
    public final ArrayList a;

    public C5695oJ(@NotNull ArrayList predicates) {
        Intrinsics.checkNotNullParameter(predicates, "predicates");
        this.a = predicates;
    }

    @Override // defpackage.InterfaceC5139lg1
    public final boolean test(T t) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC5139lg1) it.next()).test(t)) {
                return false;
            }
        }
        return true;
    }
}
