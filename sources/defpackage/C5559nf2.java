package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5559nf2 implements InterfaceC5136lf2 {

    @NotNull
    public final InterfaceC5979pf2 a;

    @NotNull
    public final InterfaceC1131Hh b;

    public C5559nf2(@NotNull InterfaceC5979pf2 resourceProvider, @NotNull InterfaceC1131Hh appDataRepository) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = resourceProvider;
        this.b = appDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC5136lf2
    @Nullable
    public final Serializable a(@NotNull LM lm) {
        C5349mf2 c5349mf2;
        C5559nf2 c5559nf2;
        if (lm instanceof C5349mf2) {
            c5349mf2 = (C5349mf2) lm;
            int i = c5349mf2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5349mf2.h = i - Integer.MIN_VALUE;
            } else {
                c5349mf2 = new C5349mf2(this, lm);
            }
        } else {
            c5349mf2 = new C5349mf2(this, lm);
        }
        Object objF = c5349mf2.e;
        MN mn = MN.d;
        int i2 = c5349mf2.h;
        if (i2 == 0) {
            C1795Pt1.b(objF);
            c5349mf2.d = this;
            c5349mf2.h = 1;
            objF = this.b.f(c5349mf2);
            if (objF == mn) {
                return mn;
            }
            c5559nf2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5559nf2 = c5349mf2.d;
            C1795Pt1.b(objF);
        }
        C7365wG c7365wG = (C7365wG) CommonResultKt.b((CommonResult) objF);
        List<String> list = c7365wG != null ? c7365wG.a : null;
        if (list == null) {
            list = C5653o60.d;
        }
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                WE.l();
                throw null;
            }
            String str = (String) obj;
            String str2 = c5559nf2.a.b().get(i3);
            InterfaceC5979pf2 interfaceC5979pf2 = c5559nf2.a;
            List<String> listA = interfaceC5979pf2.a();
            String str3 = "";
            String str4 = String.format(str2, Arrays.copyOf(new Object[]{(i3 < 0 || i3 >= listA.size()) ? "" : listA.get(i3)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            List<String> listA2 = interfaceC5979pf2.a();
            if (i3 >= 0 && i3 < listA2.size()) {
                str3 = listA2.get(i3);
            }
            arrayList.add(new C4038gf2(i4, str4, str, str3));
            i3 = i4;
        }
        return arrayList;
    }
}
