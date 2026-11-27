package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: oI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5692oI implements InterfaceC5482nI {

    @NotNull
    public final GP1 a;

    public C5692oI() {
        GP1 gp1I = C1589Ne.i(C5653o60.d);
        this.a = gp1I;
        C4466ii.f(gp1I);
    }

    @Override // defpackage.InterfaceC5482nI
    public final void a(@NotNull List<C4818k80> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.a.setValue(events);
    }
}
