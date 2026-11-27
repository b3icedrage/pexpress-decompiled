package defpackage;

import com.base.feature.registration.screens.captcha.CaptchaFragmentDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0636Ay implements Function1 {
    public final /* synthetic */ AbstractC1104Gy d;
    public final /* synthetic */ C1571My e;

    public /* synthetic */ C0636Ay(AbstractC1104Gy abstractC1104Gy, C1571My c1571My) {
        this.d = abstractC1104Gy;
        this.e = c1571My;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CaptchaFragmentDialog fragment = (CaptchaFragmentDialog) obj;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        AbstractC1104Gy abstractC1104Gy = this.d;
        GP1 gp1 = abstractC1104Gy.l;
        FP0 viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new AbstractC1104Gy.d(viewLifecycleOwner, gp1, null, this.e, abstractC1104Gy), 3);
        return Unit.a;
    }
}
