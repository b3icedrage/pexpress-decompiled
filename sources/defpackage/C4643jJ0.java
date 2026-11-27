package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4643jJ0 {
    @NotNull
    public static final <T> T a(@NotNull RI0<T> ri0) {
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Iterator<T> it = ri0.r().iterator();
        InterfaceC6325rJ0 interfaceC6325rJ0 = null;
        boolean z = false;
        InterfaceC6325rJ0 interfaceC6325rJ1 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                interfaceC6325rJ0 = interfaceC6325rJ1;
                break;
            }
            T next = it.next();
            List<GJ0> listB = ((InterfaceC6325rJ0) next).b();
            if (listB == null || !listB.isEmpty()) {
                Iterator<T> it2 = listB.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((GJ0) it2.next()).m()) {
                        }
                    }
                }
            }
            if (z) {
                break;
            }
            z = true;
            interfaceC6325rJ1 = next;
        }
        InterfaceC6325rJ0 interfaceC6325rJ2 = interfaceC6325rJ0;
        if (interfaceC6325rJ2 != null) {
            return (T) interfaceC6325rJ2.d(PW0.c());
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + ri0);
    }
}
