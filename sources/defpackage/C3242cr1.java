package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: cr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3242cr1 {
    public final ArrayList a;
    public final ArrayList b;
    public final HashSet c = new HashSet(3);

    public C3242cr1(@NonNull ArrayList arrayList) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
    }

    public final void a(@NonNull InterfaceC4217hX0 interfaceC4217hX0) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(interfaceC4217hX0)) {
            return;
        }
        HashSet hashSet = this.c;
        if (hashSet.contains(interfaceC4217hX0)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(interfaceC4217hX0);
        interfaceC4217hX0.c(this);
        hashSet.remove(interfaceC4217hX0);
        if (arrayList.contains(interfaceC4217hX0)) {
            return;
        }
        if (C7176vN.class.isAssignableFrom(interfaceC4217hX0.getClass())) {
            arrayList.add(0, interfaceC4217hX0);
        } else {
            arrayList.add(interfaceC4217hX0);
        }
    }
}
