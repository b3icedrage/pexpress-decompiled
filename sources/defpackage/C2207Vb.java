package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2207Vb implements InterfaceC4023gc {
    public final List a;

    public C2207Vb(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.InterfaceC4023gc
    public boolean i() {
        ArrayList arrayList = (ArrayList) this.a;
        return arrayList.size() == 1 && ((C7589xK0) arrayList.get(0)).c();
    }

    @Override // defpackage.InterfaceC4023gc
    public AbstractC1002Fq j() {
        ArrayList arrayList = (ArrayList) this.a;
        return ((C7589xK0) arrayList.get(0)).c() ? new C6607sf1(arrayList) : new C1196Ic1(arrayList);
    }

    @Override // defpackage.InterfaceC4023gc
    public List k() {
        return (ArrayList) this.a;
    }

    public C2207Vb(ArrayList arrayList, HashMap map) {
        this.a = arrayList.subList(1, arrayList.size() - 1);
    }
}
