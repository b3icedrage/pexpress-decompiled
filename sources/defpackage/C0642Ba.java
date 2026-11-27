package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642Ba implements InterfaceC1878Qv0 {

    @NotNull
    public final BP1 a;

    public C0642Ba(@NotNull BP1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = state;
    }

    @Override // defpackage.InterfaceC1878Qv0
    public final void a(@Nullable String str) {
        BP1 bp1 = this.a;
        bp1.b = str;
        Iterator it = bp1.c.iterator();
        while (it.hasNext()) {
            ((AbstractC4609j81) it.next()).h(str);
        }
    }

    @Override // defpackage.InterfaceC1878Qv0
    public final void b(@Nullable String str) {
        BP1 bp1 = this.a;
        bp1.a = str;
        Iterator it = bp1.c.iterator();
        while (it.hasNext()) {
            ((AbstractC4609j81) it.next()).i(str);
        }
    }

    @Override // defpackage.InterfaceC1878Qv0
    public final void c(@NotNull C1252Iv0 identity, @NotNull EnumC2532Yv0 updateType) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        if (updateType == EnumC2532Yv0.d) {
            String str = identity.a;
            BP1 bp1 = this.a;
            bp1.a = str;
            ArrayList arrayList = bp1.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC4609j81) it.next()).i(str);
            }
            String str2 = identity.b;
            bp1.b = str2;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC4609j81) it2.next()).h(str2);
            }
        }
    }
}
