package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: oH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5689oH {
    public final List<UG<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (UG<?> ug : componentRegistrar.getComponents()) {
            String str = ug.a;
            if (str != null) {
                C5479nH c5479nH = new C5479nH(str, ug);
                ug = new UG<>(str, ug.b, ug.c, ug.d, ug.e, c5479nH, ug.g);
            }
            arrayList.add(ug);
        }
        return arrayList;
    }
}
