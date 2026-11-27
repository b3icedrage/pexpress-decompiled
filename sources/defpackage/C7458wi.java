package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7458wi<T> {

    @NotNull
    public final ArrayList a = new ArrayList();

    public final void a(@NotNull InterfaceC1132Hh0<? super T> format) {
        Intrinsics.checkNotNullParameter(format, "format");
        boolean z = format instanceof InterfaceC7750y51;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(format);
        } else if (format instanceof PH) {
            Iterator it = ((PH) format).a.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC7750y51) it.next());
            }
        }
    }
}
