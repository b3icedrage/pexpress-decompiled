package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4873kQ implements InterfaceC3985gQ {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC6396rf0<Boolean> b;

    @NotNull
    public final InterfaceC6396rf0<Boolean> c;

    public C4873kQ(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = appData;
        C4195hQ c4195hQ = new C4195hQ(0);
        this.b = C4466ii.m(C4466ii.k(new C4250hg0(appData.b, 0), appData.c, appData.d, new C4663jQ(this, c4195hQ, null)));
        C4405iQ c4405iQ = new C4405iQ(0);
        this.c = C4466ii.m(C4466ii.k(new C4250hg0(appData.b, 0), appData.c, appData.d, new C4663jQ(this, c4405iQ, null)));
    }

    @Override // defpackage.InterfaceC3985gQ
    public final boolean a(@NotNull FF it) {
        Intrinsics.checkNotNullParameter(it, "config");
        C4923kf c4923kf = this.a;
        C6106qG c6106qG = (C6106qG) c4923kf.c.getValue();
        Boolean bool = (Boolean) c4923kf.d.getValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.D) {
            if (!it.J || Intrinsics.a(bool, Boolean.FALSE)) {
                return true;
            }
            if (c6106qG != null && c6106qG.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3985gQ
    @NotNull
    public final InterfaceC6396rf0<Boolean> b() {
        return this.b;
    }

    @Override // defpackage.InterfaceC3985gQ
    public final boolean c(@NotNull FF it) {
        Intrinsics.checkNotNullParameter(it, "config");
        C4923kf c4923kf = this.a;
        C6106qG c6106qG = (C6106qG) c4923kf.c.getValue();
        Boolean bool = (Boolean) c4923kf.d.getValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.E) {
            if (!it.J || Intrinsics.a(bool, Boolean.FALSE)) {
                return true;
            }
            if (c6106qG != null && c6106qG.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3985gQ
    @NotNull
    public final InterfaceC6396rf0<Boolean> d() {
        return this.c;
    }
}
