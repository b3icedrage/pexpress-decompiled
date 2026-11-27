package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4829kB0 implements InterfaceC4619jB0 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C4250hg0 b;

    public C4829kB0() {
        GP1 gp1I = C1589Ne.i(null);
        this.a = gp1I;
        this.b = new C4250hg0(gp1I, 0);
    }

    @Override // defpackage.InterfaceC4619jB0
    public final void a(@NotNull C3668eu bottomSheetData, int i) {
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        List<C5819ou> list = bottomSheetData.a;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        for (C5819ou c5819ou : list) {
            Integer num = c5819ou.a;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Integer num2 = c5819ou.b;
            Intrinsics.checkNotNull(num2);
            arrayList.add(new C3731fB0(iIntValue, num2.intValue(), c5819ou.c));
        }
        C5882pB0 c5882pB0 = new C5882pB0(i, arrayList);
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, c5882pB0);
    }

    @Override // defpackage.InterfaceC4619jB0
    @NotNull
    public final C4250hg0 b() {
        return this.b;
    }
}
