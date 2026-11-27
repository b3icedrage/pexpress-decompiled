package defpackage;

import android.app.Activity;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4817k8 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C4817k8(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C4923kf appData = (C4923kf) this.b.get();
                InterfaceC7012ub2 userRepositoryApi = (InterfaceC7012ub2) this.c.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(userRepositoryApi, "userRepositoryApi");
                return new C4607j8(appData, userRepositoryApi);
            case 1:
                return new C4100gy((Activity) this.b.get(), (AbstractC1607Nj) ((C1763Pj) this.c).get());
            case 2:
                return new BR0((Set) ((C4176hJ1) this.b).get(), (YU1) ((ZU1) this.c).get());
            default:
                return new Bi2((C4923kf) this.b.get(), (AbstractC6764tP1) ((InterfaceC1454Lk1) this.c).get());
        }
    }
}
